package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentRequest extends js.Object {
  /**
    * The app ID. This parameter is required for app deployments, but not for other deployment commands.
    */
  var AppId: js.UndefOr[String] = js.undefined
  /**
    * A DeploymentCommand object that specifies the deployment command and any associated arguments.
    */
  var Command: DeploymentCommand
  /**
    * A user-defined comment.
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  /**
    * The instance IDs for the deployment targets.
    */
  var InstanceIds: js.UndefOr[Strings] = js.undefined
  /**
    * The layer IDs for the deployment targets.
    */
  var LayerIds: js.UndefOr[Strings] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: String
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(
    Command: DeploymentCommand,
    StackId: String,
    AppId: String = null,
    Comment: String = null,
    CustomJson: String = null,
    InstanceIds: Strings = null,
    LayerIds: Strings = null
  ): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(Command = Command, StackId = StackId)
    if (AppId != null) __obj.updateDynamic("AppId")(AppId)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds)
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

