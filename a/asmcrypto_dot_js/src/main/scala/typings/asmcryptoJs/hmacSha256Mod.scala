package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.hmacMod.Hmac
import typings.asmcryptoJs.sha256AsmMod.sha256result
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha256", JSImport.Namespace)
@js.native
object hmacSha256Mod extends js.Object {
  
  @js.native
  class HmacSha256 protected () extends Hmac[Hash[sha256result]] {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
