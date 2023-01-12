package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditingInfo extends StObject {
  
  /**
    * Indicates the last time the layer was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditingInfo)
    */
  var lastEditDate: js.Date
}
object EditingInfo {
  
  inline def apply(lastEditDate: js.Date): EditingInfo = {
    val __obj = js.Dynamic.literal(lastEditDate = lastEditDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditingInfo] (val x: Self) extends AnyVal {
    
    inline def setLastEditDate(value: js.Date): Self = StObject.set(x, "lastEditDate", value.asInstanceOf[js.Any])
  }
}
