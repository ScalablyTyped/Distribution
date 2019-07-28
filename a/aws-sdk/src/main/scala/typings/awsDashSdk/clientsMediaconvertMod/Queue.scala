package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The timestamp in epoch seconds for when you created the queue.
    */
  var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * An optional description that you create for each queue.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The timestamp in epoch seconds for when you most recently updated the queue.
    */
  var LastUpdated: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * A name that you create for each queue. Each name must be unique within your account.
    */
  var Name: __string
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
    */
  var PricingPlan: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.PricingPlan] = js.undefined
  /**
    * The estimated number of jobs with a PROGRESSING status.
    */
  var ProgressingJobsCount: js.UndefOr[__integer] = js.undefined
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlan: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ReservationPlan] = js.undefined
  /**
    * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.undefined
  /**
    * The estimated number of jobs with a SUBMITTED status.
    */
  var SubmittedJobsCount: js.UndefOr[__integer] = js.undefined
  /**
    * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or delete system queues. You can create and modify custom queues.
    */
  var Type: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Type] = js.undefined
}

object Queue {
  @scala.inline
  def apply(
    Name: __string,
    Arn: __string = null,
    CreatedAt: __timestampUnix = null,
    Description: __string = null,
    LastUpdated: __timestampUnix = null,
    PricingPlan: PricingPlan = null,
    ProgressingJobsCount: js.UndefOr[__integer] = js.undefined,
    ReservationPlan: ReservationPlan = null,
    Status: QueueStatus = null,
    SubmittedJobsCount: js.UndefOr[__integer] = js.undefined,
    Type: Type = null
  ): Queue = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (PricingPlan != null) __obj.updateDynamic("PricingPlan")(PricingPlan.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgressingJobsCount)) __obj.updateDynamic("ProgressingJobsCount")(ProgressingJobsCount)
    if (ReservationPlan != null) __obj.updateDynamic("ReservationPlan")(ReservationPlan)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(SubmittedJobsCount)) __obj.updateDynamic("SubmittedJobsCount")(SubmittedJobsCount)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
}

