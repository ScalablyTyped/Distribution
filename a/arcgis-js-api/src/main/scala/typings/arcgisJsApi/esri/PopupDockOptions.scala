package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupDockOptions extends StObject {
  
  /**
  		 * Defines the dimensions of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which to dock the popup.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
  		 */
  var breakpoint: js.UndefOr[Boolean | PopupDockOptionsBreakpoint] = js.undefined
  
  /**
  		 * If `true`, displays the dock button.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
  		 */
  var buttonEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The position in the view at which to dock the popup.
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
  		 */
  var position: js.UndefOr[String | js.Function] = js.undefined
}
object PopupDockOptions {
  
  inline def apply(): PopupDockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupDockOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupDockOptions] (val x: Self) extends AnyVal {
    
    inline def setBreakpoint(value: Boolean | PopupDockOptionsBreakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
    
    inline def setButtonEnabled(value: Boolean): Self = StObject.set(x, "buttonEnabled", value.asInstanceOf[js.Any])
    
    inline def setButtonEnabledUndefined: Self = StObject.set(x, "buttonEnabled", js.undefined)
    
    inline def setPosition(value: String | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
