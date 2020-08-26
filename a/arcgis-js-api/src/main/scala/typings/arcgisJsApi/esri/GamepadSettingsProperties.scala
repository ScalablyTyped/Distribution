package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var enabledFocusMode: js.UndefOr[document | view | none] = js.native
}

object GamepadSettingsProperties {
  @scala.inline
  def apply(): GamepadSettingsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamepadSettingsProperties]
  }
  @scala.inline
  implicit class GamepadSettingsPropertiesOps[Self <: GamepadSettingsProperties] (val x: Self) extends AnyVal {
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
    def setEnabledFocusMode(value: document | view | none): Self = this.set("enabledFocusMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledFocusMode: Self = this.set("enabledFocusMode", js.undefined)
  }
  
}

