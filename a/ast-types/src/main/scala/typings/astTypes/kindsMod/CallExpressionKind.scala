package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.CallExpression
  - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
*/
trait CallExpressionKind extends StObject
object CallExpressionKind {
  
  inline def CallExpression(arguments: js.Array[ExpressionKind | SpreadElementKind], callee: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CallExpression]
  }
  
  inline def OptionalCallExpression(arguments: js.Array[ExpressionKind | SpreadElementKind], callee: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  }
}
