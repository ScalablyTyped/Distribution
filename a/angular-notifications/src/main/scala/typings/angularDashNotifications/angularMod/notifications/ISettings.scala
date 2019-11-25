package typings.angularDashNotifications.angularMod.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var custom: IAnimation
  var details: Boolean
  var error: IAnimation
  var html5DefaultIcon: String
  var html5Mode: Boolean
  var info: IAnimation
  var localStorage: Boolean
  var progress: IAnimation
  var success: IAnimation
  var warning: IAnimation
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
}

