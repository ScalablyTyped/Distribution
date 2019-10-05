package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageRequest extends js.Object {
  /**
    * The block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or snapshots. To create an AMI with encrypted snapshots, use the CopyImage action.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined
  /**
    * A description for the new image.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * A name for the new image. Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
    */
  var Name: String
  /**
    * By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this option is used, file system integrity on the created image can't be guaranteed.
    */
  var NoReboot: js.UndefOr[Boolean] = js.undefined
}

object CreateImageRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    Name: String,
    BlockDeviceMappings: BlockDeviceMappingRequestList = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    NoReboot: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateImageRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, Name = Name)
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(NoReboot)) __obj.updateDynamic("NoReboot")(NoReboot)
    __obj.asInstanceOf[CreateImageRequest]
  }
}

