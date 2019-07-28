package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachment extends js.Object {
  /**
    * The timestamp indicating when the attachment initiated.
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
    * The device index of the network interface attachment on the instance.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.undefined
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(
    AttachTime: DateTime = null,
    AttachmentId: String = null,
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    DeviceIndex: js.UndefOr[Integer] = js.undefined,
    InstanceId: String = null,
    InstanceOwnerId: String = null,
    Status: AttachmentStatus = null
  ): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    if (AttachTime != null) __obj.updateDynamic("AttachTime")(AttachTime)
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId)
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (!js.isUndefined(DeviceIndex)) __obj.updateDynamic("DeviceIndex")(DeviceIndex)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceOwnerId != null) __obj.updateDynamic("InstanceOwnerId")(InstanceOwnerId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
}

