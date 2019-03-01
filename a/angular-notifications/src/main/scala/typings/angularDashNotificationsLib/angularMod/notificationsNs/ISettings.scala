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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("html5DefaultIcon")(html5DefaultIcon)
    __obj.updateDynamic("html5Mode")(html5Mode)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("localStorage")(localStorage)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[ISettings]
  }
}

