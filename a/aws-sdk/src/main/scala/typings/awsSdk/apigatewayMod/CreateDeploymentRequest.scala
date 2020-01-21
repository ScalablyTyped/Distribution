package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    * Enables a cache cluster for the Stage resource specified in the input.
    */
  var cacheClusterEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies the cache cluster size for the Stage resource specified in the input, if a cache cluster is enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.native
  /**
    * The input configuration for the canary deployment when the deployment is a canary release deployment. 
    */
  var canarySettings: js.UndefOr[DeploymentCanarySettings] = js.native
  /**
    * The description for the Deployment resource to create.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The description of the Stage resource for the Deployment resource to create.
    */
  var stageDescription: js.UndefOr[String] = js.native
  /**
    * The name of the Stage resource for the Deployment resource to create.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.native
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(
    restApiId: String,
    cacheClusterEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cacheClusterSize: CacheClusterSize = null,
    canarySettings: DeploymentCanarySettings = null,
    description: String = null,
    stageDescription: String = null,
    stageName: String = null,
    tracingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    variables: MapOfStringToString = null
  ): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheClusterEnabled)) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled.asInstanceOf[js.Any])
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (canarySettings != null) __obj.updateDynamic("canarySettings")(canarySettings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (stageDescription != null) __obj.updateDynamic("stageDescription")(stageDescription.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (!js.isUndefined(tracingEnabled)) __obj.updateDynamic("tracingEnabled")(tracingEnabled.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

