package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateRequest extends StObject {
  
  /**
    * The certificate to import.
    */
  var Certificate: CertificateBodyBlob
  
  /**
    * The Amazon Resource Name (ARN) of an imported certificate to replace. To import a new certificate, omit this field. 
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The PEM encoded certificate chain.
    */
  var CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined
  
  /**
    * The private key that matches the public key in the certificate.
    */
  var PrivateKey: PrivateKeyBlob
  
  /**
    * One or more resource tags to associate with the imported certificate.  Note: You cannot apply tags when reimporting a certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportCertificateRequest {
  
  inline def apply(Certificate: CertificateBodyBlob, PrivateKey: PrivateKeyBlob): ImportCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: CertificateBodyBlob): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateChain(value: CertificateChainBlob): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    inline def setPrivateKey(value: PrivateKeyBlob): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
