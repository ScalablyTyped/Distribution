package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "string_to_bytes")
@js.native
object stringToBytes extends js.Object {
  def apply(str: String): Uint8Array = js.native
  def apply(str: String, utf8: Boolean): Uint8Array = js.native
}

