package typings.asmcryptoJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/pbkdf2/pbkdf2-hmac-sha512", JSImport.Namespace)
@js.native
object pbkdf2HmacSha512Mod extends js.Object {
  
  def Pbkdf2HmacSha512(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = js.native
}
