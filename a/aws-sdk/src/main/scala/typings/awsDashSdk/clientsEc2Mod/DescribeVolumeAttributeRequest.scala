package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumeAttributeRequest extends js.Object {
  /**
    * The attribute of the volume. This parameter is required.
    */
  var Attribute: VolumeAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: String
}

object DescribeVolumeAttributeRequest {
  @scala.inline
  def apply(Attribute: VolumeAttributeName, VolumeId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DescribeVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VolumeId = VolumeId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeVolumeAttributeRequest]
  }
}

