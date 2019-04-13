package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
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
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  /**
    * The route selection expression for the API.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
}

object UpdateApiRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    ApiKeySelectionExpression: SelectionExpression = null,
    Description: StringWithLengthBetween0And1024 = null,
    DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
    Name: StringWithLengthBetween1And128 = null,
    RouteSelectionExpression: SelectionExpression = null,
    Version: StringWithLengthBetween1And64 = null
  ): UpdateApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId)
    if (ApiKeySelectionExpression != null) __obj.updateDynamic("ApiKeySelectionExpression")(ApiKeySelectionExpression)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisableSchemaValidation)) __obj.updateDynamic("DisableSchemaValidation")(DisableSchemaValidation)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RouteSelectionExpression != null) __obj.updateDynamic("RouteSelectionExpression")(RouteSelectionExpression)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[UpdateApiRequest]
  }
}

