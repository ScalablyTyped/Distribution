package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDestinationsResponse extends StObject {
  
  /**
    * The list of destinations.
    */
  var DestinationList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationList] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListDestinationsResponse {
  
  inline def apply(): ListDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDestinationsResponse]
  }
  
  extension [Self <: ListDestinationsResponse](x: Self) {
    
    inline def setDestinationList(value: DestinationList): Self = StObject.set(x, "DestinationList", value.asInstanceOf[js.Any])
    
    inline def setDestinationListUndefined: Self = StObject.set(x, "DestinationList", js.undefined)
    
    inline def setDestinationListVarargs(value: Destinations*): Self = StObject.set(x, "DestinationList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
