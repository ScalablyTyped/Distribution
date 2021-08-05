package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecbMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB")
  @js.native
  class AES_ECB protected () extends AES {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, padding: Boolean) = this()
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
  }
  /* static members */
  object AES_ECB {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
}
