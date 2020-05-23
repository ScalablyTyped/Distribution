package typings.antd.anon

import typings.rcNotification.notificationMod.NotificationInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var instance: NotificationInstance
  var prefixCls: String
}

object Instance {
  @scala.inline
  def apply(instance: NotificationInstance, prefixCls: String): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

