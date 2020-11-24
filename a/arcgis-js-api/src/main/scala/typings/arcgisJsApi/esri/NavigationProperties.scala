package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationProperties extends js.Object {
  
  /**
    * Indicates if single finger touch [drag](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#event-drag) events are enabled or disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#browserTouchPanEnabled)
    */
  var browserTouchPanEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gamepad navigation specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#gamepad)
    */
  var gamepad: js.UndefOr[gamepadGamepadSettingsProperties] = js.native
  
  /**
    * When `true`, the view will temporarily continue to pan after the pointer (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#momentumEnabled)
    */
  var momentumEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the view can be zoomed in or out with the mouse wheel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#mouseWheelZoomEnabled)
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.native
}
object NavigationProperties {
  
  @scala.inline
  def apply(): NavigationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationProperties]
  }
  
  @scala.inline
  implicit class NavigationPropertiesOps[Self <: NavigationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrowserTouchPanEnabled(value: Boolean): Self = this.set("browserTouchPanEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserTouchPanEnabled: Self = this.set("browserTouchPanEnabled", js.undefined)
    
    @scala.inline
    def setGamepad(value: gamepadGamepadSettingsProperties): Self = this.set("gamepad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamepad: Self = this.set("gamepad", js.undefined)
    
    @scala.inline
    def setMomentumEnabled(value: Boolean): Self = this.set("momentumEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMomentumEnabled: Self = this.set("momentumEnabled", js.undefined)
    
    @scala.inline
    def setMouseWheelZoomEnabled(value: Boolean): Self = this.set("mouseWheelZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelZoomEnabled: Self = this.set("mouseWheelZoomEnabled", js.undefined)
  }
}
