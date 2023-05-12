package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCertificateAuthorityRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * Contains information to enable Online Certificate Status Protocol (OCSP) support, to enable a certificate revocation list (CRL), to enable both, or to enable neither. If this parameter is not supplied, existing capibilites remain unchanged. For more information, see the OcspConfiguration and CrlConfiguration types.  The following requirements apply to revocation configurations.   A configuration disabling CRLs or OCSP must contain only the Enabled=False parameter, and will fail if other parameters such as CustomCname or ExpirationInDays are included.   In a CRL configuration, the S3BucketName parameter must conform to Amazon S3 bucket naming rules.   A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must conform to RFC2396 restrictions on the use of special characters in a CNAME.    In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol prefix such as "http://" or "https://".   
    */
  var RevocationConfiguration: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.RevocationConfiguration] = js.undefined
  
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
}
object UpdateCertificateAuthorityRequest {
  
  inline def apply(CertificateAuthorityArn: Arn): UpdateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setRevocationConfiguration(value: RevocationConfiguration): Self = StObject.set(x, "RevocationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRevocationConfigurationUndefined: Self = StObject.set(x, "RevocationConfiguration", js.undefined)
    
    inline def setStatus(value: CertificateAuthorityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
