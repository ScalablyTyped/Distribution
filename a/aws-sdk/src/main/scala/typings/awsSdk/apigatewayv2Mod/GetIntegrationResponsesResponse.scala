package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationResponsesResponse extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfIntegrationResponse] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typings.awsSdk.apigatewayv2Mod.NextToken] = js.undefined
}
object GetIntegrationResponsesResponse {
  
  @scala.inline
  def apply(): GetIntegrationResponsesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntegrationResponsesResponse]
  }
  
  @scala.inline
  implicit class GetIntegrationResponsesResponseMutableBuilder[Self <: GetIntegrationResponsesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfIntegrationResponse): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IntegrationResponse*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
