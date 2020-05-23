package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStageRequest extends js.Object {
  /**
    * Whether cache clustering is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The stage's cache cluster size.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.native
  /**
    * The canary deployment settings of this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.native
  /**
    * [Required] The identifier of the Deployment resource for the Stage resource.
    */
  var deploymentId: String = js.native
  /**
    * The description of the Stage resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The name for the Stage resource. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var stageName: String = js.native
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A map that defines the stage variables for the new Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.native
}

object CreateStageRequest {
  @scala.inline
  def apply(
    deploymentId: String,
    restApiId: String,
    stageName: String,
    cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
    cacheClusterSize: CacheClusterSize = null,
    canarySettings: CanarySettings = null,
    description: String = null,
    documentationVersion: String = null,
    tags: MapOfStringToString = null,
    tracingEnabled: js.UndefOr[Boolean] = js.undefined,
    variables: MapOfStringToString = null
  ): CreateStageRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheClusterEnabled)) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled.get.asInstanceOf[js.Any])
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (canarySettings != null) __obj.updateDynamic("canarySettings")(canarySettings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentationVersion != null) __obj.updateDynamic("documentationVersion")(documentationVersion.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(tracingEnabled)) __obj.updateDynamic("tracingEnabled")(tracingEnabled.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStageRequest]
  }
}

