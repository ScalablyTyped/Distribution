package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsResponse extends StObject {
  
  /**
    * Displays a list of endpoint properties being retrieved by the service in response to the request.
    */
  var EndpointPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.EndpointPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEndpointsResponse {
  
  inline def apply(): ListEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointPropertiesList(value: EndpointPropertiesList): Self = StObject.set(x, "EndpointPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setEndpointPropertiesListUndefined: Self = StObject.set(x, "EndpointPropertiesList", js.undefined)
    
    inline def setEndpointPropertiesListVarargs(value: EndpointProperties*): Self = StObject.set(x, "EndpointPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
