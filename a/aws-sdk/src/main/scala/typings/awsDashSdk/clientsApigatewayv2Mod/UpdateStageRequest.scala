package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStageRequest extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.AccessLogSettings] = js.native
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[__boolean] = js.native
  /**
    * The identifier of a client certificate for a Stage.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.native
  /**
    * The default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.native
  /**
    * The deployment identifier for the API stage. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The description for the API stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Route settings for the stage.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.native
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: __string = js.native
  /**
    * A map that defines the stage variables for a Stage. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket APIs.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.native
}

object UpdateStageRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    StageName: __string,
    AccessLogSettings: AccessLogSettings = null,
    AutoDeploy: js.UndefOr[Boolean] = js.undefined,
    ClientCertificateId: Id = null,
    DefaultRouteSettings: RouteSettings = null,
    DeploymentId: Id = null,
    Description: StringWithLengthBetween0And1024 = null,
    RouteSettings: RouteSettingsMap = null,
    StageVariables: StageVariablesMap = null
  ): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    if (AccessLogSettings != null) __obj.updateDynamic("AccessLogSettings")(AccessLogSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoDeploy)) __obj.updateDynamic("AutoDeploy")(AutoDeploy.asInstanceOf[js.Any])
    if (ClientCertificateId != null) __obj.updateDynamic("ClientCertificateId")(ClientCertificateId.asInstanceOf[js.Any])
    if (DefaultRouteSettings != null) __obj.updateDynamic("DefaultRouteSettings")(DefaultRouteSettings.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (RouteSettings != null) __obj.updateDynamic("RouteSettings")(RouteSettings.asInstanceOf[js.Any])
    if (StageVariables != null) __obj.updateDynamic("StageVariables")(StageVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStageRequest]
  }
}

