package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * The ID of the deployment if you wish to redeploy a previous deployment.
    */
  var DeploymentId: js.UndefOr[__string] = js.native
  /**
    * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
    */
  var DeploymentType: typings.awsDashSdk.clientsGreengrassMod.DeploymentType = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string = js.native
  /**
    * The ID of the group version to be deployed.
    */
  var GroupVersionId: js.UndefOr[__string] = js.native
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(
    DeploymentType: DeploymentType,
    GroupId: __string,
    AmznClientToken: __string = null,
    DeploymentId: __string = null,
    GroupVersionId: __string = null
  ): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(DeploymentType = DeploymentType.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (GroupVersionId != null) __obj.updateDynamic("GroupVersionId")(GroupVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

