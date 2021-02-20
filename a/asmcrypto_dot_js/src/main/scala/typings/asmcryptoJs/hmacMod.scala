package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha1AsmMod.sha1result
import typings.asmcryptoJs.sha256AsmMod.sha256result
import typings.asmcryptoJs.sha512AsmMod.sha512result
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacMod {
  
  @JSImport("asmcrypto.js/dist_es8/hmac/hmac", "Hmac")
  @js.native
  abstract class Hmac[T /* <: Hash[sha1result | sha256result | sha512result] */] protected () extends StObject {
    protected def this(hash: T, password: Uint8Array) = this()
    protected def this(hash: T, password: Uint8Array, verify: Uint8Array) = this()
    
    var BLOCK_SIZE: Double = js.native
    
    var HMAC_SIZE: Double = js.native
    
    def _hmac_init_verify(verify: Uint8Array): Unit = js.native
    
    def finish(): this.type = js.native
    
    var hash: T = js.native
    
    var key: Uint8Array = js.native
    
    def process(data: Uint8Array): this.type = js.native
    
    var result: Uint8Array | Null = js.native
    
    var verify: Uint8Array | Null = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/hmac/hmac", "_hmac_key")
  @js.native
  def hmacKey(hash: Hash[sha1result | sha256result | sha512result], password: Uint8Array): Uint8Array = js.native
}
