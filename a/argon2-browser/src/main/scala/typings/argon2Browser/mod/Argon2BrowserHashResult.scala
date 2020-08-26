package typings.argon2Browser.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argon2BrowserHashResult extends js.Object {
  var encoded: String = js.native
  var hash: Uint8Array = js.native
  var hashHex: String = js.native
}

object Argon2BrowserHashResult {
  @scala.inline
  def apply(encoded: String, hash: Uint8Array, hashHex: String): Argon2BrowserHashResult = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashHex = hashHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2BrowserHashResult]
  }
  @scala.inline
  implicit class Argon2BrowserHashResultOps[Self <: Argon2BrowserHashResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncoded(value: String): Self = this.set("encoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Uint8Array): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashHex(value: String): Self = this.set("hashHex", value.asInstanceOf[js.Any])
  }
  
}

