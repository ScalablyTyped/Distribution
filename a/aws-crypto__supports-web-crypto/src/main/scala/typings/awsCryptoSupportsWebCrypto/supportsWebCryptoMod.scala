package typings.awsCryptoSupportsWebCrypto

import typings.std.SubtleCrypto
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/supports-web-crypto/build/supportsWebCrypto", JSImport.Namespace)
@js.native
object supportsWebCryptoMod extends js.Object {
  def supportsSecureRandom(window: Window_): Boolean = js.native
  def supportsSubtleCrypto(subtle: SubtleCrypto): Boolean = js.native
  def supportsWebCrypto(window: Window_): Boolean = js.native
  def supportsZeroByteGCM(subtle: SubtleCrypto): js.Promise[Boolean] = js.native
}

