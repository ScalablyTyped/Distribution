package typings.angularDashNotifications.angularMod.notificationsNs

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
    val __obj = js.Dynamic.literal(custom = custom, details = details, error = error, html5DefaultIcon = html5DefaultIcon, html5Mode = html5Mode, info = info, localStorage = localStorage, progress = progress, success = success, warning = warning)
  
    __obj.asInstanceOf[ISettings]
  }
}

