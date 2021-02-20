package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumber extends StObject {
  
  /**
    * The raw value of the phone number.
    */
  var Number: RawPhoneNumber = js.native
  
  /**
    * The type of the phone number.
    */
  var Type: PhoneNumberType = js.native
}
object PhoneNumber {
  
  @scala.inline
  def apply(Number: RawPhoneNumber, Type: PhoneNumberType): PhoneNumber = {
    val __obj = js.Dynamic.literal(Number = Number.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @scala.inline
  implicit class PhoneNumberMutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: RawPhoneNumber): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PhoneNumberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
