package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyEmailAddressRequest extends StObject {
  
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address
}
object VerifyEmailAddressRequest {
  
  inline def apply(EmailAddress: Address): VerifyEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyEmailAddressRequest]
  }
  
  extension [Self <: VerifyEmailAddressRequest](x: Self) {
    
    inline def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
