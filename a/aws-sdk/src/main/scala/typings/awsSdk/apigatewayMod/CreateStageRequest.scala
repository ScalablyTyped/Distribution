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
  def apply(deploymentId: String, restApiId: String, stageName: String): CreateStageRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStageRequest]
  }
  @scala.inline
  implicit class CreateStageRequestOps[Self <: CreateStageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheClusterEnabled(value: Boolean): Self = this.set("cacheClusterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterEnabled: Self = this.set("cacheClusterEnabled", js.undefined)
    @scala.inline
    def setCacheClusterSize(value: CacheClusterSize): Self = this.set("cacheClusterSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterSize: Self = this.set("cacheClusterSize", js.undefined)
    @scala.inline
    def setCanarySettings(value: CanarySettings): Self = this.set("canarySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanarySettings: Self = this.set("canarySettings", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDocumentationVersion(value: String): Self = this.set("documentationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentationVersion: Self = this.set("documentationVersion", js.undefined)
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTracingEnabled(value: Boolean): Self = this.set("tracingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracingEnabled: Self = this.set("tracingEnabled", js.undefined)
    @scala.inline
    def setVariables(value: MapOfStringToString): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

