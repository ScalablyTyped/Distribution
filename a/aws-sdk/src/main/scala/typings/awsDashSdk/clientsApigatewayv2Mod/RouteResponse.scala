package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResponse extends js.Object {
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
  var RouteResponseKey: SelectionKey
}

object RouteResponse {
  @scala.inline
  def apply(
    RouteResponseKey: SelectionKey,
    ModelSelectionExpression: SelectionExpression = null,
    ResponseModels: RouteModels = null,
    ResponseParameters: RouteParameters = null,
    RouteResponseId: Id = null
  ): RouteResponse = {
    val __obj = js.Dynamic.literal(RouteResponseKey = RouteResponseKey)
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression)
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels)
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters)
    if (RouteResponseId != null) __obj.updateDynamic("RouteResponseId")(RouteResponseId)
    __obj.asInstanceOf[RouteResponse]
  }
}

