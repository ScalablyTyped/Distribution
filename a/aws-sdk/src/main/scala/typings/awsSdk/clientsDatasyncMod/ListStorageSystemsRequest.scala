package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageSystemsRequest extends StObject {
  
  /**
    * Specifies how many results you want in the response.
    */
  var MaxResults: js.UndefOr[DiscoveryMaxResults] = js.undefined
  
  /**
    * Specifies an opaque string that indicates the position to begin the next list of results in the response. 
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
}
object ListStorageSystemsRequest {
  
  inline def apply(): ListStorageSystemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStorageSystemsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStorageSystemsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: DiscoveryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
