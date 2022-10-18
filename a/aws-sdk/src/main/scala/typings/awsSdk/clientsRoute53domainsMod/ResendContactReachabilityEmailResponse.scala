package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResendContactReachabilityEmailResponse extends StObject {
  
  /**
    * The domain name for which you requested a confirmation email.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The email address for the registrant contact at the time that we sent the verification email.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  
  /**
    *  True if the email address for the registrant contact has already been verified, and false otherwise. If the email address has already been verified, we don't send another confirmation email.
    */
  var isAlreadyVerified: js.UndefOr[Boolean] = js.undefined
}
object ResendContactReachabilityEmailResponse {
  
  inline def apply(): ResendContactReachabilityEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResendContactReachabilityEmailResponse]
  }
  
  extension [Self <: ResendContactReachabilityEmailResponse](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setEmailAddress(value: Email): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setIsAlreadyVerified(value: Boolean): Self = StObject.set(x, "isAlreadyVerified", value.asInstanceOf[js.Any])
    
    inline def setIsAlreadyVerifiedUndefined: Self = StObject.set(x, "isAlreadyVerified", js.undefined)
  }
}
