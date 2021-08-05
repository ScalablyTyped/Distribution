package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stage extends StObject {
  
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typings.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.undefined
  
  /**
    * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage is managed by API Gateway. You can't modify the $default stage.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.undefined
  
  /**
    * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.undefined
  
  /**
    * The timestamp when the stage was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
  
  /**
    * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
    */
  var LastDeploymentStatusMessage: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp when the stage was last updated.
    */
  var LastUpdatedDate: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Route settings for the stage, by routeKey.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
  
  /**
    * The name of the stage.
    */
  var StageName: StringWithLengthBetween1And128
  
  /**
    * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
}
object Stage {
  
  inline def apply(StageName: StringWithLengthBetween1And128): Stage = {
    val __obj = js.Dynamic.literal(StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  
  extension [Self <: Stage](x: Self) {
    
    inline def setAccessLogSettings(value: AccessLogSettings): Self = StObject.set(x, "AccessLogSettings", value.asInstanceOf[js.Any])
    
    inline def setAccessLogSettingsUndefined: Self = StObject.set(x, "AccessLogSettings", js.undefined)
    
    inline def setApiGatewayManaged(value: boolean): Self = StObject.set(x, "ApiGatewayManaged", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayManagedUndefined: Self = StObject.set(x, "ApiGatewayManaged", js.undefined)
    
    inline def setAutoDeploy(value: boolean): Self = StObject.set(x, "AutoDeploy", value.asInstanceOf[js.Any])
    
    inline def setAutoDeployUndefined: Self = StObject.set(x, "AutoDeploy", js.undefined)
    
    inline def setClientCertificateId(value: Id): Self = StObject.set(x, "ClientCertificateId", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateIdUndefined: Self = StObject.set(x, "ClientCertificateId", js.undefined)
    
    inline def setCreatedDate(value: timestampIso8601): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDefaultRouteSettings(value: RouteSettings): Self = StObject.set(x, "DefaultRouteSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteSettingsUndefined: Self = StObject.set(x, "DefaultRouteSettings", js.undefined)
    
    inline def setDeploymentId(value: Id): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastDeploymentStatusMessage(value: string): Self = StObject.set(x, "LastDeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentStatusMessageUndefined: Self = StObject.set(x, "LastDeploymentStatusMessage", js.undefined)
    
    inline def setLastUpdatedDate(value: timestampIso8601): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setRouteSettings(value: RouteSettingsMap): Self = StObject.set(x, "RouteSettings", value.asInstanceOf[js.Any])
    
    inline def setRouteSettingsUndefined: Self = StObject.set(x, "RouteSettings", js.undefined)
    
    inline def setStageName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    inline def setStageVariables(value: StageVariablesMap): Self = StObject.set(x, "StageVariables", value.asInstanceOf[js.Any])
    
    inline def setStageVariablesUndefined: Self = StObject.set(x, "StageVariables", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
