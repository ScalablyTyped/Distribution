package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelBundleTaskRequest extends js.Object {
  /**
    * The ID of the bundle task.
    */
  var BundleId: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object CancelBundleTaskRequest {
  @scala.inline
  def apply(BundleId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): CancelBundleTaskRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBundleTaskRequest]
  }
}

