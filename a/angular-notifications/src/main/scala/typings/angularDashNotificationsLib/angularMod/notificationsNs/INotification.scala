package typings
package angularDashNotificationsLib.angularMod.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  var content: java.lang.String
  var icon: java.lang.String
  var image: java.lang.String
  var timestamp: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
  var userData: java.lang.String
}

object INotification {
  @scala.inline
  def apply(
    content: java.lang.String,
    icon: java.lang.String,
    image: java.lang.String,
    timestamp: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    userData: java.lang.String
  ): INotification = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[INotification]
  }
}

