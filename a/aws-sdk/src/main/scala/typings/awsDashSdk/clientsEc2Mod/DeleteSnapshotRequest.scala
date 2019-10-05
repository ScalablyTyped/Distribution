package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: String
}

object DeleteSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
}

