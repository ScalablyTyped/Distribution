package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRouteResponseRequest extends js.Object {
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
    * The route response key.
    */
  var RouteResponseKey: SelectionKey
}

object CreateRouteResponseRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    RouteId: __string,
    RouteResponseKey: SelectionKey,
    ModelSelectionExpression: SelectionExpression = null,
    ResponseModels: RouteModels = null,
    ResponseParameters: RouteParameters = null
  ): CreateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, RouteId = RouteId, RouteResponseKey = RouteResponseKey)
    if (ModelSelectionExpression != null) __obj.updateDynamic("ModelSelectionExpression")(ModelSelectionExpression)
    if (ResponseModels != null) __obj.updateDynamic("ResponseModels")(ResponseModels)
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters)
    __obj.asInstanceOf[CreateRouteResponseRequest]
  }
}

