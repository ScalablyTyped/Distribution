package typings.awsCryptoSupportsWebCrypto

import typings.std.SubtleCrypto
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/supports-web-crypto", "supportsSecureRandom")
  @js.native
  def supportsSecureRandom(window: Window): Boolean = js.native
  
  @JSImport("@aws-crypto/supports-web-crypto", "supportsSubtleCrypto")
  @js.native
  def supportsSubtleCrypto(subtle: SubtleCrypto): Boolean = js.native
  
  @JSImport("@aws-crypto/supports-web-crypto", "supportsWebCrypto")
  @js.native
  def supportsWebCrypto(window: Window): Boolean = js.native
  
  @JSImport("@aws-crypto/supports-web-crypto", "supportsZeroByteGCM")
  @js.native
  def supportsZeroByteGCM(subtle: SubtleCrypto): js.Promise[Boolean] = js.native
}
