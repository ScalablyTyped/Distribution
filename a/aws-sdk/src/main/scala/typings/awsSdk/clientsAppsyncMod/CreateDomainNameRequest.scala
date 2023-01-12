package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainNameRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate.
    */
  var certificateArn: CertificateArn
  
  /**
    * A description of the DomainName.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The domain name.
    */
  var domainName: DomainName
}
object CreateDomainNameRequest {
  
  inline def apply(certificateArn: CertificateArn, domainName: DomainName): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainNameRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
