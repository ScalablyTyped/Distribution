package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeCertificateRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial number by calling GetCertificate with the Amazon Resource Name (ARN) of the certificate you want and the ARN of your private CA. The GetCertificate action retrieves the certificate in the PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.   openssl x509 -in file_path -text -noout  You can also copy the serial number from the console or use the DescribeCertificate action in the AWS Certificate Manager API Reference. 
    */
  var CertificateSerial: String128
  
  /**
    * Specifies why you revoked the certificate.
    */
  var RevocationReason: typings.awsSdk.acmpcaMod.RevocationReason
}
object RevokeCertificateRequest {
  
  inline def apply(CertificateAuthorityArn: Arn, CertificateSerial: String128, RevocationReason: RevocationReason): RevokeCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], CertificateSerial = CertificateSerial.asInstanceOf[js.Any], RevocationReason = RevocationReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCertificateRequest]
  }
  
  extension [Self <: RevokeCertificateRequest](x: Self) {
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateSerial(value: String128): Self = StObject.set(x, "CertificateSerial", value.asInstanceOf[js.Any])
    
    inline def setRevocationReason(value: RevocationReason): Self = StObject.set(x, "RevocationReason", value.asInstanceOf[js.Any])
  }
}
