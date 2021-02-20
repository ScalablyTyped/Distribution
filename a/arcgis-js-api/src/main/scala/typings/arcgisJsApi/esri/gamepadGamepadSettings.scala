package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`forward-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-up`
import typings.arcgisJsApi.arcgisJsApiStrings.pan
import typings.arcgisJsApi.arcgisJsApiStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gamepadGamepadSettings extends Accessor {
  
  /**
    * Use this property to explicitly select the gamepad device for map and scene navigation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#device)
    */
  var device: GamepadInputDevice = js.native
  
  /**
    * Whether gamepad navigation is enabled on the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#enabled)
    */
  var enabled: Boolean = js.native
  
  /**
    * This setting controls the behavior of forward and back movement of the left stick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#mode)
    */
  var mode: pan | zoom = js.native
  
  /**
    * Determines whether pressing the tilt axis forwards make the view tilt down (towards the nadir), or up (towards the zenith).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#tiltDirection)
    */
  var tiltDirection: `forward-down` | `forward-up` = js.native
}
