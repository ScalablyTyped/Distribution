package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteResponseResponse extends js.Object {
  /**
    * Represents the model selection expression of a route response. Supported only for WebSocket APIs.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * Represents the response models of a route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.native
  /**
    * Represents the response parameters of a route response.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.native
  /**
    * Represents the identifier of a route response.
    */
  var RouteResponseId: js.UndefOr[Id] = js.native
  /**
    * Represents the route response key of a route response.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.native
}

object GetRouteResponseResponse {
  @scala.inline
  def apply(
    ModelSelectionExpression: SelectionExpression = null,
    ResponseModels: RouteModels = null,
    ResponseParameters: RouteParameters = null,
    RouteResponseId: Id = null,
    RouteResponseKey: SelectionKey = null
  ): GetRouteResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression.asInstanceOf[js.Any])
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels.asInstanceOf[js.Any])
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters.asInstanceOf[js.Any])
    if (RouteResponseId != null) __obj.updateDynamic("RouteResponseId")(RouteResponseId.asInstanceOf[js.Any])
    if (RouteResponseKey != null) __obj.updateDynamic("RouteResponseKey")(RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteResponseResponse]
  }
}

