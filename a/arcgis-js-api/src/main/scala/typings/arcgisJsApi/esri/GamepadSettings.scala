package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadSettings extends Accessor {
  /**
    * A readonly collection of all gamepads detected. Can be watched for gamepads to be connected or disconnected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html#devices)
    */
  val devices: Collection[GamepadInputDevice] = js.native
  /**
    * Determines what focus is required for gamepad events to be dispatched.
    *
    * Possible Value | Description
    * ---------------|------------
    * document | Gamepad events are emitted when any part of the current webpage has focus. This allows for gamepad events being emitted even while a UI element is focused.
    * view | Gamepad events are emitted when the view [container element](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#container) has browser focus. This is useful when multiple views might be present on a single webpage.
    * none | Gamepad events are emitted independently of focus.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html#enabledFocusMode)
    *
    * @default document
    */
  var enabledFocusMode: document | view | none = js.native
}

