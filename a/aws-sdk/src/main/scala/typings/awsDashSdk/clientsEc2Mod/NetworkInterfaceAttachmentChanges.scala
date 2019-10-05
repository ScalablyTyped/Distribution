package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachmentChanges extends js.Object {
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
}

object NetworkInterfaceAttachmentChanges {
  @scala.inline
  def apply(AttachmentId: String = null, DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined): NetworkInterfaceAttachmentChanges = {
    val __obj = js.Dynamic.literal()
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId)
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    __obj.asInstanceOf[NetworkInterfaceAttachmentChanges]
  }
}

