package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceNetworkInterfaceAttachment extends js.Object {
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * The index of the device on the instance for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.undefined
}

object InstanceNetworkInterfaceAttachment {
  @scala.inline
  def apply(
    AttachTime: DateTime = null,
    AttachmentId: String = null,
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    DeviceIndex: Int | scala.Double = null,
    Status: AttachmentStatus = null
  ): InstanceNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    if (AttachTime != null) __obj.updateDynamic("AttachTime")(AttachTime)
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId)
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (DeviceIndex != null) __obj.updateDynamic("DeviceIndex")(DeviceIndex.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterfaceAttachment]
  }
}

