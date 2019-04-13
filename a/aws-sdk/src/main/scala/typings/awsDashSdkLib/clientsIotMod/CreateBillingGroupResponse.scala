package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
  /**
    * The name you gave to the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
}

object CreateBillingGroupResponse {
  @scala.inline
  def apply(
    billingGroupArn: BillingGroupArn = null,
    billingGroupId: BillingGroupId = null,
    billingGroupName: BillingGroupName = null
  ): CreateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (billingGroupArn != null) __obj.updateDynamic("billingGroupArn")(billingGroupArn)
    if (billingGroupId != null) __obj.updateDynamic("billingGroupId")(billingGroupId)
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName)
    __obj.asInstanceOf[CreateBillingGroupResponse]
  }
}

