package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueRequest extends js.Object {
  /**
    * Optional. A description of the queue that you are creating.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The name of the queue that you are creating.
    */
  var Name: __string
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the API to create a queue, the default is on-demand.
    */
  var PricingPlan: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.PricingPlan] = js.undefined
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlanSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ReservationPlanSettings] = js.undefined
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object CreateQueueRequest {
  @scala.inline
  def apply(
    Name: __string,
    Description: __string = null,
    PricingPlan: PricingPlan = null,
    ReservationPlanSettings: ReservationPlanSettings = null,
    Tags: __mapOf__string = null
  ): CreateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (PricingPlan != null) __obj.updateDynamic("PricingPlan")(PricingPlan.asInstanceOf[js.Any])
    if (ReservationPlanSettings != null) __obj.updateDynamic("ReservationPlanSettings")(ReservationPlanSettings)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateQueueRequest]
  }
}

