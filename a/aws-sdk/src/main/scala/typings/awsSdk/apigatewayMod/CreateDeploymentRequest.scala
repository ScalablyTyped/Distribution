package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentRequest extends StObject {
  
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
  implicit class CreateDeploymentRequestMutableBuilder[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterEnabled(value: NullableBoolean): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
    
    @scala.inline
    def setCacheClusterSize(value: CacheClusterSize): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
    
    @scala.inline
    def setCanarySettings(value: DeploymentCanarySettings): Self = StObject.set(x, "canarySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanarySettingsUndefined: Self = StObject.set(x, "canarySettings", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageDescription(value: String): Self = StObject.set(x, "stageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageDescriptionUndefined: Self = StObject.set(x, "stageDescription", js.undefined)
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setTracingEnabled(value: NullableBoolean): Self = StObject.set(x, "tracingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingEnabledUndefined: Self = StObject.set(x, "tracingEnabled", js.undefined)
    
    @scala.inline
    def setVariables(value: MapOfStringToString): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
