package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var NotifyDelayAfter: js.UndefOr[NotifyDelayAfter] = js.undefined
}

object NotificationProperty {
  @scala.inline
  def apply(NotifyDelayAfter: js.UndefOr[NotifyDelayAfter] = js.undefined): NotificationProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NotifyDelayAfter)) __obj.updateDynamic("NotifyDelayAfter")(NotifyDelayAfter)
    __obj.asInstanceOf[NotificationProperty]
  }
}

