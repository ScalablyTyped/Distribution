package typings.awsCryptoIe11Detection.msSubtleCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.deriveKey
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.deriveBits
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey
  - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey
*/
trait KeyUsage extends js.Object

object KeyUsage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decrypt: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt = this.cast("decrypt")
  @scala.inline
  def deriveBits: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.deriveBits = this.cast("deriveBits")
  @scala.inline
  def deriveKey: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.deriveKey = this.cast("deriveKey")
  @scala.inline
  def encrypt: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt = this.cast("encrypt")
  @scala.inline
  def sign: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign = this.cast("sign")
  @scala.inline
  def unwrapKey: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey = this.cast("unwrapKey")
  @scala.inline
  def verify: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify = this.cast("verify")
  @scala.inline
  def wrapKey: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey = this.cast("wrapKey")
}

