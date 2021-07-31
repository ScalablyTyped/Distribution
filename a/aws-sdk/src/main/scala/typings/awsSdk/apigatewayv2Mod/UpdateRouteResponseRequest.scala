package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRouteResponseRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The model selection expression for the route response. Supported only for WebSocket APIs.
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
  var RouteId: string
  
  /**
    * The route response ID.
    */
  var RouteResponseId: string
  
  /**
    * The route response key.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
}
object UpdateRouteResponseRequest {
  
  @scala.inline
  def apply(ApiId: string, RouteId: string, RouteResponseId: string): UpdateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseId = RouteResponseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteResponseRequest]
  }
  
  @scala.inline
  implicit class UpdateRouteResponseRequestMutableBuilder[Self <: UpdateRouteResponseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ModelSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSelectionExpressionUndefined: Self = StObject.set(x, "ModelSelectionExpression", js.undefined)
    
    @scala.inline
    def setResponseModels(value: RouteModels): Self = StObject.set(x, "ResponseModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModelsUndefined: Self = StObject.set(x, "ResponseModels", js.undefined)
    
    @scala.inline
    def setResponseParameters(value: RouteParameters): Self = StObject.set(x, "ResponseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParametersUndefined: Self = StObject.set(x, "ResponseParameters", js.undefined)
    
    @scala.inline
    def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseId(value: string): Self = StObject.set(x, "RouteResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseKey(value: SelectionKey): Self = StObject.set(x, "RouteResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseKeyUndefined: Self = StObject.set(x, "RouteResponseKey", js.undefined)
  }
}
