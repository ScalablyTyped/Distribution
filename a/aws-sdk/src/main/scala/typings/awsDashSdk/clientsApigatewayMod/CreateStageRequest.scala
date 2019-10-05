package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStageRequest extends js.Object {
  /**
    * Whether cache clustering is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The stage's cache cluster size.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
  /**
    * The canary deployment settings of this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.undefined
  /**
    * [Required] The identifier of the Deployment resource for the Stage resource.
    */
  var deploymentId: String
  /**
    * The description of the Stage resource.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The name for the Stage resource. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var stageName: String
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A map that defines the stage variables for the new Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.undefined
}

object CreateStageRequest {
  @scala.inline
  def apply(
    deploymentId: String,
    restApiId: String,
    stageName: String,
    cacheClusterEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cacheClusterSize: CacheClusterSize = null,
    canarySettings: CanarySettings = null,
    description: String = null,
    documentationVersion: String = null,
    tags: MapOfStringToString = null,
    tracingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    variables: MapOfStringToString = null
  ): CreateStageRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId, restApiId = restApiId, stageName = stageName)
    if (!js.isUndefined(cacheClusterEnabled)) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled)
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (canarySettings != null) __obj.updateDynamic("canarySettings")(canarySettings)
    if (description != null) __obj.updateDynamic("description")(description)
    if (documentationVersion != null) __obj.updateDynamic("documentationVersion")(documentationVersion)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(tracingEnabled)) __obj.updateDynamic("tracingEnabled")(tracingEnabled)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[CreateStageRequest]
  }
}

