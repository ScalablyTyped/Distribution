package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * The ID of the deployment. This number increases by one each time that you deploy source code or change instance configuration settings.
    */
  var DeploymentId: js.UndefOr[NullableLong] = js.undefined
  /**
    * For in-progress deployments, the time that the deployment started. For completed deployments, the time that the deployment ended.
    */
  var DeploymentTime: js.UndefOr[DeploymentTimestamp] = js.undefined
  /**
    * The status of the deployment:    In Progress : The deployment is in progress.    Deployed : The deployment succeeded.    Failed : The deployment failed.  
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The version label of the application version in the deployment.
    */
  var VersionLabel: js.UndefOr[String] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(
    DeploymentId: js.UndefOr[NullableLong] = js.undefined,
    DeploymentTime: DeploymentTimestamp = null,
    Status: String = null,
    VersionLabel: String = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeploymentId)) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (DeploymentTime != null) __obj.updateDynamic("DeploymentTime")(DeploymentTime)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[Deployment]
  }
}

