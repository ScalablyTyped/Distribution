package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainValidationOption extends StObject {
  
  /**
    * A fully qualified domain name (FQDN) in the certificate request.
    */
  var DomainName: DomainNameString
  
  /**
    * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the email addresses that you want ACM to use. This must be the same as the DomainName value or a superdomain of the DomainName value. For example, if you request a certificate for testing.example.com, you can specify example.com for this value. In that case, ACM sends domain validation emails to the following five addresses:   admin@example.com   administrator@example.com   hostmaster@example.com   postmaster@example.com   webmaster@example.com  
    */
  var ValidationDomain: DomainNameString
}
object DomainValidationOption {
  
  inline def apply(DomainName: DomainNameString, ValidationDomain: DomainNameString): DomainValidationOption = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ValidationDomain = ValidationDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainValidationOption] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setValidationDomain(value: DomainNameString): Self = StObject.set(x, "ValidationDomain", value.asInstanceOf[js.Any])
  }
}
