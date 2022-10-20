package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: typings.awsSdk.clientsConnectMod.PhoneNumberId
  
  /**
    * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are claimed to.
    */
  var TargetArn: ARN
}
object UpdatePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: PhoneNumberId, TargetArn: ARN): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
  
  extension [Self <: UpdatePhoneNumberRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setTargetArn(value: ARN): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
