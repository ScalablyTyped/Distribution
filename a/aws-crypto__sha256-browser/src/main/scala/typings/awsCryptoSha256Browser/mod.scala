package typings.awsCryptoSha256Browser

import typings.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Ie11Sha256 ()
    extends typings.awsCryptoSha256Browser.ie11Sha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @js.native
  class Sha256 ()
    extends typings.awsCryptoSha256Browser.crossPlatformSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @js.native
  class WebCryptoSha256 ()
    extends typings.awsCryptoSha256Browser.webCryptoSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
}
