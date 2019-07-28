package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmProductInstanceRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * The product code. This must be a product code that you own.
    */
  var ProductCode: String
}

object ConfirmProductInstanceRequest {
  @scala.inline
  def apply(InstanceId: String, ProductCode: String, DryRun: js.UndefOr[Boolean] = js.undefined): ConfirmProductInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, ProductCode = ProductCode)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ConfirmProductInstanceRequest]
  }
}

