package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoolNode
  extends StObject
     with SQLNode {
  
  var `type`: boolean
  
  /**
  		 * Values are `true` or `false`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BoolNode)
  		 */
  var value: Boolean
}
object BoolNode {
  
  inline def apply(value: Boolean): BoolNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BoolNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoolNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
