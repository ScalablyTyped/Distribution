package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteResponse extends StObject {
  
  /**
    * Represents the model selection expression of a route response. Supported only for WebSocket APIs.
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
  
  inline def apply(RouteResponseKey: SelectionKey): RouteResponse = {
    val __obj = js.Dynamic.literal(RouteResponseKey = RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteResponse] (val x: Self) extends AnyVal {
    
    inline def setModelSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ModelSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setModelSelectionExpressionUndefined: Self = StObject.set(x, "ModelSelectionExpression", js.undefined)
    
    inline def setResponseModels(value: RouteModels): Self = StObject.set(x, "ResponseModels", value.asInstanceOf[js.Any])
    
    inline def setResponseModelsUndefined: Self = StObject.set(x, "ResponseModels", js.undefined)
    
    inline def setResponseParameters(value: RouteParameters): Self = StObject.set(x, "ResponseParameters", value.asInstanceOf[js.Any])
    
    inline def setResponseParametersUndefined: Self = StObject.set(x, "ResponseParameters", js.undefined)
    
    inline def setRouteResponseId(value: Id): Self = StObject.set(x, "RouteResponseId", value.asInstanceOf[js.Any])
    
    inline def setRouteResponseIdUndefined: Self = StObject.set(x, "RouteResponseId", js.undefined)
    
    inline def setRouteResponseKey(value: SelectionKey): Self = StObject.set(x, "RouteResponseKey", value.asInstanceOf[js.Any])
  }
}
