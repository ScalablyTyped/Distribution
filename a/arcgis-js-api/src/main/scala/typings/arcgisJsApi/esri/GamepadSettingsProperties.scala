package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadSettingsProperties extends js.Object {
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
  var enabledFocusMode: js.UndefOr[document | view | none] = js.undefined
}

object GamepadSettingsProperties {
  @scala.inline
  def apply(enabledFocusMode: document | view | none = null): GamepadSettingsProperties = {
    val __obj = js.Dynamic.literal()
    if (enabledFocusMode != null) __obj.updateDynamic("enabledFocusMode")(enabledFocusMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadSettingsProperties]
  }
}

