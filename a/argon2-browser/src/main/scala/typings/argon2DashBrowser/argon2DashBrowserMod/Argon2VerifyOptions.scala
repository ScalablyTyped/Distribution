package typings.argon2DashBrowser.argon2DashBrowserMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2VerifyOptions extends js.Object {
  var encoded: String | Uint8Array
  var pass: String
  var `type`: js.UndefOr[ArgonType] = js.undefined
}

object Argon2VerifyOptions {
  @scala.inline
  def apply(encoded: String | Uint8Array, pass: String, `type`: ArgonType = null): Argon2VerifyOptions = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2VerifyOptions]
  }
}

