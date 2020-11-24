package typings.awsCryptoSupportsWebCrypto

import typings.std.SubtleCrypto
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/supports-web-crypto/build/supportsWebCrypto", JSImport.Namespace)
@js.native
object supportsWebCryptoMod extends js.Object {
  
  def supportsSecureRandom(window: Window): Boolean = js.native
  
  def supportsSubtleCrypto(subtle: SubtleCrypto): Boolean = js.native
  
  def supportsWebCrypto(window: Window): Boolean = js.native
  
  def supportsZeroByteGCM(subtle: SubtleCrypto): js.Promise[Boolean] = js.native
}
