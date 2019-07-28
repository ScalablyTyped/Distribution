package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentJobRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: DeploymentApplicationConfigs
  /**
    * The requested deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the fleet to deploy.
    */
  var fleet: Arn
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateDeploymentJobRequest {
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    deploymentApplicationConfigs: DeploymentApplicationConfigs,
    fleet: Arn,
    deploymentConfig: DeploymentConfig = null,
    tags: TagMap = null
  ): CreateDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken, deploymentApplicationConfigs = deploymentApplicationConfigs, fleet = fleet)
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDeploymentJobRequest]
  }
}

