package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStageRequest extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typings.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.native
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.native
  /**
    * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.native
  /**
    * The default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.native
  /**
    * The deployment identifier of the API stage.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The description for the API stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Route settings for the stage, by routeKey.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.native
  /**
    * The name of the stage.
    */
  var StageName: StringWithLengthBetween1And128 = js.native
  /**
    * A map that defines the stage variables for a Stage. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket APIs.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object CreateStageRequest {
  @scala.inline
  def apply(
    ApiId: string,
    StageName: StringWithLengthBetween1And128,
    AccessLogSettings: AccessLogSettings = null,
    AutoDeploy: js.UndefOr[Boolean] = js.undefined,
    ClientCertificateId: Id = null,
    DefaultRouteSettings: RouteSettings = null,
    DeploymentId: Id = null,
    Description: StringWithLengthBetween0And1024 = null,
    RouteSettings: RouteSettingsMap = null,
    StageVariables: StageVariablesMap = null,
    Tags: Tags = null
  ): CreateStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    if (AccessLogSettings != null) __obj.updateDynamic("AccessLogSettings")(AccessLogSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoDeploy)) __obj.updateDynamic("AutoDeploy")(AutoDeploy.asInstanceOf[js.Any])
    if (ClientCertificateId != null) __obj.updateDynamic("ClientCertificateId")(ClientCertificateId.asInstanceOf[js.Any])
    if (DefaultRouteSettings != null) __obj.updateDynamic("DefaultRouteSettings")(DefaultRouteSettings.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (RouteSettings != null) __obj.updateDynamic("RouteSettings")(RouteSettings.asInstanceOf[js.Any])
    if (StageVariables != null) __obj.updateDynamic("StageVariables")(StageVariables.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStageRequest]
  }
}

