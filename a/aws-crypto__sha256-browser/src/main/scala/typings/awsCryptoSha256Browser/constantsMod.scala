package typings.awsCryptoSha256Browser

import typings.awsCryptoSha256Browser.anon.Name
import typings.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.HMAC
import typings.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.`SHA-256`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-browser/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val EMPTY_DATA_SHA_256: Uint8Array = js.native
  
  @js.native
  object SHA_256_HASH extends js.Object {
    
    var name: `SHA-256` = js.native
  }
  
  @js.native
  object SHA_256_HMAC_ALGO extends js.Object {
    
    var hash: Name = js.native
    
    var name: HMAC = js.native
  }
}
