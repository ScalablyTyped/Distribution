package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotAttributeRequest extends js.Object {
  /**
    * The snapshot attribute you would like to view.
    */
  var Attribute: SnapshotAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: String
}

object DescribeSnapshotAttributeRequest {
  @scala.inline
  def apply(Attribute: SnapshotAttributeName, SnapshotId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeSnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], SnapshotId = SnapshotId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeSnapshotAttributeRequest]
  }
}

