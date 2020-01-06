package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var NotifyDelayAfter: js.UndefOr[typings.awsDashSdk.clientsGlueMod.NotifyDelayAfter] = js.native
}

object NotificationProperty {
  @scala.inline
  def apply(NotifyDelayAfter: Int | Double = null): NotificationProperty = {
    val __obj = js.Dynamic.literal()
    if (NotifyDelayAfter != null) __obj.updateDynamic("NotifyDelayAfter")(NotifyDelayAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationProperty]
  }
}

