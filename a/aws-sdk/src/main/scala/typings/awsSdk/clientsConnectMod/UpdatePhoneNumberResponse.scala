package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var PhoneNumberArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberId] = js.undefined
}
object UpdatePhoneNumberResponse {
  
  inline def apply(): UpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhoneNumberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePhoneNumberResponse] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumberArn(value: ARN): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArnUndefined: Self = StObject.set(x, "PhoneNumberArn", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
  }
}
