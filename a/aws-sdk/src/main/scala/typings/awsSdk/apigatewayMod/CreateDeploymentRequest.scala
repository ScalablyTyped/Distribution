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
  def apply(restApiId: String): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  @scala.inline
  implicit class CreateDeploymentRequestOps[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
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
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheClusterEnabled(value: NullableBoolean): Self = this.set("cacheClusterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterEnabled: Self = this.set("cacheClusterEnabled", js.undefined)
    @scala.inline
    def setCacheClusterSize(value: CacheClusterSize): Self = this.set("cacheClusterSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterSize: Self = this.set("cacheClusterSize", js.undefined)
    @scala.inline
    def setCanarySettings(value: DeploymentCanarySettings): Self = this.set("canarySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanarySettings: Self = this.set("canarySettings", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setStageDescription(value: String): Self = this.set("stageDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageDescription: Self = this.set("stageDescription", js.undefined)
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    @scala.inline
    def setTracingEnabled(value: NullableBoolean): Self = this.set("tracingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracingEnabled: Self = this.set("tracingEnabled", js.undefined)
    @scala.inline
    def setVariables(value: MapOfStringToString): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

