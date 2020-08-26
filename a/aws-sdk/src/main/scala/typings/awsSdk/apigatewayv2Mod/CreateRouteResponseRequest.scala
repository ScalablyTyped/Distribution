package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
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
  var RouteId: string = js.native
  /**
    * The route response key.
    */
  var RouteResponseKey: SelectionKey = js.native
}

object CreateRouteResponseRequest {
  @scala.inline
  def apply(ApiId: string, RouteId: string, RouteResponseKey: SelectionKey): CreateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseKey = RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteResponseRequest]
  }
  @scala.inline
  implicit class CreateRouteResponseRequestOps[Self <: CreateRouteResponseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteId(value: string): Self = this.set("RouteId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteResponseKey(value: SelectionKey): Self = this.set("RouteResponseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelSelectionExpression(value: SelectionExpression): Self = this.set("ModelSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelSelectionExpression: Self = this.set("ModelSelectionExpression", js.undefined)
    @scala.inline
    def setResponseModels(value: RouteModels): Self = this.set("ResponseModels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseModels: Self = this.set("ResponseModels", js.undefined)
    @scala.inline
    def setResponseParameters(value: RouteParameters): Self = this.set("ResponseParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseParameters: Self = this.set("ResponseParameters", js.undefined)
  }
  
}

