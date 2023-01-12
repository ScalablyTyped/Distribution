package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyDomainIdentityResponse extends StObject {
  
  /**
    * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon SES. As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning.
    */
  var VerificationToken: typings.awsSdk.clientsSesMod.VerificationToken
}
object VerifyDomainIdentityResponse {
  
  inline def apply(VerificationToken: VerificationToken): VerifyDomainIdentityResponse = {
    val __obj = js.Dynamic.literal(VerificationToken = VerificationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainIdentityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyDomainIdentityResponse] (val x: Self) extends AnyVal {
    
    inline def setVerificationToken(value: VerificationToken): Self = StObject.set(x, "VerificationToken", value.asInstanceOf[js.Any])
  }
}
