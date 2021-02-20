package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAvailablePhoneNumbersResponse extends StObject {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
}
object SearchAvailablePhoneNumbersResponse {
  
  @scala.inline
  def apply(): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
  
  @scala.inline
  implicit class SearchAvailablePhoneNumbersResponseMutableBuilder[Self <: SearchAvailablePhoneNumbersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumbersUndefined: Self = StObject.set(x, "E164PhoneNumbers", js.undefined)
    
    @scala.inline
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value :_*))
  }
}
