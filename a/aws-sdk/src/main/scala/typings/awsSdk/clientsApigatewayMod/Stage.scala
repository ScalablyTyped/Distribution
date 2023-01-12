package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stage extends StObject {
  
  /**
    * Settings for logging access in this stage.
    */
  var accessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
  
  /**
    * Specifies whether a cache cluster is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the cache cluster for the stage, if enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
  
  /**
    * The status of the cache cluster for the stage, if enabled.
    */
  var cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.undefined
  
  /**
    * Settings for the canary deployment in this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.undefined
  
  /**
    * The identifier of a client certificate for an API stage.
    */
  var clientCertificateId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the stage was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the Deployment that the stage points to.
    */
  var deploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * The stage's description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the stage last updated.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A map that defines the method settings for a Stage resource. Keys (designated as /{method_setting_key below) are method paths defined as {resource_path}/{http_method} for an individual method override, or /\*\* for overriding all methods in the stage. 
    */
  var methodSettings: js.UndefOr[MapOfMethodSettings] = js.undefined
  
  /**
    * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var stageName: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map that defines the stage variables for a Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The ARN of the WebAcl associated with the Stage.
    */
  var webAclArn: js.UndefOr[String] = js.undefined
}
object Stage {
  
  inline def apply(): Stage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
    
    inline def setAccessLogSettings(value: AccessLogSettings): Self = StObject.set(x, "accessLogSettings", value.asInstanceOf[js.Any])
    
    inline def setAccessLogSettingsUndefined: Self = StObject.set(x, "accessLogSettings", js.undefined)
    
    inline def setCacheClusterEnabled(value: Boolean): Self = StObject.set(x, "cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterEnabledUndefined: Self = StObject.set(x, "cacheClusterEnabled", js.undefined)
    
    inline def setCacheClusterSize(value: CacheClusterSize): Self = StObject.set(x, "cacheClusterSize", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterSizeUndefined: Self = StObject.set(x, "cacheClusterSize", js.undefined)
    
    inline def setCacheClusterStatus(value: CacheClusterStatus): Self = StObject.set(x, "cacheClusterStatus", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterStatusUndefined: Self = StObject.set(x, "cacheClusterStatus", js.undefined)
    
    inline def setCanarySettings(value: CanarySettings): Self = StObject.set(x, "canarySettings", value.asInstanceOf[js.Any])
    
    inline def setCanarySettingsUndefined: Self = StObject.set(x, "canarySettings", js.undefined)
    
    inline def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentationVersionUndefined: Self = StObject.set(x, "documentationVersion", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setMethodSettings(value: MapOfMethodSettings): Self = StObject.set(x, "methodSettings", value.asInstanceOf[js.Any])
    
    inline def setMethodSettingsUndefined: Self = StObject.set(x, "methodSettings", js.undefined)
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTracingEnabled(value: Boolean): Self = StObject.set(x, "tracingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTracingEnabledUndefined: Self = StObject.set(x, "tracingEnabled", js.undefined)
    
    inline def setVariables(value: MapOfStringToString): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setWebAclArn(value: String): Self = StObject.set(x, "webAclArn", value.asInstanceOf[js.Any])
    
    inline def setWebAclArnUndefined: Self = StObject.set(x, "webAclArn", js.undefined)
  }
}
