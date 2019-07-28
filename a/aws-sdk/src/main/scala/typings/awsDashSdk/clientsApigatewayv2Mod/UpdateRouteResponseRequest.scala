package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRouteResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The model selection expression for the route response.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * The response models for the route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.undefined
  /**
    * The route response parameters.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
  /**
    * The route ID.
    */
  var RouteId: __string
  /**
    * The route response ID.
    */
  var RouteResponseId: __string
  /**
    * The route response key.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
}

object UpdateRouteResponseRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    RouteId: __string,
    RouteResponseId: __string,
    ModelSelectionExpression: SelectionExpression = null,
    ResponseModels: RouteModels = null,
    ResponseParameters: RouteParameters = null,
    RouteResponseKey: SelectionKey = null
  ): UpdateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, RouteId = RouteId, RouteResponseId = RouteResponseId)
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression)
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels)
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters)
    if (RouteResponseKey != null) __obj.updateDynamic("RouteResponseKey")(RouteResponseKey)
    __obj.asInstanceOf[UpdateRouteResponseRequest]
  }
}

