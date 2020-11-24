package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`forward-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-up`
import typings.arcgisJsApi.arcgisJsApiStrings.pan
import typings.arcgisJsApi.arcgisJsApiStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gamepadGamepadSettingsProperties extends js.Object {
  
  /**
    * Use this property to explicitly select the gamepad device for map and scene navigation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#device)
    */
  var device: js.UndefOr[GamepadInputDeviceProperties] = js.native
  
  /**
    * Whether gamepad navigation is enabled on the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * This setting controls the behavior of forward and back movement of the left stick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#mode)
    */
  var mode: js.UndefOr[pan | zoom] = js.native
  
  /**
    * Determines whether pressing the tilt axis forwards make the view tilt down (towards the nadir), or up (towards the zenith).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#tiltDirection)
    */
  var tiltDirection: js.UndefOr[`forward-down` | `forward-up`] = js.native
}
object gamepadGamepadSettingsProperties {
  
  @scala.inline
  def apply(): gamepadGamepadSettingsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gamepadGamepadSettingsProperties]
  }
  
  @scala.inline
  implicit class gamepadGamepadSettingsPropertiesOps[Self <: gamepadGamepadSettingsProperties] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: GamepadInputDeviceProperties): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMode(value: pan | zoom): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTiltDirection(value: `forward-down` | `forward-up`): Self = this.set("tiltDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiltDirection: Self = this.set("tiltDirection", js.undefined)
  }
}
