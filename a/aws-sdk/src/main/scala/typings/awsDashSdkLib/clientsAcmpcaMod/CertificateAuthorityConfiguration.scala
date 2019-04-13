package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthorityConfiguration extends js.Object {
  /**
    * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate.
    */
  var KeyAlgorithm: awsDashSdkLib.clientsAcmpcaMod.KeyAlgorithm
  /**
    * Name of the algorithm your private CA uses to sign certificate requests.
    */
  var SigningAlgorithm: awsDashSdkLib.clientsAcmpcaMod.SigningAlgorithm
  /**
    * Structure that contains X.500 distinguished name information for your private CA.
    */
  var Subject: ASN1Subject
}

object CertificateAuthorityConfiguration {
  @scala.inline
  def apply(KeyAlgorithm: KeyAlgorithm, SigningAlgorithm: SigningAlgorithm, Subject: ASN1Subject): CertificateAuthorityConfiguration = {
    val __obj = js.Dynamic.literal(KeyAlgorithm = KeyAlgorithm.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any], Subject = Subject)
  
    __obj.asInstanceOf[CertificateAuthorityConfiguration]
  }
}

