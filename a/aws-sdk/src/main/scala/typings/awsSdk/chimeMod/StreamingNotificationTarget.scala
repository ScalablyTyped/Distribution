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
}

