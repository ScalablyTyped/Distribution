package typings.awsCryptoIe11Detection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msSubtleCryptoMod {
  type EncryptionOrVerificationAlgorithm = typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSAES-PKCS1-v1_5`
  /* Rewritten from type alias, can be one of: 
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-CBC`
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-GCM`
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSA-OAEP`
    - typings.awsCryptoIe11Detection.msSubtleCryptoMod.EncryptionOrVerificationAlgorithm
  */
  type Ie11EncryptionAlgorithm = typings.awsCryptoIe11Detection.msSubtleCryptoMod._Ie11EncryptionAlgorithm | typings.awsCryptoIe11Detection.msSubtleCryptoMod.EncryptionOrVerificationAlgorithm
  type SigningAlgorithm = typings.awsCryptoIe11Detection.msSubtleCryptoMod.HmacAlgorithm
}
