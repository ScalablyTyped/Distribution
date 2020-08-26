package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStageResponse extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typings.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.native
  /**
    * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage is managed by API Gateway. You can't modify the $default stage.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.native
  /**
    * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.native
  /**
    * The timestamp when the stage was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * Default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.native
  /**
    * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
    */
  var LastDeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The timestamp when the stage was last updated.
    */
  var LastUpdatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * Route settings for the stage, by routeKey.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.native
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object UpdateStageResponse {
  @scala.inline
  def apply(): UpdateStageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStageResponse]
  }
  @scala.inline
  implicit class UpdateStageResponseOps[Self <: UpdateStageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessLogSettings(value: AccessLogSettings): Self = this.set("AccessLogSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLogSettings: Self = this.set("AccessLogSettings", js.undefined)
    @scala.inline
    def setApiGatewayManaged(value: boolean): Self = this.set("ApiGatewayManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiGatewayManaged: Self = this.set("ApiGatewayManaged", js.undefined)
    @scala.inline
    def setAutoDeploy(value: boolean): Self = this.set("AutoDeploy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDeploy: Self = this.set("AutoDeploy", js.undefined)
    @scala.inline
    def setClientCertificateId(value: Id): Self = this.set("ClientCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientCertificateId: Self = this.set("ClientCertificateId", js.undefined)
    @scala.inline
    def setCreatedDate(value: timestampIso8601): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDefaultRouteSettings(value: RouteSettings): Self = this.set("DefaultRouteSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRouteSettings: Self = this.set("DefaultRouteSettings", js.undefined)
    @scala.inline
    def setDeploymentId(value: Id): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLastDeploymentStatusMessage(value: string): Self = this.set("LastDeploymentStatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDeploymentStatusMessage: Self = this.set("LastDeploymentStatusMessage", js.undefined)
    @scala.inline
    def setLastUpdatedDate(value: timestampIso8601): Self = this.set("LastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("LastUpdatedDate", js.undefined)
    @scala.inline
    def setRouteSettings(value: RouteSettingsMap): Self = this.set("RouteSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteSettings: Self = this.set("RouteSettings", js.undefined)
    @scala.inline
    def setStageName(value: StringWithLengthBetween1And128): Self = this.set("StageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("StageName", js.undefined)
    @scala.inline
    def setStageVariables(value: StageVariablesMap): Self = this.set("StageVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageVariables: Self = this.set("StageVariables", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

