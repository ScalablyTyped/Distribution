package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`unary-expression`
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * The sql node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#UnaryNode)
    */
  var expr: SQLNode
  
  var `type`: `unary-expression`
}
object UnaryNode {
  
  inline def apply(
    constructor: js.Function,
    expr: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): UnaryNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("unary-expression")
    __obj.asInstanceOf[UnaryNode]
  }
  
  extension [Self <: UnaryNode](x: Self) {
    
    inline def setExpr(value: SQLNode): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setType(value: `unary-expression`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
