package typings.argon2DashBrowser.argon2DashBrowserMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2BrowserHashResult extends js.Object {
  var encoded: String
  var hash: Uint8Array
  var hashHex: String
}

object Argon2BrowserHashResult {
  @scala.inline
  def apply(encoded: String, hash: Uint8Array, hashHex: String): Argon2BrowserHashResult = {
    val __obj = js.Dynamic.literal(encoded = encoded, hash = hash, hashHex = hashHex)
  
    __obj.asInstanceOf[Argon2BrowserHashResult]
  }
}

