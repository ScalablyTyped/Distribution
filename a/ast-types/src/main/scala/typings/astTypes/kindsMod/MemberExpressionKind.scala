package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
*/
trait MemberExpressionKind extends StObject
object MemberExpressionKind {
  
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
}
