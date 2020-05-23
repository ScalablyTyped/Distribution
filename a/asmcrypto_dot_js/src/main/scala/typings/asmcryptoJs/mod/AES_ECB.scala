package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_ECB")
@js.native
class AES_ECB protected ()
  extends typings.asmcryptoJs.ecbMod.AES_ECB {
  def this(key: Uint8Array) = this()
  def this(key: Uint8Array, padding: Boolean) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_ECB")
@js.native
object AES_ECB extends js.Object {
  def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
}

