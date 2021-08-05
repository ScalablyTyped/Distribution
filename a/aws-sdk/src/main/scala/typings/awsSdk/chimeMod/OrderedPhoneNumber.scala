package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedPhoneNumber extends StObject {
  
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.undefined
  
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
}
object OrderedPhoneNumber {
  
  inline def apply(): OrderedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedPhoneNumber]
  }
  
  extension [Self <: OrderedPhoneNumber](x: Self) {
    
    inline def setE164PhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "E164PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setE164PhoneNumberUndefined: Self = StObject.set(x, "E164PhoneNumber", js.undefined)
    
    inline def setStatus(value: OrderedPhoneNumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
