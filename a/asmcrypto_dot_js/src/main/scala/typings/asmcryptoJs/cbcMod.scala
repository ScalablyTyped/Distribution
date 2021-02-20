package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cbcMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC")
  @js.native
  class AES_CBC protected () extends AES {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
    def this(key: Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean) = this()
    def this(key: Uint8Array, iv: Uint8Array, padding: Boolean) = this()
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
  }
  /* static members */
  object AES_CBC {
    
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: js.UndefOr[scala.Nothing], iv: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: js.UndefOr[scala.Nothing], iv: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = js.native
  }
}
