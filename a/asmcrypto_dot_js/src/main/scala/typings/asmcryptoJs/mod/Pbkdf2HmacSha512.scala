package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "Pbkdf2HmacSha512")
@js.native
object Pbkdf2HmacSha512 extends js.Object {
  def apply(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = js.native
}

