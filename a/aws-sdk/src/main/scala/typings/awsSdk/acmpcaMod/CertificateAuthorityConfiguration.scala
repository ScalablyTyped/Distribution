package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthorityConfiguration extends StObject {
  
  /**
    * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
    */
  var KeyAlgorithm: typings.awsSdk.acmpcaMod.KeyAlgorithm = js.native
  
  /**
    * Name of the algorithm your private CA uses to sign certificate requests. This parameter should not be confused with the SigningAlgorithm parameter used to sign certificates when they are issued.
    */
  var SigningAlgorithm: typings.awsSdk.acmpcaMod.SigningAlgorithm = js.native
  
  /**
    * Structure that contains X.500 distinguished name information for your private CA.
    */
  var Subject: ASN1Subject = js.native
}
object CertificateAuthorityConfiguration {
  
  @scala.inline
  def apply(KeyAlgorithm: KeyAlgorithm, SigningAlgorithm: SigningAlgorithm, Subject: ASN1Subject): CertificateAuthorityConfiguration = {
    val __obj = js.Dynamic.literal(KeyAlgorithm = KeyAlgorithm.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityConfiguration]
  }
  
  @scala.inline
  implicit class CertificateAuthorityConfigurationMutableBuilder[Self <: CertificateAuthorityConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithm): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: ASN1Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
