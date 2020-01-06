package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.native
  /**
    * The name you gave to the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
}

object CreateBillingGroupResponse {
  @scala.inline
  def apply(
    billingGroupArn: BillingGroupArn = null,
    billingGroupId: BillingGroupId = null,
    billingGroupName: BillingGroupName = null
  ): CreateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (billingGroupArn != null) __obj.updateDynamic("billingGroupArn")(billingGroupArn.asInstanceOf[js.Any])
    if (billingGroupId != null) __obj.updateDynamic("billingGroupId")(billingGroupId.asInstanceOf[js.Any])
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupResponse]
  }
}

