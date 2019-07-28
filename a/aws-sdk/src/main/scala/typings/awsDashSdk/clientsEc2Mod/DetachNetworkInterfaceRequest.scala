package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachNetworkInterfaceRequest extends js.Object {
  /**
    * The ID of the attachment.
    */
  var AttachmentId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether to force a detachment.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
}

object DetachNetworkInterfaceRequest {
  @scala.inline
  def apply(
    AttachmentId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Force: js.UndefOr[Boolean] = js.undefined
  ): DetachNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    __obj.asInstanceOf[DetachNetworkInterfaceRequest]
  }
}

