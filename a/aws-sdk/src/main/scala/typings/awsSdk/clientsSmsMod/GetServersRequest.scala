package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServersRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The server addresses.
    */
  var vmServerAddressList: js.UndefOr[VmServerAddressList] = js.undefined
}
object GetServersRequest {
  
  inline def apply(): GetServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServersRequest]
  }
  
  extension [Self <: GetServersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVmServerAddressList(value: VmServerAddressList): Self = StObject.set(x, "vmServerAddressList", value.asInstanceOf[js.Any])
    
    inline def setVmServerAddressListUndefined: Self = StObject.set(x, "vmServerAddressList", js.undefined)
    
    inline def setVmServerAddressListVarargs(value: VmServerAddress*): Self = StObject.set(x, "vmServerAddressList", js.Array(value*))
  }
}
