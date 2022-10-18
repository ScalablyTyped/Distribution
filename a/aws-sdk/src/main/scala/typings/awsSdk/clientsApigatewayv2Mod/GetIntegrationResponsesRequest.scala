package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationResponsesRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The integration ID.
    */
  var IntegrationId: string
  
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[string] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object GetIntegrationResponsesRequest {
  
  inline def apply(ApiId: string, IntegrationId: string): GetIntegrationResponsesRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationResponsesRequest]
  }
  
  extension [Self <: GetIntegrationResponsesRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationId(value: string): Self = StObject.set(x, "IntegrationId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
