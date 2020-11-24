package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersRequest extends js.Object {
  
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
  implicit class ListPhoneNumbersRequestOps[Self <: ListPhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterName(value: PhoneNumberAssociationName): Self = this.set("FilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterName: Self = this.set("FilterName", js.undefined)
    
    @scala.inline
    def setFilterValue(value: String): Self = this.set("FilterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValue: Self = this.set("FilterValue", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ResultMax): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductType: Self = this.set("ProductType", js.undefined)
    
    @scala.inline
    def setStatus(value: PhoneNumberStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
