package typings.antd

import typings.rcNotification.notificationMod.NotificationInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstance extends js.Object {
  var instance: NotificationInstance
  var prefixCls: String
}

object AnonInstance {
  @scala.inline
  def apply(instance: NotificationInstance, prefixCls: String): AnonInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstance]
  }
}

