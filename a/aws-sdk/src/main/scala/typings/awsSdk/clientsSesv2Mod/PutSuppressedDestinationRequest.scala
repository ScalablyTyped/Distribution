package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSuppressedDestinationRequest extends StObject {
  
  /**
    * The email address that should be added to the suppression list for your account.
    */
  var EmailAddress: typings.awsSdk.clientsSesv2Mod.EmailAddress
  
  /**
    * The factors that should cause the email address to be added to the suppression list for your account.
    */
  var Reason: SuppressionListReason
}
object PutSuppressedDestinationRequest {
  
  inline def apply(EmailAddress: EmailAddress, Reason: SuppressionListReason): PutSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSuppressedDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSuppressedDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setReason(value: SuppressionListReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
