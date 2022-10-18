package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointsResponse extends StObject {
  
  /**
    * List of endpoints
    */
  var Endpoints: js.UndefOr[listOfEndpoint] = js.undefined
  
  /**
    * Use this string to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object DescribeEndpointsResponse {
  
  inline def apply(): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  
  extension [Self <: DescribeEndpointsResponse](x: Self) {
    
    inline def setEndpoints(value: listOfEndpoint): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
