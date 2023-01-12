package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateNode
  extends StObject
     with SQLNode {
  
  var `type`: date
  
  /**
    * The date value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#DateNode)
    */
  var value: String
}
object DateNode {
  
  inline def apply(value: String): DateNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[DateNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
