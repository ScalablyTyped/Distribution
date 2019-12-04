package typings.atAwsDashCryptoSha256DashBrowser

import typings.atAwsDashCryptoSha256DashBrowser.atAwsDashCryptoSha256DashBrowserStrings.HMAC
import typings.atAwsDashCryptoSha256DashBrowser.atAwsDashCryptoSha256DashBrowserStrings.`SHA-256`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-browser/build/constants", JSImport.Namespace)
@js.native
object buildConstantsMod extends js.Object {
  val EMPTY_DATA_SHA_256: Uint8Array = js.native
  @js.native
  object SHA_256_HASH extends js.Object {
    var name: `SHA-256` = js.native
  }
  
  @js.native
  object SHA_256_HMAC_ALGO extends js.Object {
    var hash: Anon_Name = js.native
    var name: HMAC = js.native
  }
  
}

