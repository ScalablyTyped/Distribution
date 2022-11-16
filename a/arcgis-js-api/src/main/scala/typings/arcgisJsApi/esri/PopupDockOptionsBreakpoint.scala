package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupDockOptionsBreakpoint extends StObject {
  
  /**
    * The maximum height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * @default 544
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum width of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * @default 544
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PopupDockOptionsBreakpoint {
  
  inline def apply(): PopupDockOptionsBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupDockOptionsBreakpoint]
  }
  
  extension [Self <: PopupDockOptionsBreakpoint](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
