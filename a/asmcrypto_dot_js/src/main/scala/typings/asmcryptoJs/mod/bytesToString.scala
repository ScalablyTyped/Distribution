package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "bytes_to_string")
@js.native
object bytesToString extends js.Object {
  def apply(bytes: Uint8Array): String = js.native
  def apply(bytes: Uint8Array, utf8: Boolean): String = js.native
}

