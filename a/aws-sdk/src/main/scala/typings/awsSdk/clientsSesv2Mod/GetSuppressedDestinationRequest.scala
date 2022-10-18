package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuppressedDestinationRequest extends StObject {
  
  /**
    * The email address that's on the account suppression list.
    */
  var EmailAddress: typings.awsSdk.clientsSesv2Mod.EmailAddress
}
object GetSuppressedDestinationRequest {
  
  inline def apply(EmailAddress: EmailAddress): GetSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuppressedDestinationRequest]
  }
  
  extension [Self <: GetSuppressedDestinationRequest](x: Self) {
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
