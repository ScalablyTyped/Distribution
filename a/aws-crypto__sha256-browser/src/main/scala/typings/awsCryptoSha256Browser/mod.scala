package typings.awsCryptoSha256Browser

import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/sha256-browser", "Ie11Sha256")
  @js.native
  class Ie11Sha256 ()
    extends typings.awsCryptoSha256Browser.ie11Sha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @JSImport("@aws-crypto/sha256-browser", "Sha256")
  @js.native
  class Sha256 ()
    extends typings.awsCryptoSha256Browser.crossPlatformSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @JSImport("@aws-crypto/sha256-browser", "WebCryptoSha256")
  @js.native
  class WebCryptoSha256 ()
    extends typings.awsCryptoSha256Browser.webCryptoSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
}
