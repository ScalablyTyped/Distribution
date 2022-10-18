package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleasePhoneNumberRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: typings.awsSdk.clientsConnectMod.PhoneNumberId
}
object ReleasePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: PhoneNumberId): ReleasePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleasePhoneNumberRequest]
  }
  
  extension [Self <: ReleasePhoneNumberRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
