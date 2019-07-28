package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelBundleTaskRequest extends js.Object {
  /**
    * The ID of the bundle task.
    */
  var BundleId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object CancelBundleTaskRequest {
  @scala.inline
  def apply(BundleId: String, DryRun: js.UndefOr[Boolean] = js.undefined): CancelBundleTaskRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CancelBundleTaskRequest]
  }
}

