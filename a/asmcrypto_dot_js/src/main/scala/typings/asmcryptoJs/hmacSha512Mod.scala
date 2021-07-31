package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.hmacMod.Hmac
import typings.asmcryptoJs.sha512AsmMod.sha512result
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacSha512Mod {
  
  @JSImport("asmcrypto.js/dist_es8/hmac/hmac-sha512", "HmacSha512")
  @js.native
  class HmacSha512 protected () extends Hmac[Hash[sha512result]] {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
    
    def reset(): this.type = js.native
  }
}
