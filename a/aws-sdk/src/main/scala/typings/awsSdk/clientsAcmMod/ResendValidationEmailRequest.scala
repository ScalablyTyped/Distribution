package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResendValidationEmailRequest extends StObject {
  
  /**
    * String that contains the ARN of the requested certificate. The certificate ARN is generated and returned by the RequestCertificate action as soon as the request is made. By default, using this parameter causes email to be sent to all top-level domains you specified in the certificate request. The ARN must be of the form:   arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: Arn
  
  /**
    * The fully qualified domain name (FQDN) of the certificate that needs to be validated.
    */
  var Domain: DomainNameString
  
  /**
    * The base validation domain that will act as the suffix of the email addresses that are used to send the emails. This must be the same as the Domain value or a superdomain of the Domain value. For example, if you requested a certificate for site.subdomain.example.com and specify a ValidationDomain of subdomain.example.com, ACM sends email to the domain registrant, technical contact, and administrative contact in WHOIS and the following five addresses:   admin@subdomain.example.com   administrator@subdomain.example.com   hostmaster@subdomain.example.com   postmaster@subdomain.example.com   webmaster@subdomain.example.com  
    */
  var ValidationDomain: DomainNameString
}
object ResendValidationEmailRequest {
  
  inline def apply(CertificateArn: Arn, Domain: DomainNameString, ValidationDomain: DomainNameString): ResendValidationEmailRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], ValidationDomain = ValidationDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResendValidationEmailRequest]
  }
  
  extension [Self <: ResendValidationEmailRequest](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: DomainNameString): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setValidationDomain(value: DomainNameString): Self = StObject.set(x, "ValidationDomain", value.asInstanceOf[js.Any])
  }
}
