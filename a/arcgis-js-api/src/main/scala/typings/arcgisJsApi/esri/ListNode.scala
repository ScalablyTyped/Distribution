package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`expression-list`
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * SQL expression for the list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#ListNode)
    */
  var expr: SQLNode
  
  var `type`: `expression-list`
}
object ListNode {
  
  inline def apply(
    constructor: js.Function,
    expr: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ListNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("expression-list")
    __obj.asInstanceOf[ListNode]
  }
  
  extension [Self <: ListNode](x: Self) {
    
    inline def setExpr(value: SQLNode): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setType(value: `expression-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
