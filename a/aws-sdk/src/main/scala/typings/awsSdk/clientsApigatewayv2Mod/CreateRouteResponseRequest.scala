package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteResponseRequest extends StObject {
  
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
    * The route response key.
    */
  var RouteResponseKey: SelectionKey
}
object CreateRouteResponseRequest {
  
  inline def apply(ApiId: string, RouteId: string, RouteResponseKey: SelectionKey): CreateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseKey = RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteResponseRequest]
  }
  
  extension [Self <: CreateRouteResponseRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setModelSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ModelSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setModelSelectionExpressionUndefined: Self = StObject.set(x, "ModelSelectionExpression", js.undefined)
    
    inline def setResponseModels(value: RouteModels): Self = StObject.set(x, "ResponseModels", value.asInstanceOf[js.Any])
    
    inline def setResponseModelsUndefined: Self = StObject.set(x, "ResponseModels", js.undefined)
    
    inline def setResponseParameters(value: RouteParameters): Self = StObject.set(x, "ResponseParameters", value.asInstanceOf[js.Any])
    
    inline def setResponseParametersUndefined: Self = StObject.set(x, "ResponseParameters", js.undefined)
    
    inline def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    inline def setRouteResponseKey(value: SelectionKey): Self = StObject.set(x, "RouteResponseKey", value.asInstanceOf[js.Any])
  }
}
