package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "HmacSha256")
@js.native
class HmacSha256 protected ()
  extends typings.asmcryptoJs.hmacSha256Mod.HmacSha256 {
  def this(password: Uint8Array) = this()
  def this(password: Uint8Array, verify: Uint8Array) = this()
}

