package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationProperties extends StObject {
  
  /**
    * Indicates if single finger touch [drag](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#event-drag) events are enabled or disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#browserTouchPanEnabled)
    */
  var browserTouchPanEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gamepad navigation specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#gamepad)
    */
  var gamepad: js.UndefOr[gamepadGamepadSettingsProperties] = js.undefined
  
  /**
    * When `true`, the view will temporarily continue to pan after the pointer (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#momentumEnabled)
    */
  var momentumEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the view can be zoomed in or out with the mouse wheel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#mouseWheelZoomEnabled)
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.undefined
}
object NavigationProperties {
  
  inline def apply(): NavigationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationProperties]
  }
  
  extension [Self <: NavigationProperties](x: Self) {
    
    inline def setBrowserTouchPanEnabled(value: Boolean): Self = StObject.set(x, "browserTouchPanEnabled", value.asInstanceOf[js.Any])
    
    inline def setBrowserTouchPanEnabledUndefined: Self = StObject.set(x, "browserTouchPanEnabled", js.undefined)
    
    inline def setGamepad(value: gamepadGamepadSettingsProperties): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
    
    inline def setGamepadUndefined: Self = StObject.set(x, "gamepad", js.undefined)
    
    inline def setMomentumEnabled(value: Boolean): Self = StObject.set(x, "momentumEnabled", value.asInstanceOf[js.Any])
    
    inline def setMomentumEnabledUndefined: Self = StObject.set(x, "momentumEnabled", js.undefined)
    
    inline def setMouseWheelZoomEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelZoomEnabled", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelZoomEnabledUndefined: Self = StObject.set(x, "mouseWheelZoomEnabled", js.undefined)
  }
}
