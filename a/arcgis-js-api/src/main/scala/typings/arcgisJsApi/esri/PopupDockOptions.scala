package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupDockOptions
  extends StObject
     with Object {
  
  /**
    * Defines the dimensions of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which to dock the popup.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var position: js.UndefOr[String | js.Function] = js.undefined
}
object PopupDockOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupDockOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupDockOptions]
  }
  
  extension [Self <: PopupDockOptions](x: Self) {
    
    inline def setBreakpoint(value: Boolean | PopupDockOptionsBreakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
    
    inline def setButtonEnabled(value: Boolean): Self = StObject.set(x, "buttonEnabled", value.asInstanceOf[js.Any])
    
    inline def setButtonEnabledUndefined: Self = StObject.set(x, "buttonEnabled", js.undefined)
    
    inline def setPosition(value: String | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
