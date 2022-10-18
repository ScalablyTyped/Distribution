package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainValidation extends StObject {
  
  /**
    * A fully qualified domain name (FQDN) in the certificate. For example, www.example.com or example.com. 
    */
  var DomainName: DomainNameString
  
  /**
    * Contains the CNAME record that you add to your DNS database for domain validation. For more information, see Use DNS to Validate Domain Ownership. Note: The CNAME information that you need does not include the name of your domain. If you include&#x2028; your domain name in the DNS database CNAME record, validation fails.&#x2028; For example, if the name is "_a79865eb4cd1a6ab990a45779b4e0b96.yourdomain.com", only "_a79865eb4cd1a6ab990a45779b4e0b96" must be used.
    */
  var ResourceRecord: js.UndefOr[typings.awsSdk.clientsAcmMod.ResourceRecord] = js.undefined
  
  /**
    * The domain name that ACM used to send domain validation emails.
    */
  var ValidationDomain: js.UndefOr[DomainNameString] = js.undefined
  
  /**
    * A list of email addresses that ACM used to send domain validation emails.
    */
  var ValidationEmails: js.UndefOr[ValidationEmailList] = js.undefined
  
  /**
    * Specifies the domain validation method.
    */
  var ValidationMethod: js.UndefOr[typings.awsSdk.clientsAcmMod.ValidationMethod] = js.undefined
  
  /**
    * The validation status of the domain name. This can be one of the following values:    PENDING_VALIDATION     SUCCESS    FAILED  
    */
  var ValidationStatus: js.UndefOr[DomainStatus] = js.undefined
}
object DomainValidation {
  
  inline def apply(DomainName: DomainNameString): DomainValidation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidation]
  }
  
  extension [Self <: DomainValidation](x: Self) {
    
    inline def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setResourceRecord(value: ResourceRecord): Self = StObject.set(x, "ResourceRecord", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordUndefined: Self = StObject.set(x, "ResourceRecord", js.undefined)
    
    inline def setValidationDomain(value: DomainNameString): Self = StObject.set(x, "ValidationDomain", value.asInstanceOf[js.Any])
    
    inline def setValidationDomainUndefined: Self = StObject.set(x, "ValidationDomain", js.undefined)
    
    inline def setValidationEmails(value: ValidationEmailList): Self = StObject.set(x, "ValidationEmails", value.asInstanceOf[js.Any])
    
    inline def setValidationEmailsUndefined: Self = StObject.set(x, "ValidationEmails", js.undefined)
    
    inline def setValidationEmailsVarargs(value: String*): Self = StObject.set(x, "ValidationEmails", js.Array(value*))
    
    inline def setValidationMethod(value: ValidationMethod): Self = StObject.set(x, "ValidationMethod", value.asInstanceOf[js.Any])
    
    inline def setValidationMethodUndefined: Self = StObject.set(x, "ValidationMethod", js.undefined)
    
    inline def setValidationStatus(value: DomainStatus): Self = StObject.set(x, "ValidationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "ValidationStatus", js.undefined)
  }
}
