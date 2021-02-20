package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersRequest extends StObject {
  
  /**
    * The filter to use to limit the number of results.
    */
  var FilterName: js.UndefOr[PhoneNumberAssociationName] = js.native
  
  /**
    * The value to use for the filter.
    */
  var FilterValue: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
  
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.native
}
object ListPhoneNumbersRequest {
  
  @scala.inline
  def apply(): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
  
  @scala.inline
  implicit class ListPhoneNumbersRequestMutableBuilder[Self <: ListPhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterName(value: PhoneNumberAssociationName): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNameUndefined: Self = StObject.set(x, "FilterName", js.undefined)
    
    @scala.inline
    def setFilterValue(value: String): Self = StObject.set(x, "FilterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterValueUndefined: Self = StObject.set(x, "FilterValue", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
    
    @scala.inline
    def setStatus(value: PhoneNumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
