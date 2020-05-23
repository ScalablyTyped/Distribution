package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/aes/ctr", JSImport.Namespace)
@js.native
object ctrMod extends js.Object {
  @js.native
  class AES_CTR protected () extends AES {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
    var AES_CTR_set_options: js.Any = js.native
    def decrypt(data: Uint8Array): Uint8Array = js.native
    def encrypt(data: Uint8Array): Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object AES_CTR extends js.Object {
    def decrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    def encrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  }
  
}

