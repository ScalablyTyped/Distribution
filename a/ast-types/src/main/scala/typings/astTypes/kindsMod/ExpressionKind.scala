package typings.astTypes.kindsMod

import typings.astTypes.astTypesStrings.Ampersand
import typings.astTypes.astTypesStrings.AmpersandAmpersand
import typings.astTypes.astTypesStrings.AmpersandEqualssign
import typings.astTypes.astTypesStrings.Asterisk
import typings.astTypes.astTypesStrings.AsteriskAsterisk
import typings.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
import typings.astTypes.astTypesStrings.AsteriskEqualssign
import typings.astTypes.astTypesStrings.Equalssign
import typings.astTypes.astTypesStrings.EqualssignEqualssign
import typings.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typings.astTypes.astTypesStrings.Exclamationmark
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.astTypes.astTypesStrings.Greaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.astTypes.astTypesStrings.Lessthansign
import typings.astTypes.astTypesStrings.LessthansignEqualssign
import typings.astTypes.astTypesStrings.LessthansignLessthansign
import typings.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typings.astTypes.astTypesStrings.Percentsign
import typings.astTypes.astTypesStrings.PercentsignEqualssign
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.PlussignEqualssign
import typings.astTypes.astTypesStrings.PlussignPlussign
import typings.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typings.astTypes.astTypesStrings.Slash
import typings.astTypes.astTypesStrings.SlashEqualssign
import typings.astTypes.astTypesStrings.Tilde
import typings.astTypes.astTypesStrings.Verticalline
import typings.astTypes.astTypesStrings.VerticallineEqualssign
import typings.astTypes.astTypesStrings.VerticallineVerticalline
import typings.astTypes.astTypesStrings.^
import typings.astTypes.astTypesStrings.`--`
import typings.astTypes.astTypesStrings.`-Equalssign`
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.`^Equalssign`
import typings.astTypes.astTypesStrings.delete
import typings.astTypes.astTypesStrings.in
import typings.astTypes.astTypesStrings.instanceof
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.Identifier
  - typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typings.astTypes.namedTypesMod.namedTypes.ThisExpression
  - typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
  - typings.astTypes.namedTypesMod.namedTypes.ObjectExpression
  - typings.astTypes.namedTypesMod.namedTypes.Literal
  - typings.astTypes.namedTypesMod.namedTypes.SequenceExpression
  - typings.astTypes.namedTypesMod.namedTypes.UnaryExpression
  - typings.astTypes.namedTypesMod.namedTypes.BinaryExpression
  - typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression
  - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
  - typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
  - typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
  - typings.astTypes.namedTypesMod.namedTypes.NewExpression
  - typings.astTypes.namedTypesMod.namedTypes.CallExpression
  - typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typings.astTypes.namedTypesMod.namedTypes.YieldExpression
  - typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression
  - typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
  - typings.astTypes.namedTypesMod.namedTypes.ClassExpression
  - typings.astTypes.namedTypesMod.namedTypes.Super
  - typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
  - typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral
  - typings.astTypes.namedTypesMod.namedTypes.MetaProperty
  - typings.astTypes.namedTypesMod.namedTypes.AwaitExpression
  - typings.astTypes.namedTypesMod.namedTypes.ImportExpression
  - typings.astTypes.namedTypesMod.namedTypes.ChainExpression
  - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
  - typings.astTypes.namedTypesMod.namedTypes.JSXElement
  - typings.astTypes.namedTypesMod.namedTypes.JSXFragment
  - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.JSXText
  - typings.astTypes.namedTypesMod.namedTypes.PrivateName
  - typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression
  - typings.astTypes.namedTypesMod.namedTypes.DoExpression
  - typings.astTypes.namedTypesMod.namedTypes.BindExpression
  - typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
  - typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
  - typings.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typings.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  - typings.astTypes.namedTypesMod.namedTypes.Import
  - typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
*/
trait ExpressionKind extends StObject
object ExpressionKind {
  
  inline def ArrayExpression(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): typings.astTypes.namedTypesMod.namedTypes.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  }
  
  inline def ArrowFunctionExpression(body: BlockStatementKind | ExpressionKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  inline def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind
  ): typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  }
  
  inline def AwaitExpression(): typings.astTypes.namedTypesMod.namedTypes.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  }
  
  inline def BigIntLiteral(value: String | Double): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  inline def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | ^ | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind
  ): typings.astTypes.namedTypesMod.namedTypes.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  }
  
  inline def BindExpression(callee: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.updateDynamic("object")(null)
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BindExpression]
  }
  
  inline def BooleanLiteral(value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[ExpressionKind | SpreadElementKind], callee: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CallExpression]
  }
  
  inline def ChainExpression(expression: ChainElementKind): typings.astTypes.namedTypesMod.namedTypes.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChainExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ChainExpression]
  }
  
  inline def ClassExpression(body: ClassBodyKind): typings.astTypes.namedTypesMod.namedTypes.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassExpression]
  }
  
  inline def ComprehensionExpression(blocks: js.Array[ComprehensionBlockKind], body: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = null)
    __obj.updateDynamic("type")("ComprehensionExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  }
  
  inline def ConditionalExpression(alternate: ExpressionKind, consequent: ExpressionKind, test: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  }
  
  inline def DirectiveLiteral(): typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  }
  
  inline def DoExpression(body: js.Array[StatementKind]): typings.astTypes.namedTypesMod.namedTypes.DoExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DoExpression]
  }
  
  inline def FunctionExpression(body: BlockStatementKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  inline def GeneratorExpression(blocks: js.Array[ComprehensionBlockKind], body: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = null)
    __obj.updateDynamic("type")("GeneratorExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  }
  
  inline def Identifier(name: String): typings.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  inline def Import(): typings.astTypes.namedTypesMod.namedTypes.Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Import]
  }
  
  inline def ImportExpression(source: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportExpression]
  }
  
  inline def JSXElement(openingElement: JSXOpeningElementKind): typings.astTypes.namedTypesMod.namedTypes.JSXElement = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXElement]
  }
  
  inline def JSXExpressionContainer(expression: ExpressionKind | JSXEmptyExpressionKind): typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  }
  
  inline def JSXFragment(closingFragment: JSXClosingFragmentKind, openingFragment: JSXOpeningFragmentKind): typings.astTypes.namedTypesMod.namedTypes.JSXFragment = {
    val __obj = js.Dynamic.literal(closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXFragment]
  }
  
  inline def JSXIdentifier(name: String): typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  inline def JSXMemberExpression(`object`: JSXIdentifierKind | JSXMemberExpressionKind, property: JSXIdentifierKind): typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  }
  
  inline def JSXText(value: String): typings.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  inline def Literal(): typings.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  inline def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind
  ): typings.astTypes.namedTypesMod.namedTypes.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  }
  
  inline def MemberExpression(`object`: ExpressionKind, property: IdentifierKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberExpression]
  }
  
  inline def MetaProperty(meta: IdentifierKind, property: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MetaProperty]
  }
  
  inline def NewExpression(arguments: js.Array[ExpressionKind | SpreadElementKind], callee: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NewExpression]
  }
  
  inline def NullLiteral(): typings.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  inline def NumericLiteral(value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  inline def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  }
  
  inline def OptionalCallExpression(arguments: js.Array[ExpressionKind | SpreadElementKind], callee: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  }
  
  inline def OptionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  }
  
  inline def ParenthesizedExpression(expression: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  }
  
  inline def PrivateName(id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String): typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  inline def SequenceExpression(expressions: js.Array[ExpressionKind]): typings.astTypes.namedTypesMod.namedTypes.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  }
  
  inline def StringLiteral(value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
  
  inline def Super(): typings.astTypes.namedTypesMod.namedTypes.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Super]
  }
  
  inline def TSAsExpression(expression: ExpressionKind, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  inline def TSNonNullExpression(expression: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  inline def TSTypeAssertion(expression: ExpressionKind, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  inline def TSTypeParameter(name: String): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
  
  inline def TaggedTemplateExpression(quasi: TemplateLiteralKind, tag: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  }
  
  inline def TemplateLiteral(expressions: js.Array[ExpressionKind], quasis: js.Array[TemplateElementKind]): typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  }
  
  inline def ThisExpression(): typings.astTypes.namedTypesMod.namedTypes.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThisExpression]
  }
  
  inline def TypeCastExpression(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  }
  
  inline def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  ): typings.astTypes.namedTypesMod.namedTypes.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  }
  
  inline def UpdateExpression(argument: ExpressionKind, operator: PlussignPlussign | `--`, prefix: Boolean): typings.astTypes.namedTypesMod.namedTypes.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  }
  
  inline def YieldExpression(): typings.astTypes.namedTypesMod.namedTypes.YieldExpression = {
    val __obj = js.Dynamic.literal(argument = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.YieldExpression]
  }
}
