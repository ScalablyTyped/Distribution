package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/aes/ofb", JSImport.Namespace)
@js.native
object ofbMod extends js.Object {
  @js.native
  class AES_OFB protected () extends AES {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
    def decrypt(data: Uint8Array): Uint8Array = js.native
    def encrypt(data: Uint8Array): Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object AES_OFB extends js.Object {
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
  }
  
}

