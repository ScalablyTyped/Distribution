package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`when-clause`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenNode
  extends StObject
     with SQLNode {
  
  /**
  		 * operand.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#WhenNode)
  		 */
  var operand: SQLNode
  
  var `type`: `when-clause`
  
  /**
  		 * value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#WhenNode)
  		 */
  var value: SQLNode
}
object WhenNode {
  
  inline def apply(operand: SQLNode, value: SQLNode): WhenNode = {
    val __obj = js.Dynamic.literal(operand = operand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("when-clause")
    __obj.asInstanceOf[WhenNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhenNode] (val x: Self) extends AnyVal {
    
    inline def setOperand(value: SQLNode): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    inline def setType(value: `when-clause`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SQLNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
