package typings.awsCryptoSha256Browser

import typings.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.ascii
import typings.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.latin1
import typings.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.utf8
import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-browser/build/crossPlatformSha256", JSImport.Namespace)
@js.native
object crossPlatformSha256Mod extends js.Object {
  
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    
    val hash: js.Any = js.native
    
    @JSName("update")
    def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
  }
}
