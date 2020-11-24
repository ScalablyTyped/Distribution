package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAvailablePhoneNumbersRequest extends js.Object {
  
  /**
    * The area code used to filter results.
    */
  var AreaCode: js.UndefOr[String] = js.native
  
  /**
    * The city used to filter results.
    */
  var City: js.UndefOr[String] = js.native
  
  /**
    * The country used to filter results.
    */
  var Country: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The state used to filter results.
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The toll-free prefix that you use to filter results.
    */
  var TollFreePrefix: js.UndefOr[typings.awsSdk.chimeMod.TollFreePrefix] = js.native
}
object SearchAvailablePhoneNumbersRequest {
  
  @scala.inline
  def apply(): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
  
  @scala.inline
  implicit class SearchAvailablePhoneNumbersRequestOps[Self <: SearchAvailablePhoneNumbersRequest] (val x: Self) extends AnyVal {
    
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
    def setAreaCode(value: String): Self = this.set("AreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaCode: Self = this.set("AreaCode", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PhoneNumberMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTollFreePrefix(value: TollFreePrefix): Self = this.set("TollFreePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTollFreePrefix: Self = this.set("TollFreePrefix", js.undefined)
  }
}
