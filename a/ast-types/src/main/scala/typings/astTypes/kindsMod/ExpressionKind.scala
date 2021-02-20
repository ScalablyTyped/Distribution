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
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    `type`: typings.astTypes.astTypesStrings.ArrayExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ArrowFunctionExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.AssignmentExpression
  ): typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  }
  
  @scala.inline
  def AwaitExpression(`type`: typings.astTypes.astTypesStrings.AwaitExpression): typings.astTypes.namedTypesMod.namedTypes.AwaitExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  }
  
  @scala.inline
  def BigIntLiteral(`type`: typings.astTypes.astTypesStrings.BigIntLiteral, value: String | Double): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  @scala.inline
  def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | ^ | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.BinaryExpression
  ): typings.astTypes.namedTypesMod.namedTypes.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  }
  
  @scala.inline
  def BindExpression(callee: ExpressionKind, `type`: typings.astTypes.astTypesStrings.BindExpression): typings.astTypes.namedTypesMod.namedTypes.BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BindExpression]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typings.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.CallExpression
  ): typings.astTypes.namedTypesMod.namedTypes.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CallExpression]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElementKind, `type`: typings.astTypes.astTypesStrings.ChainExpression): typings.astTypes.namedTypesMod.namedTypes.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ChainExpression]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBodyKind, `type`: typings.astTypes.astTypesStrings.ClassExpression): typings.astTypes.namedTypesMod.namedTypes.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassExpression]
  }
  
  @scala.inline
  def ComprehensionExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ComprehensionExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ConditionalExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  }
  
  @scala.inline
  def DirectiveLiteral(`type`: typings.astTypes.astTypesStrings.DirectiveLiteral): typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  }
  
  @scala.inline
  def DoExpression(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.DoExpression): typings.astTypes.namedTypesMod.namedTypes.DoExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DoExpression]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.FunctionExpression
  ): typings.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  @scala.inline
  def GeneratorExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.GeneratorExpression
  ): typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.astTypes.astTypesStrings.Identifier): typings.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def Import(`type`: typings.astTypes.astTypesStrings.Import): typings.astTypes.namedTypesMod.namedTypes.Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Import]
  }
  
  @scala.inline
  def ImportExpression(source: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ImportExpression): typings.astTypes.namedTypesMod.namedTypes.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportExpression]
  }
  
  @scala.inline
  def JSXElement(openingElement: JSXOpeningElementKind, `type`: typings.astTypes.astTypesStrings.JSXElement): typings.astTypes.namedTypesMod.namedTypes.JSXElement = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXElement]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: ExpressionKind | JSXEmptyExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXExpressionContainer
  ): typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  }
  
  @scala.inline
  def JSXFragment(
    closingFragment: JSXClosingFragmentKind,
    openingFragment: JSXOpeningFragmentKind,
    `type`: typings.astTypes.astTypesStrings.JSXFragment
  ): typings.astTypes.namedTypesMod.namedTypes.JSXFragment = {
    val __obj = js.Dynamic.literal(closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXFragment]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typings.astTypes.astTypesStrings.JSXIdentifier): typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def JSXMemberExpression(
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.JSXMemberExpression
  ): typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  }
  
  @scala.inline
  def JSXText(`type`: typings.astTypes.astTypesStrings.JSXText, value: String): typings.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  @scala.inline
  def Literal(`type`: typings.astTypes.astTypesStrings.Literal): typings.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  @scala.inline
  def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.LogicalExpression
  ): typings.astTypes.namedTypesMod.namedTypes.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.MemberExpression
  ): typings.astTypes.namedTypesMod.namedTypes.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberExpression]
  }
  
  @scala.inline
  def MetaProperty(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.MetaProperty
  ): typings.astTypes.namedTypesMod.namedTypes.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MetaProperty]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.NewExpression
  ): typings.astTypes.namedTypesMod.namedTypes.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NewExpression]
  }
  
  @scala.inline
  def NullLiteral(`type`: typings.astTypes.astTypesStrings.NullLiteral): typings.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  @scala.inline
  def NumericLiteral(`type`: typings.astTypes.astTypesStrings.NumericLiteral, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typings.astTypes.astTypesStrings.ObjectExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  }
  
  @scala.inline
  def OptionalCallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.OptionalCallExpression
  ): typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  }
  
  @scala.inline
  def OptionalMemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.OptionalMemberExpression
  ): typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  }
  
  @scala.inline
  def ParenthesizedExpression(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ParenthesizedExpression): typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.PrivateName): typings.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  @scala.inline
  def RegExpLiteral(flags: String, pattern: String, `type`: typings.astTypes.astTypesStrings.RegExpLiteral): typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[ExpressionKind], `type`: typings.astTypes.astTypesStrings.SequenceExpression): typings.astTypes.namedTypesMod.namedTypes.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  }
  
  @scala.inline
  def StringLiteral(`type`: typings.astTypes.astTypesStrings.StringLiteral, value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
  
  @scala.inline
  def Super(`type`: typings.astTypes.astTypesStrings.Super): typings.astTypes.namedTypesMod.namedTypes.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Super]
  }
  
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSNonNullExpression): typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typings.astTypes.astTypesStrings.TSTypeParameter): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteralKind,
    tag: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TaggedTemplateExpression
  ): typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    `type`: typings.astTypes.astTypesStrings.TemplateLiteral
  ): typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(`type`: typings.astTypes.astTypesStrings.ThisExpression): typings.astTypes.namedTypesMod.namedTypes.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThisExpression]
  }
  
  @scala.inline
  def TypeCastExpression(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    `type`: typings.astTypes.astTypesStrings.UnaryExpression
  ): typings.astTypes.namedTypesMod.namedTypes.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typings.astTypes.astTypesStrings.UpdateExpression
  ): typings.astTypes.namedTypesMod.namedTypes.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  }
  
  @scala.inline
  def YieldExpression(`type`: typings.astTypes.astTypesStrings.YieldExpression): typings.astTypes.namedTypesMod.namedTypes.YieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.YieldExpression]
  }
}
