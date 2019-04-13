package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQueueRequest extends js.Object {
  /**
    * The new description for the queue, if you are changing it.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The name of the queue that you are modifying.
    */
  var Name: __string
  /**
    * The new details of your pricing plan for your reserved queue. When you set up a new pricing plan to replace an expired one, you enter into another 12-month commitment. When you add capacity to your queue by increasing the number of RTS, you extend the term of your commitment to 12 months from when you add capacity. After you make these commitments, you can't cancel them.
    */
  var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined
  /**
    * Pause or activate a queue by changing its status between ACTIVE and PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.undefined
}

object UpdateQueueRequest {
  @scala.inline
  def apply(
    Name: __string,
    Description: __string = null,
    ReservationPlanSettings: ReservationPlanSettings = null,
    Status: QueueStatus = null
  ): UpdateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ReservationPlanSettings != null) __obj.updateDynamic("ReservationPlanSettings")(ReservationPlanSettings)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueRequest]
  }
}

