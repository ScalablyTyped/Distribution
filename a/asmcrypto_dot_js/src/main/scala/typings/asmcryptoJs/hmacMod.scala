package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha1AsmMod.sha1result
import typings.asmcryptoJs.sha256AsmMod.sha256result
import typings.asmcryptoJs.sha512AsmMod.sha512result
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/hmac/hmac", JSImport.Namespace)
@js.native
object hmacMod extends js.Object {
  @js.native
  abstract class Hmac[T /* <: Hash[sha1result | sha256result | sha512result] */] protected () extends js.Object {
    protected def this(hash: T, password: Uint8Array) = this()
    protected def this(hash: T, password: Uint8Array, verify: Uint8Array) = this()
    var BLOCK_SIZE: Double = js.native
    var HMAC_SIZE: Double = js.native
    var hash: T = js.native
    var key: Uint8Array = js.native
    var result: Uint8Array | Null = js.native
    var verify: Uint8Array | Null = js.native
    def _hmac_init_verify(verify: Uint8Array): Unit = js.native
    def finish(): this.type = js.native
    def process(data: Uint8Array): this.type = js.native
  }
  
  @JSName("_hmac_key")
  def hmacKey(hash: Hash[sha1result | sha256result | sha512result], password: Uint8Array): Uint8Array = js.native
}

