package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_CFB")
@js.native
class AES_CFB protected ()
  extends typings.asmcryptoJs.cfbMod.AES_CFB {
  def this(key: Uint8Array) = this()
  def this(key: Uint8Array, iv: Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_CFB")
@js.native
object AES_CFB extends js.Object {
  def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
}

