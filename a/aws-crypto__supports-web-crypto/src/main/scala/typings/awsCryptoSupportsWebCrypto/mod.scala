package typings.awsCryptoSupportsWebCrypto

import typings.std.SubtleCrypto
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/supports-web-crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def supportsSecureRandom(window: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsSecureRandom")(window.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def supportsSubtleCrypto(subtle: SubtleCrypto): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsSubtleCrypto")(subtle.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def supportsWebCrypto(window: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebCrypto")(window.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def supportsZeroByteGCM(subtle: SubtleCrypto): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsZeroByteGCM")(subtle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
