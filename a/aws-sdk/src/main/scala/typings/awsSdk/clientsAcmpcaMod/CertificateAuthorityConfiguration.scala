package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthorityConfiguration extends StObject {
  
  /**
    * Specifies information to be added to the extension section of the certificate signing request (CSR).
    */
  var CsrExtensions: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.CsrExtensions] = js.undefined
  
  /**
    * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
    */
  var KeyAlgorithm: typings.awsSdk.clientsAcmpcaMod.KeyAlgorithm
  
  /**
    * Name of the algorithm your private CA uses to sign certificate requests. This parameter should not be confused with the SigningAlgorithm parameter used to sign certificates when they are issued.
    */
  var SigningAlgorithm: typings.awsSdk.clientsAcmpcaMod.SigningAlgorithm
  
  /**
    * Structure that contains X.500 distinguished name information for your private CA.
    */
  var Subject: ASN1Subject
}
object CertificateAuthorityConfiguration {
  
  inline def apply(KeyAlgorithm: KeyAlgorithm, SigningAlgorithm: SigningAlgorithm, Subject: ASN1Subject): CertificateAuthorityConfiguration = {
    val __obj = js.Dynamic.literal(KeyAlgorithm = KeyAlgorithm.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateAuthorityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCsrExtensions(value: CsrExtensions): Self = StObject.set(x, "CsrExtensions", value.asInstanceOf[js.Any])
    
    inline def setCsrExtensionsUndefined: Self = StObject.set(x, "CsrExtensions", js.undefined)
    
    inline def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithm(value: SigningAlgorithm): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: ASN1Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
