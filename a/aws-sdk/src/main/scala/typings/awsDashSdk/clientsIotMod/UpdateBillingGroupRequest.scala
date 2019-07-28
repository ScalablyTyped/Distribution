package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: BillingGroupProperties
  /**
    * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the UpdateBillingGroup request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
}

object UpdateBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupName: BillingGroupName,
    billingGroupProperties: BillingGroupProperties,
    expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  ): UpdateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName, billingGroupProperties = billingGroupProperties)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    __obj.asInstanceOf[UpdateBillingGroupRequest]
  }
}

