package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsByPlatformApplicationResponse extends StObject {
  
  /**
    * Endpoints returned for ListEndpointsByPlatformApplication action.
    */
  var Endpoints: js.UndefOr[ListOfEndpoints] = js.undefined
  
  /**
    * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEndpointsByPlatformApplicationResponse {
  
  inline def apply(): ListEndpointsByPlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
  }
  
  extension [Self <: ListEndpointsByPlatformApplicationResponse](x: Self) {
    
    inline def setEndpoints(value: ListOfEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint_ *): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
