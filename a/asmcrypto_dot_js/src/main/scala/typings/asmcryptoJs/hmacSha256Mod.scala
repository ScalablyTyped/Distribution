package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.hmacMod.Hmac
import typings.asmcryptoJs.sha256AsmMod.sha256result
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacSha256Mod {
  
  @JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha256", "HmacSha256")
  @js.native
  class HmacSha256 protected () extends Hmac[Hash[sha256result]] {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
