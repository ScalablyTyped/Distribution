package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.hmacMod.Hmac
import typings.asmcryptoJs.sha1AsmMod.sha1result
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha1", JSImport.Namespace)
@js.native
object hmacSha1Mod extends js.Object {
  
  @js.native
  class HmacSha1 protected () extends Hmac[Hash[sha1result]] {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
