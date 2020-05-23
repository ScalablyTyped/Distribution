package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_CTR")
@js.native
class AES_CTR protected ()
  extends typings.asmcryptoJs.ctrMod.AES_CTR {
  def this(key: Uint8Array, nonce: Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_CTR")
@js.native
object AES_CTR extends js.Object {
  def decrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
}

