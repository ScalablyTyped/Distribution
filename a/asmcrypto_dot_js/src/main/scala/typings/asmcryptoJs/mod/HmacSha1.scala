package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "HmacSha1")
@js.native
class HmacSha1 protected ()
  extends typings.asmcryptoJs.hmacSha1Mod.HmacSha1 {
  def this(password: Uint8Array) = this()
  def this(password: Uint8Array, verify: Uint8Array) = this()
}

