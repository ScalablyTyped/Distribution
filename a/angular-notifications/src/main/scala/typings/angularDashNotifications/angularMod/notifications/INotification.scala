package typings.angularDashNotifications.angularMod.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  var content: String
  var icon: String
  var image: String
  var timestamp: String
  var title: String
  var `type`: String
  var userData: String
}

object INotification {
  @scala.inline
  def apply(
    content: String,
    icon: String,
    image: String,
    timestamp: String,
    title: String,
    `type`: String,
    userData: String
  ): INotification = {
    val __obj = js.Dynamic.literal(content = content, icon = icon, image = image, timestamp = timestamp, title = title, userData = userData)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[INotification]
  }
}

