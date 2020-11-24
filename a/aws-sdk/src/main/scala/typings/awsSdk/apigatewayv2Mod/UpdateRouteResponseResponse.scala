package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRouteResponseResponse extends js.Object {
  
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
object UpdateRouteResponseResponse {
  
  @scala.inline
  def apply(): UpdateRouteResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRouteResponseResponse]
  }
  
  @scala.inline
  implicit class UpdateRouteResponseResponseOps[Self <: UpdateRouteResponseResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRouteResponseId(value: Id): Self = this.set("RouteResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteResponseId: Self = this.set("RouteResponseId", js.undefined)
    
    @scala.inline
    def setRouteResponseKey(value: SelectionKey): Self = this.set("RouteResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteResponseKey: Self = this.set("RouteResponseKey", js.undefined)
  }
}
