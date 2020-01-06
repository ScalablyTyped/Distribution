package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRouteResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The model selection expression for the route response. Supported only for WebSocket APIs.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The response models for the route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.native
  /**
    * The route response parameters.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.native
  /**
    * The route ID.
    */
  var RouteId: __string = js.native
  /**
    * The route response ID.
    */
  var RouteResponseId: __string = js.native
  /**
    * The route response key.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.native
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
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseId = RouteResponseId.asInstanceOf[js.Any])
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression.asInstanceOf[js.Any])
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels.asInstanceOf[js.Any])
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters.asInstanceOf[js.Any])
    if (RouteResponseKey != null) __obj.updateDynamic("RouteResponseKey")(RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteResponseRequest]
  }
}

