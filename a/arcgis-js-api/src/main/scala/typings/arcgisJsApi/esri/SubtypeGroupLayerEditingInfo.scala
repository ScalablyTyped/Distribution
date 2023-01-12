package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerEditingInfo extends StObject {
  
  /**
    * Indicates the last time the layer was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#EditingInfo)
    */
  var lastEditDate: js.Date
}
object SubtypeGroupLayerEditingInfo {
  
  inline def apply(lastEditDate: js.Date): SubtypeGroupLayerEditingInfo = {
    val __obj = js.Dynamic.literal(lastEditDate = lastEditDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerEditingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerEditingInfo] (val x: Self) extends AnyVal {
    
    inline def setLastEditDate(value: js.Date): Self = StObject.set(x, "lastEditDate", value.asInstanceOf[js.Any])
  }
}
