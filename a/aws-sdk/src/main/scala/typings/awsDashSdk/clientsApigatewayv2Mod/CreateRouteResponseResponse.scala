package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRouteResponseResponse extends js.Object {
  /**
    * Represents the model selection expression of a route response.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * Represents the response models of a route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.undefined
  /**
    * Represents the response parameters of a route response.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
  /**
    * Represents the identifier of a route response.
    */
  var RouteResponseId: js.UndefOr[Id] = js.undefined
  /**
    * Represents the route response key of a route response.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
}

object CreateRouteResponseResponse {
  @scala.inline
  def apply(
    ModelSelectionExpression: SelectionExpression = null,
    ResponseModels: RouteModels = null,
    ResponseParameters: RouteParameters = null,
    RouteResponseId: Id = null,
    RouteResponseKey: SelectionKey = null
  ): CreateRouteResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression)
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels)
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters)
    if (RouteResponseId != null) __obj.updateDynamic("RouteResponseId")(RouteResponseId)
    if (RouteResponseKey != null) __obj.updateDynamic("RouteResponseKey")(RouteResponseKey)
    __obj.asInstanceOf[CreateRouteResponseResponse]
  }
}

