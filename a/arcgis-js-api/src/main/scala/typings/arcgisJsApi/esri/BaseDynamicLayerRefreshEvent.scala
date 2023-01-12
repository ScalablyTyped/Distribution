package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDynamicLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object BaseDynamicLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): BaseDynamicLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDynamicLayerRefreshEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDynamicLayerRefreshEvent] (val x: Self) extends AnyVal {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
