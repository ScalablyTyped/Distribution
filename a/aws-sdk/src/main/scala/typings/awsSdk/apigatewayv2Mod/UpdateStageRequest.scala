package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStageRequest extends StObject {
  
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typings.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.undefined
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.undefined
  
  /**
    * The identifier of a client certificate for a Stage.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.undefined
  
  /**
    * The default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
  
  /**
    * The deployment identifier for the API stage. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The description for the API stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * Route settings for the stage.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
  
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string
  
  /**
    * A map that defines the stage variables for a Stage. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
}
object UpdateStageRequest {
  
  @scala.inline
  def apply(ApiId: string, StageName: string): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStageRequest]
  }
  
  @scala.inline
  implicit class UpdateStageRequestMutableBuilder[Self <: UpdateStageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLogSettings(value: AccessLogSettings): Self = StObject.set(x, "AccessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogSettingsUndefined: Self = StObject.set(x, "AccessLogSettings", js.undefined)
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeploy(value: boolean): Self = StObject.set(x, "AutoDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeployUndefined: Self = StObject.set(x, "AutoDeploy", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: Id): Self = StObject.set(x, "ClientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateIdUndefined: Self = StObject.set(x, "ClientCertificateId", js.undefined)
    
    @scala.inline
    def setDefaultRouteSettings(value: RouteSettings): Self = StObject.set(x, "DefaultRouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRouteSettingsUndefined: Self = StObject.set(x, "DefaultRouteSettings", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: Id): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRouteSettings(value: RouteSettingsMap): Self = StObject.set(x, "RouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSettingsUndefined: Self = StObject.set(x, "RouteSettings", js.undefined)
    
    @scala.inline
    def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariables(value: StageVariablesMap): Self = StObject.set(x, "StageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariablesUndefined: Self = StObject.set(x, "StageVariables", js.undefined)
  }
}
