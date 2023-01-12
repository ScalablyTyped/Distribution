package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageryLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object ImageryLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): ImageryLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageryLayerRefreshEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageryLayerRefreshEvent] (val x: Self) extends AnyVal {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
