package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participant extends StObject {
  
  /**
    * The participant's phone number.
    */
  var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  
  /**
    * The participant's proxy phone number.
    */
  var ProxyPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
}
object Participant {
  
  inline def apply(): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setProxyPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "ProxyPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setProxyPhoneNumberUndefined: Self = StObject.set(x, "ProxyPhoneNumber", js.undefined)
  }
}
