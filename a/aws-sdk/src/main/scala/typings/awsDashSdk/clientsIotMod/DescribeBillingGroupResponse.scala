package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.native
  /**
    * Additional information about the billing group.
    */
  var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.native
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.native
  /**
    * The version of the billing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeBillingGroupResponse {
  @scala.inline
  def apply(
    billingGroupArn: BillingGroupArn = null,
    billingGroupId: BillingGroupId = null,
    billingGroupMetadata: BillingGroupMetadata = null,
    billingGroupName: BillingGroupName = null,
    billingGroupProperties: BillingGroupProperties = null,
    version: Int | Double = null
  ): DescribeBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (billingGroupArn != null) __obj.updateDynamic("billingGroupArn")(billingGroupArn.asInstanceOf[js.Any])
    if (billingGroupId != null) __obj.updateDynamic("billingGroupId")(billingGroupId.asInstanceOf[js.Any])
    if (billingGroupMetadata != null) __obj.updateDynamic("billingGroupMetadata")(billingGroupMetadata.asInstanceOf[js.Any])
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName.asInstanceOf[js.Any])
    if (billingGroupProperties != null) __obj.updateDynamic("billingGroupProperties")(billingGroupProperties.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBillingGroupResponse]
  }
}

