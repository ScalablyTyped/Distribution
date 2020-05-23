package typings.asmcryptoJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/aes/cmac", JSImport.Namespace)
@js.native
object cmacMod extends js.Object {
  @js.native
  class AES_CMAC protected () extends js.Object {
    def this(key: Uint8Array) = this()
    val buffer: js.Any = js.native
    var bufferLength: js.Any = js.native
    val cbc: js.Any = js.native
    val k: js.Any = js.native
    var result: Uint8Array | Null = js.native
    def finish(): this.type = js.native
    def process(data: Uint8Array): this.type = js.native
  }
  
  /* static members */
  @js.native
  object AES_CMAC extends js.Object {
    def bytes(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  }
  
}

