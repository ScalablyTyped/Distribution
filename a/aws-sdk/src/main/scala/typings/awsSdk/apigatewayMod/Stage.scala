package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stage extends js.Object {
  
  /**
    * Settings for logging access in this stage.
    */
  var accessLogSettings: js.UndefOr[AccessLogSettings] = js.native
  
  /**
    * Specifies whether a cache cluster is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the cache cluster for the stage, if enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.native
  
  /**
    * The status of the cache cluster for the stage, if enabled.
    */
  var cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.native
  
  /**
    * Settings for the canary deployment in this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.native
  
  /**
    * The identifier of a client certificate for an API stage.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the stage was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the Deployment that the stage points to.
    */
  var deploymentId: js.UndefOr[String] = js.native
  
  /**
    * The stage's description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the stage last updated.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A map that defines the method settings for a Stage resource. Keys (designated as /{method_setting_key below) are method paths defined as {resource_path}/{http_method} for an individual method override, or /\*\* for overriding all methods in the stage. 
    */
  var methodSettings: js.UndefOr[MapOfMethodSettings] = js.native
  
  /**
    * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var stageName: js.UndefOr[String] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A map that defines the stage variables for a Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The ARN of the WebAcl associated with the Stage.
    */
  var webAclArn: js.UndefOr[String] = js.native
}
object Stage {
  
  @scala.inline
  def apply(): Stage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stage]
  }
  
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
    
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
    def setAccessLogSettings(value: AccessLogSettings): Self = this.set("accessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLogSettings: Self = this.set("accessLogSettings", js.undefined)
    
    @scala.inline
    def setCacheClusterEnabled(value: Boolean): Self = this.set("cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterEnabled: Self = this.set("cacheClusterEnabled", js.undefined)
    
    @scala.inline
    def setCacheClusterSize(value: CacheClusterSize): Self = this.set("cacheClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterSize: Self = this.set("cacheClusterSize", js.undefined)
    
    @scala.inline
    def setCacheClusterStatus(value: CacheClusterStatus): Self = this.set("cacheClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterStatus: Self = this.set("cacheClusterStatus", js.undefined)
    
    @scala.inline
    def setCanarySettings(value: CanarySettings): Self = this.set("canarySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanarySettings: Self = this.set("canarySettings", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: String): Self = this.set("clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("clientCertificateId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocumentationVersion(value: String): Self = this.set("documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationVersion: Self = this.set("documentationVersion", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMethodSettings(value: MapOfMethodSettings): Self = this.set("methodSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodSettings: Self = this.set("methodSettings", js.undefined)
    
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    
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
    
    @scala.inline
    def setWebAclArn(value: String): Self = this.set("webAclArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAclArn: Self = this.set("webAclArn", js.undefined)
  }
}
