package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkChangeEventsResponse extends StObject {
  
  /**
    * The response to GetCoreNetworkChangeEventsRequest.
    */
  var CoreNetworkChangeEvents: js.UndefOr[CoreNetworkChangeEventList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetCoreNetworkChangeEventsResponse {
  
  inline def apply(): GetCoreNetworkChangeEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoreNetworkChangeEventsResponse]
  }
  
  extension [Self <: GetCoreNetworkChangeEventsResponse](x: Self) {
    
    inline def setCoreNetworkChangeEvents(value: CoreNetworkChangeEventList): Self = StObject.set(x, "CoreNetworkChangeEvents", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkChangeEventsUndefined: Self = StObject.set(x, "CoreNetworkChangeEvents", js.undefined)
    
    inline def setCoreNetworkChangeEventsVarargs(value: CoreNetworkChangeEvent*): Self = StObject.set(x, "CoreNetworkChangeEvents", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
