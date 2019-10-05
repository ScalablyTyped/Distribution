package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelImportTaskRequest extends js.Object {
  /**
    * The reason for canceling the task.
    */
  var CancelReason: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the import image or import snapshot task to be canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
}

object CancelImportTaskRequest {
  @scala.inline
  def apply(
    CancelReason: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    ImportTaskId: String = null
  ): CancelImportTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (CancelReason != null) __obj.updateDynamic("CancelReason")(CancelReason)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId)
    __obj.asInstanceOf[CancelImportTaskRequest]
  }
}

