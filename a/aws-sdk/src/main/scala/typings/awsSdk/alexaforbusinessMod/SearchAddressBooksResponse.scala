package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAddressBooksResponse extends StObject {
  
  /**
    * The address books that meet the specified set of filter criteria, in sort order.
    */
  var AddressBooks: js.UndefOr[AddressBookDataList] = js.native
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The total number of address books returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}
object SearchAddressBooksResponse {
  
  @scala.inline
  def apply(): SearchAddressBooksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAddressBooksResponse]
  }
  
  @scala.inline
  implicit class SearchAddressBooksResponseMutableBuilder[Self <: SearchAddressBooksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBooks(value: AddressBookDataList): Self = StObject.set(x, "AddressBooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressBooksUndefined: Self = StObject.set(x, "AddressBooks", js.undefined)
    
    @scala.inline
    def setAddressBooksVarargs(value: AddressBookData*): Self = StObject.set(x, "AddressBooks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
