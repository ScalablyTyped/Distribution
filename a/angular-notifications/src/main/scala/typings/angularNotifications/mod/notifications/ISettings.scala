package typings.angularNotifications.mod.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettings extends js.Object {
  var custom: IAnimation = js.native
  var details: Boolean = js.native
  var error: IAnimation = js.native
  var html5DefaultIcon: String = js.native
  var html5Mode: Boolean = js.native
  var info: IAnimation = js.native
  var localStorage: Boolean = js.native
  var progress: IAnimation = js.native
  var success: IAnimation = js.native
  var warning: IAnimation = js.native
}

object ISettings {
  @scala.inline
  def apply(
    custom: IAnimation,
    details: Boolean,
    error: IAnimation,
    html5DefaultIcon: String,
    html5Mode: Boolean,
    info: IAnimation,
    localStorage: Boolean,
    progress: IAnimation,
    success: IAnimation,
    warning: IAnimation
  ): ISettings = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], html5DefaultIcon = html5DefaultIcon.asInstanceOf[js.Any], html5Mode = html5Mode.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
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
    def setCustom(value: IAnimation): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: Boolean): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: IAnimation): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml5DefaultIcon(value: String): Self = this.set("html5DefaultIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml5Mode(value: Boolean): Self = this.set("html5Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: IAnimation): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: IAnimation): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: IAnimation): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: IAnimation): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

