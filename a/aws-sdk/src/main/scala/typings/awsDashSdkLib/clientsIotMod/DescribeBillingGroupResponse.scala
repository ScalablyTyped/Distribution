package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
  /**
    * Additional information about the billing group.
    */
  var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
  /**
    * The version of the billing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object DescribeBillingGroupResponse {
  @scala.inline
  def apply(
    billingGroupArn: BillingGroupArn = null,
    billingGroupId: BillingGroupId = null,
    billingGroupMetadata: BillingGroupMetadata = null,
    billingGroupName: BillingGroupName = null,
    billingGroupProperties: BillingGroupProperties = null,
    version: js.UndefOr[Version] = js.undefined
  ): DescribeBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (billingGroupArn != null) __obj.updateDynamic("billingGroupArn")(billingGroupArn)
    if (billingGroupId != null) __obj.updateDynamic("billingGroupId")(billingGroupId)
    if (billingGroupMetadata != null) __obj.updateDynamic("billingGroupMetadata")(billingGroupMetadata)
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName)
    if (billingGroupProperties != null) __obj.updateDynamic("billingGroupProperties")(billingGroupProperties)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DescribeBillingGroupResponse]
  }
}

