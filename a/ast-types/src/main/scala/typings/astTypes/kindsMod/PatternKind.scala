package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.Identifier
  - typings.astTypes.namedTypesMod.namedTypes.RestElement
  - typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
  - typings.astTypes.namedTypesMod.namedTypes.PropertyPattern
  - typings.astTypes.namedTypesMod.namedTypes.ObjectPattern
  - typings.astTypes.namedTypesMod.namedTypes.ArrayPattern
  - typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
  - typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
  - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typings.astTypes.namedTypesMod.namedTypes.PrivateName
  - typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  - typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
*/
trait PatternKind extends StObject
object PatternKind {
  
  @scala.inline
  def ArrayPattern(elements: js.Array[PatternKind | SpreadElementKind | Null]): typings.astTypes.namedTypesMod.namedTypes.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  }
  
  @scala.inline
  def AssignmentPattern(left: PatternKind, right: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  }
  
  @scala.inline
  def Identifier(name: String): typings.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def JSXIdentifier(name: String): typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  @scala.inline
  def PropertyPattern(key: LiteralKind | IdentifierKind | ExpressionKind, pattern: PatternKind): typings.astTypes.namedTypesMod.namedTypes.PropertyPattern = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PropertyPattern")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  }
  
  @scala.inline
  def RestElement(argument: PatternKind): typings.astTypes.namedTypesMod.namedTypes.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RestElement]
  }
  
  @scala.inline
  def SpreadElementPattern(argument: PatternKind): typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElementPattern")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  }
  
  @scala.inline
  def SpreadPropertyPattern(argument: PatternKind): typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadPropertyPattern")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  }
  
  @scala.inline
  def TSAsExpression(expression: ExpressionKind, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  @scala.inline
  def TSParameterProperty(parameter: IdentifierKind | AssignmentPatternKind): typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  }
  
  @scala.inline
  def TSTypeAssertion(expression: ExpressionKind, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  @scala.inline
  def TSTypeParameter(name: String): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
}
