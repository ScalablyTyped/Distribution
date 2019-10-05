package typings.angularDashXeditable.angularMod.xeditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableOptions extends js.Object {
  /**
    * How input elements get activated. Possible values: `focus|select|none`.
    */
  var activate: String
  /*
    * Event, on which the edit mode gets activated.
    * Can be any event.
    */
  var activationEvent: String
  /**
    * Default value for `blur` attribute of single editable element.
    * Can be `cancel|submit|ignore`.
    */
  var blurElem: String
  /**
    * Default value for `blur` attribute of editable form.
    * Can be `cancel|submit|ignore`.
    */
  var blurForm: String
  /**
    * Whether to show buttons for single editalbe element.
    * Possible values `right` (default), `no`.
    */
  var buttons: String
  /**
    * Icon Set. Possible values `font-awesome`, `default`.
    */
  var icon_set: String
  /**
    * Whether to disable x-editable. Can be overloaded on each element.
    */
  var isDisabled: Boolean
  /**
    * Theme. Possible values `bs3`, `bs2`, `default`
    */
  var theme: String
}

object IEditableOptions {
  @scala.inline
  def apply(
    activate: String,
    activationEvent: String,
    blurElem: String,
    blurForm: String,
    buttons: String,
    icon_set: String,
    isDisabled: Boolean,
    theme: String
  ): IEditableOptions = {
    val __obj = js.Dynamic.literal(activate = activate, activationEvent = activationEvent, blurElem = blurElem, blurForm = blurForm, buttons = buttons, icon_set = icon_set, isDisabled = isDisabled, theme = theme)
  
    __obj.asInstanceOf[IEditableOptions]
  }
}

