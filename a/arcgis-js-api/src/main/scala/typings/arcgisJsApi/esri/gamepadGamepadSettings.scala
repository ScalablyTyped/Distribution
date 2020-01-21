package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-up`
import typings.arcgisJsApi.arcgisJsApiStrings.pan
import typings.arcgisJsApi.arcgisJsApiStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gamepadGamepadSettings extends Accessor {
  /**
    * Use this property to explicitly select the gamepad device for map and scene navigation. If unspecified then all connected gamepads will be able to navigate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#device)
    *
    * @default null
    */
  var device: GamepadInputDevice = js.native
  /**
    * Whether gamepad navigation is enabled on the View. If this is enabled, but no `device` is specified, the first supported one will be selected automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#enabled)
    *
    * @default true
    */
  var enabled: Boolean = js.native
  /**
    * This setting controls the behavior of forward and back movement of the left stick. If set to `pan`, movement will be at a constant altitude (panning the view forward and backward) whereas `zoom` will move the view in the viewing direction. Pan is best suited for exploring a scene as if on foot or in a car. Zoom mode provides great control to navigate the scene similar to a flight simulator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#mode)
    *
    * @default pan
    */
  var mode: pan | zoom = js.native
  /**
    * Determines whether pressing the tilt axis forwards make the view tilt down (towards the nadir), or up (towards the zenith). The default behavior is to tilt the view down when pressing the stick that controls tilt forwards.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#tiltDirection)
    *
    * @default forward-down
    */
  var tiltDirection: `forward-down` | `forward-up` = js.native
}

@JSGlobal("__esri.gamepadGamepadSettings")
@js.native
object gamepadGamepadSettings extends TopLevel[gamepadGamepadSettingsConstructor]

