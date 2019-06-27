package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStageRequest extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The identifier of a client certificate for a Stage.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.undefined
  /**
    * The default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
  /**
    * The deployment identifier of the API stage.
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
    * The name of the stage.
    */
  var StageName: StringWithLengthBetween1And128
  /**
    * A map that defines the stage variables for a Stage. Variable names
    can have alphanumeric and underscore characters, and the values must match
    [A-Za-z0-9-._~:/?#&=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters..
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object CreateStageRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    StageName: StringWithLengthBetween1And128,
    AccessLogSettings: AccessLogSettings = null,
    ClientCertificateId: Id = null,
    DefaultRouteSettings: RouteSettings = null,
    DeploymentId: Id = null,
    Description: StringWithLengthBetween0And1024 = null,
    RouteSettings: RouteSettingsMap = null,
    StageVariables: StageVariablesMap = null,
    Tags: Tags = null
  ): CreateStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, StageName = StageName)
    if (AccessLogSettings != null) __obj.updateDynamic("AccessLogSettings")(AccessLogSettings)
    if (ClientCertificateId != null) __obj.updateDynamic("ClientCertificateId")(ClientCertificateId)
    if (DefaultRouteSettings != null) __obj.updateDynamic("DefaultRouteSettings")(DefaultRouteSettings)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (RouteSettings != null) __obj.updateDynamic("RouteSettings")(RouteSettings)
    if (StageVariables != null) __obj.updateDynamic("StageVariables")(StageVariables)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateStageRequest]
  }
}

