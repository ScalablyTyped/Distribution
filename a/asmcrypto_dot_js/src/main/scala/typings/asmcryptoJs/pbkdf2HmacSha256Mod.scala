package typings.asmcryptoJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2HmacSha256Mod {
  
  @JSImport("asmcrypto.js/dist_es8/pbkdf2/pbkdf2-hmac-sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Pbkdf2HmacSha256(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Pbkdf2HmacSha256")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], count.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
