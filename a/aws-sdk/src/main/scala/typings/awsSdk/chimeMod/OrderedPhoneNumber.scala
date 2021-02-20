package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderedPhoneNumber extends StObject {
  
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.native
  
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.native
}
object OrderedPhoneNumber {
  
  @scala.inline
  def apply(): OrderedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedPhoneNumber]
  }
  
  @scala.inline
  implicit class OrderedPhoneNumberMutableBuilder[Self <: OrderedPhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE164PhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "E164PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumberUndefined: Self = StObject.set(x, "E164PhoneNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: OrderedPhoneNumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
