package typings.angularNotifications.mod.notifications

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
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotification]
  }
}

