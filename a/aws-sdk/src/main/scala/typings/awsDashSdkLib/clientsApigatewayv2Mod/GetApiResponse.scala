package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiResponse extends js.Object {
  /**
    * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The
    stage name is typically appended to this URI to form a complete path to a deployed
    API stage.
    */
  var ApiEndpoint: js.UndefOr[__string] = js.undefined
  /**
    * The API ID.
    */
  var ApiId: js.UndefOr[Id] = js.undefined
  /**
    * An API key selection expression. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * The timestamp when the API was created.
    */
  var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * Avoid validating models when creating a deployment.
    */
  var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  /**
    * The API protocol: Currently only WEBSOCKET is supported.
    */
  var ProtocolType: js.UndefOr[ProtocolType] = js.undefined
  /**
    * The route selection expression for the API.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters..
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
  /**
    * The warning messages reported when failonwarnings is turned on during
    API import.
    */
  var Warnings: js.UndefOr[__listOf__string] = js.undefined
}

object GetApiResponse {
  @scala.inline
  def apply(
    ApiEndpoint: __string = null,
    ApiId: Id = null,
    ApiKeySelectionExpression: SelectionExpression = null,
    CreatedDate: __timestampIso8601 = null,
    Description: StringWithLengthBetween0And1024 = null,
    DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
    Name: StringWithLengthBetween1And128 = null,
    ProtocolType: ProtocolType = null,
    RouteSelectionExpression: SelectionExpression = null,
    Tags: Tags = null,
    Version: StringWithLengthBetween1And64 = null,
    Warnings: __listOf__string = null
  ): GetApiResponse = {
    val __obj = js.Dynamic.literal()
    if (ApiEndpoint != null) __obj.updateDynamic("ApiEndpoint")(ApiEndpoint)
    if (ApiId != null) __obj.updateDynamic("ApiId")(ApiId)
    if (ApiKeySelectionExpression != null) __obj.updateDynamic("ApiKeySelectionExpression")(ApiKeySelectionExpression)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisableSchemaValidation)) __obj.updateDynamic("DisableSchemaValidation")(DisableSchemaValidation)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ProtocolType != null) __obj.updateDynamic("ProtocolType")(ProtocolType.asInstanceOf[js.Any])
    if (RouteSelectionExpression != null) __obj.updateDynamic("RouteSelectionExpression")(RouteSelectionExpression)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings)
    __obj.asInstanceOf[GetApiResponse]
  }
}

