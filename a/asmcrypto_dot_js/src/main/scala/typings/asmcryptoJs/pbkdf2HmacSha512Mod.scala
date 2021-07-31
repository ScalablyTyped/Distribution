package typings.asmcryptoJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2HmacSha512Mod {
  
  @JSImport("asmcrypto.js/dist_es8/pbkdf2/pbkdf2-hmac-sha512", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Pbkdf2HmacSha512(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Pbkdf2HmacSha512")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], count.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
