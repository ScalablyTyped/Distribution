package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStageRequest extends StObject {
  
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
  implicit class CreateStageRequestMutableBuilder[Self <: CreateStageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterEnabled(value: Boolean): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
    
    @scala.inline
    def setCacheClusterSize(value: CacheClusterSize): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
    
    @scala.inline
    def setCanarySettings(value: CanarySettings): Self = StObject.set(x, "canarySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanarySettingsUndefined: Self = StObject.set(x, "canarySettings", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationVersionUndefined: Self = StObject.set(x, "documentationVersion", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTracingEnabled(value: Boolean): Self = StObject.set(x, "tracingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingEnabledUndefined: Self = StObject.set(x, "tracingEnabled", js.undefined)
    
    @scala.inline
    def setVariables(value: MapOfStringToString): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
