package typings.awsCryptoSha256Browser

import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-browser/build/webCryptoSha256", JSImport.Namespace)
@js.native
object webCryptoSha256Mod extends js.Object {
  
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    
    val key: js.Any = js.native
    
    var toHash: js.Any = js.native
  }
}
