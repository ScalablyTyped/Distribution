package typings.angularXeditable.mod.xeditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableOptions extends js.Object {
  /**
    * How input elements get activated. Possible values: `focus|select|none`.
    */
  var activate: String = js.native
  /*
    * Event, on which the edit mode gets activated.
    * Can be any event.
    */
  var activationEvent: String = js.native
  /**
    * Default value for `blur` attribute of single editable element.
    * Can be `cancel|submit|ignore`.
    */
  var blurElem: String = js.native
  /**
    * Default value for `blur` attribute of editable form.
    * Can be `cancel|submit|ignore`.
    */
  var blurForm: String = js.native
  /**
    * Whether to show buttons for single editalbe element.
    * Possible values `right` (default), `no`.
    */
  var buttons: String = js.native
  /**
    * Icon Set. Possible values `font-awesome`, `default`.
    */
  var icon_set: String = js.native
  /**
    * Whether to disable x-editable. Can be overloaded on each element.
    */
  var isDisabled: Boolean = js.native
  /**
    * Theme. Possible values `bs3`, `bs2`, `default`
    */
  var theme: String = js.native
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
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], activationEvent = activationEvent.asInstanceOf[js.Any], blurElem = blurElem.asInstanceOf[js.Any], blurForm = blurForm.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], icon_set = icon_set.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditableOptions]
  }
  @scala.inline
  implicit class IEditableOptionsOps[Self <: IEditableOptions] (val x: Self) extends AnyVal {
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
    def setActivate(value: String): Self = this.set("activate", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivationEvent(value: String): Self = this.set("activationEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurElem(value: String): Self = this.set("blurElem", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurForm(value: String): Self = this.set("blurForm", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtons(value: String): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_set(value: String): Self = this.set("icon_set", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

