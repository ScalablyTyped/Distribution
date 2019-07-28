package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddThingToBillingGroupRequest extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  /**
    * The ARN of the thing to be added to the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The name of the thing to be added to the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object AddThingToBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupArn: BillingGroupArn = null,
    billingGroupName: BillingGroupName = null,
    thingArn: ThingArn = null,
    thingName: ThingName = null
  ): AddThingToBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (billingGroupArn != null) __obj.updateDynamic("billingGroupArn")(billingGroupArn)
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName)
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[AddThingToBillingGroupRequest]
  }
}

