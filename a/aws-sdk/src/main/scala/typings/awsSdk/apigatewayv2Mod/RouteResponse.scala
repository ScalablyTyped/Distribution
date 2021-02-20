package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteResponse extends StObject {
  
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
  var RouteResponseKey: SelectionKey = js.native
}
object RouteResponse {
  
  @scala.inline
  def apply(RouteResponseKey: SelectionKey): RouteResponse = {
    val __obj = js.Dynamic.literal(RouteResponseKey = RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResponse]
  }
  
  @scala.inline
  implicit class RouteResponseMutableBuilder[Self <: RouteResponse] (val x: Self) extends AnyVal {
    
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
    def setRouteResponseId(value: Id): Self = StObject.set(x, "RouteResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseIdUndefined: Self = StObject.set(x, "RouteResponseId", js.undefined)
    
    @scala.inline
    def setRouteResponseKey(value: SelectionKey): Self = StObject.set(x, "RouteResponseKey", value.asInstanceOf[js.Any])
  }
}
