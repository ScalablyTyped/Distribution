package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPeeringsResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * Lists the transit gateway peerings for the ListPeerings request.
    */
  var Peerings: js.UndefOr[PeeringList] = js.undefined
}
object ListPeeringsResponse {
  
  inline def apply(): ListPeeringsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPeeringsResponse]
  }
  
  extension [Self <: ListPeeringsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPeerings(value: PeeringList): Self = StObject.set(x, "Peerings", value.asInstanceOf[js.Any])
    
    inline def setPeeringsUndefined: Self = StObject.set(x, "Peerings", js.undefined)
    
    inline def setPeeringsVarargs(value: Peering*): Self = StObject.set(x, "Peerings", js.Array(value*))
  }
}
