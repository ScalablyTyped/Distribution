package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAddressBooksResponse extends StObject {
  
  /**
    * The address books that meet the specified set of filter criteria, in sort order.
    */
  var AddressBooks: js.UndefOr[AddressBookDataList] = js.undefined
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The total number of address books returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.undefined
}
object SearchAddressBooksResponse {
  
  inline def apply(): SearchAddressBooksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAddressBooksResponse]
  }
  
  extension [Self <: SearchAddressBooksResponse](x: Self) {
    
    inline def setAddressBooks(value: AddressBookDataList): Self = StObject.set(x, "AddressBooks", value.asInstanceOf[js.Any])
    
    inline def setAddressBooksUndefined: Self = StObject.set(x, "AddressBooks", js.undefined)
    
    inline def setAddressBooksVarargs(value: AddressBookData*): Self = StObject.set(x, "AddressBooks", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
