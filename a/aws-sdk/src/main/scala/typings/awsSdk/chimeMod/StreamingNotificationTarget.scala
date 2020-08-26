package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingNotificationTarget extends js.Object {
  /**
    * The streaming notification target.
    */
  var NotificationTarget: typings.awsSdk.chimeMod.NotificationTarget = js.native
}

object StreamingNotificationTarget {
  @scala.inline
  def apply(NotificationTarget: NotificationTarget): StreamingNotificationTarget = {
    val __obj = js.Dynamic.literal(NotificationTarget = NotificationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingNotificationTarget]
  }
  @scala.inline
  implicit class StreamingNotificationTargetOps[Self <: StreamingNotificationTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotificationTarget(value: NotificationTarget): Self = this.set("NotificationTarget", value.asInstanceOf[js.Any])
  }
  
}

