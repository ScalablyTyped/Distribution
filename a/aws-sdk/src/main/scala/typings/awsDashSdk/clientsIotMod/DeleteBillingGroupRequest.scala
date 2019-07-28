package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName
  /**
    * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the DeleteBillingGroup request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
}

object DeleteBillingGroupRequest {
  @scala.inline
  def apply(billingGroupName: BillingGroupName, expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    __obj.asInstanceOf[DeleteBillingGroupRequest]
  }
}

