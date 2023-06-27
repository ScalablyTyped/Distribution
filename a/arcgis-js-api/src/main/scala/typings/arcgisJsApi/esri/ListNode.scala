package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`expression-list`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNode
  extends StObject
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
  
  inline def apply(expr: SQLNode): ListNode = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression-list")
    __obj.asInstanceOf[ListNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNode] (val x: Self) extends AnyVal {
    
    inline def setExpr(value: SQLNode): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setType(value: `expression-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
