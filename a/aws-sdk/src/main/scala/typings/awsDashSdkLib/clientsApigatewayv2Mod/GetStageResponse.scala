package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStageResponse extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
  /**
    * The identifier of a client certificate for a Stage.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.undefined
  /**
    * The timestamp when the stage was created.
    */
  var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
  /**
    * The identifier of the Deployment that the Stage is
    associated with.
    */
  var DeploymentId: js.UndefOr[Id] = js.undefined
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * The timestamp when the stage was last updated.
    */
  var LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Route settings for the stage.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  /**
    * A map that defines the stage variables for a stage resource. Variable names can
    have alphanumeric and underscore characters, and the values must match
    [A-Za-z0-9-._~:/?#&=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
}

object GetStageResponse {
  @scala.inline
  def apply(
    AccessLogSettings: AccessLogSettings = null,
    ClientCertificateId: Id = null,
    CreatedDate: __timestampIso8601 = null,
    DefaultRouteSettings: RouteSettings = null,
    DeploymentId: Id = null,
    Description: StringWithLengthBetween0And1024 = null,
    LastUpdatedDate: __timestampIso8601 = null,
    RouteSettings: RouteSettingsMap = null,
    StageName: StringWithLengthBetween1And128 = null,
    StageVariables: StageVariablesMap = null
  ): GetStageResponse = {
    val __obj = js.Dynamic.literal()
    if (AccessLogSettings != null) __obj.updateDynamic("AccessLogSettings")(AccessLogSettings)
    if (ClientCertificateId != null) __obj.updateDynamic("ClientCertificateId")(ClientCertificateId)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (DefaultRouteSettings != null) __obj.updateDynamic("DefaultRouteSettings")(DefaultRouteSettings)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastUpdatedDate != null) __obj.updateDynamic("LastUpdatedDate")(LastUpdatedDate)
    if (RouteSettings != null) __obj.updateDynamic("RouteSettings")(RouteSettings)
    if (StageName != null) __obj.updateDynamic("StageName")(StageName)
    if (StageVariables != null) __obj.updateDynamic("StageVariables")(StageVariables)
    __obj.asInstanceOf[GetStageResponse]
  }
}

