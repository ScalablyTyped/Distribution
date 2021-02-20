package typings.awsCryptoSupportsWebCrypto

import typings.std.SubtleCrypto
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supportsWebCryptoMod {
  
  @JSImport("@aws-crypto/supports-web-crypto/build/supportsWebCrypto", "supportsSecureRandom")
  @js.native
  def supportsSecureRandom(window: Window): Boolean = js.native
  
  @JSImport("@aws-crypto/supports-web-crypto/build/supportsWebCrypto", "supportsSubtleCrypto")
  @js.native
  def supportsSubtleCrypto(subtle: SubtleCrypto): Boolean = js.native
  
  @JSImport("@aws-crypto/supports-web-crypto/build/supportsWebCrypto", "supportsWebCrypto")
  @js.native
  def supportsWebCrypto(window: Window): Boolean = js.native
  
  @JSImport("@aws-crypto/supports-web-crypto/build/supportsWebCrypto", "supportsZeroByteGCM")
  @js.native
  def supportsZeroByteGCM(subtle: SubtleCrypto): js.Promise[Boolean] = js.native
}
