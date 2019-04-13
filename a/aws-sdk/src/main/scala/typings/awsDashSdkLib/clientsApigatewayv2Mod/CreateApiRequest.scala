package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiRequest extends js.Object {
  /**
    * An API key selection expression. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
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
  var Name: StringWithLengthBetween1And128
  /**
    * The API protocol: Currently only WEBSOCKET is supported.
    */
  var ProtocolType: awsDashSdkLib.clientsApigatewayv2Mod.ProtocolType
  /**
    * The route selection expression for the API.
    */
  var RouteSelectionExpression: SelectionExpression
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
}

object CreateApiRequest {
  @scala.inline
  def apply(
    Name: StringWithLengthBetween1And128,
    ProtocolType: ProtocolType,
    RouteSelectionExpression: SelectionExpression,
    ApiKeySelectionExpression: SelectionExpression = null,
    Description: StringWithLengthBetween0And1024 = null,
    DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
    Version: StringWithLengthBetween1And64 = null
  ): CreateApiRequest = {
    val __obj = js.Dynamic.literal(Name = Name, ProtocolType = ProtocolType.asInstanceOf[js.Any], RouteSelectionExpression = RouteSelectionExpression)
    if (ApiKeySelectionExpression != null) __obj.updateDynamic("ApiKeySelectionExpression")(ApiKeySelectionExpression)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisableSchemaValidation)) __obj.updateDynamic("DisableSchemaValidation")(DisableSchemaValidation)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[CreateApiRequest]
  }
}

