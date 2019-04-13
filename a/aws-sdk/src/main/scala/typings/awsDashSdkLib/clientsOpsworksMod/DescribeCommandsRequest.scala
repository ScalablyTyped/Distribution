package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCommandsRequest extends js.Object {
  /**
    * An array of command IDs. If you include this parameter, DescribeCommands returns a description of the specified commands. Otherwise, it returns a description of every command.
    */
  var CommandIds: js.UndefOr[Strings] = js.undefined
  /**
    * The deployment ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
  /**
    * The instance ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object DescribeCommandsRequest {
  @scala.inline
  def apply(CommandIds: Strings = null, DeploymentId: String = null, InstanceId: String = null): DescribeCommandsRequest = {
    val __obj = js.Dynamic.literal()
    if (CommandIds != null) __obj.updateDynamic("CommandIds")(CommandIds)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[DescribeCommandsRequest]
  }
}

