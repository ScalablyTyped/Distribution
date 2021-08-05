package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
*/
trait MemberExpressionKind extends StObject
object MemberExpressionKind {
  
  inline def JSXMemberExpression(`object`: JSXIdentifierKind | JSXMemberExpressionKind, property: JSXIdentifierKind): typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  }
  
  inline def MemberExpression(`object`: ExpressionKind, property: IdentifierKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberExpression]
  }
  
  inline def OptionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  }
}
