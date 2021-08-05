package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStageRequest extends StObject {
  
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
  
  inline def apply(deploymentId: String, restApiId: String, stageName: String): CreateStageRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStageRequest]
  }
  
  extension [Self <: CreateStageRequest](x: Self) {
    
    inline def setCacheClusterEnabled(value: Boolean): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
    
    inline def setCacheClusterSize(value: CacheClusterSize): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
    
    inline def setCanarySettings(value: CanarySettings): Self = StObject.set(x, "canarySettings", value.asInstanceOf[js.Any])
    
    inline def setCanarySettingsUndefined: Self = StObject.set(x, "canarySettings", js.undefined)
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentationVersionUndefined: Self = StObject.set(x, "documentationVersion", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTracingEnabled(value: Boolean): Self = StObject.set(x, "tracingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTracingEnabledUndefined: Self = StObject.set(x, "tracingEnabled", js.undefined)
    
    inline def setVariables(value: MapOfStringToString): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
