package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetSnapshotAttributeRequest extends js.Object {
  /**
    * The attribute to reset. Currently, only the attribute for permission to create volumes can be reset.
    */
  var Attribute: SnapshotAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: String
}

object ResetSnapshotAttributeRequest {
  @scala.inline
  def apply(
    Attribute: SnapshotAttributeName,
    SnapshotId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetSnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], SnapshotId = SnapshotId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ResetSnapshotAttributeRequest]
  }
}

