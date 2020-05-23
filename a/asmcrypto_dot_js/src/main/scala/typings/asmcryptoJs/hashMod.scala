package typings.asmcryptoJs

import typings.asmcryptoJs.sha1AsmMod.sha1result
import typings.asmcryptoJs.sha256AsmMod.sha256result
import typings.asmcryptoJs.sha512AsmMod.sha512result
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/hash/hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  @js.native
  abstract class Hash[T /* <: sha1result | sha256result | sha512result */] () extends js.Object {
    var BLOCK_SIZE: Double = js.native
    var HASH_SIZE: Double = js.native
    var asm: T = js.native
    var heap: Uint8Array = js.native
    var len: Double = js.native
    var pos: Double = js.native
    var result: Uint8Array | Null = js.native
    def finish(): this.type = js.native
    def process(data: Uint8Array): this.type = js.native
    def reset(): this.type = js.native
  }
  
}

