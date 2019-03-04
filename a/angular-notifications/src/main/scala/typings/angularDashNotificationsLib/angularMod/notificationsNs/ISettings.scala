package typings
package angularDashNotificationsLib.angularMod.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var custom: IAnimation
  var details: scala.Boolean
  var error: IAnimation
  var html5DefaultIcon: java.lang.String
  var html5Mode: scala.Boolean
  var info: IAnimation
  var localStorage: scala.Boolean
  var progress: IAnimation
  var success: IAnimation
  var warning: IAnimation
}

object ISettings {
  @scala.inline
  def apply(
    custom: IAnimation,
    details: scala.Boolean,
    error: IAnimation,
    html5DefaultIcon: java.lang.String,
    html5Mode: scala.Boolean,
    info: IAnimation,
    localStorage: scala.Boolean,
    progress: IAnimation,
    success: IAnimation,
    warning: IAnimation
  ): ISettings = {
    val __obj = js.Dynamic.literal(custom = custom, details = details, error = error, html5DefaultIcon = html5DefaultIcon, html5Mode = html5Mode, info = info, localStorage = localStorage, progress = progress, success = success, warning = warning)
  
    __obj.asInstanceOf[ISettings]
  }
}

