package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    * Enables a cache cluster for the Stage resource specified in the input.
    */
  var cacheClusterEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Specifies the cache cluster size for the Stage resource specified in the input, if a cache cluster is enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
  
  /**
    * The input configuration for the canary deployment when the deployment is a canary release deployment. 
    */
  var canarySettings: js.UndefOr[DeploymentCanarySettings] = js.undefined
  
  /**
    * The description for the Deployment resource to create.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The description of the Stage resource for the Deployment resource to create.
    */
  var stageDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Stage resource for the Deployment resource to create.
    */
  var stageName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.undefined
}
object CreateDeploymentRequest {
  
  inline def apply(restApiId: String): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setCacheClusterEnabled(value: NullableBoolean): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
    
    inline def setCacheClusterSize(value: CacheClusterSize): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
    
    inline def setCanarySettings(value: DeploymentCanarySettings): Self = StObject.set(x, "canarySettings", value.asInstanceOf[js.Any])
    
    inline def setCanarySettingsUndefined: Self = StObject.set(x, "canarySettings", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStageDescription(value: String): Self = StObject.set(x, "stageDescription", value.asInstanceOf[js.Any])
    
    inline def setStageDescriptionUndefined: Self = StObject.set(x, "stageDescription", js.undefined)
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setTracingEnabled(value: NullableBoolean): Self = StObject.set(x, "tracingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTracingEnabledUndefined: Self = StObject.set(x, "tracingEnabled", js.undefined)
    
    inline def setVariables(value: MapOfStringToString): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
