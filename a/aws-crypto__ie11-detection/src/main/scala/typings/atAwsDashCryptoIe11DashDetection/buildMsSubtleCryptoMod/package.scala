package typings.atAwsDashCryptoIe11DashDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildMsSubtleCryptoMod {
  import typings.atAwsDashCryptoIe11DashDetection.atAwsDashCryptoIe11DashDetectionStrings.`RSAES-PKCS1-v1_5`

  type EncryptionOrVerificationAlgorithm = `RSAES-PKCS1-v1_5`
  /* Rewritten from type alias, can be one of: 
    - typings.atAwsDashCryptoIe11DashDetection.atAwsDashCryptoIe11DashDetectionStrings.`AES-CBC`
    - typings.atAwsDashCryptoIe11DashDetection.atAwsDashCryptoIe11DashDetectionStrings.`AES-GCM`
    - typings.atAwsDashCryptoIe11DashDetection.atAwsDashCryptoIe11DashDetectionStrings.`RSA-OAEP`
    - typings.atAwsDashCryptoIe11DashDetection.buildMsSubtleCryptoMod.EncryptionOrVerificationAlgorithm
  */
  type Ie11EncryptionAlgorithm = _Ie11EncryptionAlgorithm | EncryptionOrVerificationAlgorithm
  type SigningAlgorithm = HmacAlgorithm
}
