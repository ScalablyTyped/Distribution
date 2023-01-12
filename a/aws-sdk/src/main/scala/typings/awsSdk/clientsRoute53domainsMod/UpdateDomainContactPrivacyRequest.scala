package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainContactPrivacyRequest extends StObject {
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact.  You must specify the same privacy setting for the administrative, registrant, and technical contacts. 
    */
  var AdminPrivacy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain that you want to update the privacy setting for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (domain owner).  You must specify the same privacy setting for the administrative, registrant, and technical contacts. 
    */
  var RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact.  You must specify the same privacy setting for the administrative, registrant, and technical contacts. 
    */
  var TechPrivacy: js.UndefOr[Boolean] = js.undefined
}
object UpdateDomainContactPrivacyRequest {
  
  inline def apply(DomainName: DomainName): UpdateDomainContactPrivacyRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactPrivacyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDomainContactPrivacyRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminPrivacy(value: Boolean): Self = StObject.set(x, "AdminPrivacy", value.asInstanceOf[js.Any])
    
    inline def setAdminPrivacyUndefined: Self = StObject.set(x, "AdminPrivacy", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setRegistrantPrivacy(value: Boolean): Self = StObject.set(x, "RegistrantPrivacy", value.asInstanceOf[js.Any])
    
    inline def setRegistrantPrivacyUndefined: Self = StObject.set(x, "RegistrantPrivacy", js.undefined)
    
    inline def setTechPrivacy(value: Boolean): Self = StObject.set(x, "TechPrivacy", value.asInstanceOf[js.Any])
    
    inline def setTechPrivacyUndefined: Self = StObject.set(x, "TechPrivacy", js.undefined)
  }
}
