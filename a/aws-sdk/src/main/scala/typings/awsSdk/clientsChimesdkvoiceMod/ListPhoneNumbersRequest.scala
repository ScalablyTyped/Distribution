package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersRequest extends StObject {
  
  /**
    * The filter to limit the number of results.
    */
  var FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined
  
  /**
    * The filter value.
    */
  var FilterValue: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number product types.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  
  /**
    * The status of your organization's phone numbers.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ListPhoneNumbersRequest {
  
  inline def apply(): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    inline def setFilterName(value: PhoneNumberAssociationName): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
    
    inline def setFilterNameUndefined: Self = StObject.set(x, "FilterName", js.undefined)
    
    inline def setFilterValue(value: String): Self = StObject.set(x, "FilterValue", value.asInstanceOf[js.Any])
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "FilterValue", js.undefined)
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
