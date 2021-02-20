package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcmMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM")
  @js.native
  class AES_GCM protected () extends AES {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: js.UndefOr[scala.Nothing], tagSize: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double) = this()
    
    def AES_GCM_Decrypt_finish(): Uint8Array = js.native
    
    def AES_GCM_Decrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_GCM_Encrypt_finish(): Uint8Array = js.native
    
    def AES_GCM_Encrypt_process(data: Uint8Array): Uint8Array = js.native
    
    var AES_GCM_decrypt: js.Any = js.native
    
    var AES_GCM_encrypt: js.Any = js.native
    
    def _gcm_mac_process(data: Uint8Array): Unit = js.native
    
    val adata: js.Any = js.native
    
    var counter: js.Any = js.native
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
    
    val gamma0: js.Any = js.native
    
    val tagSize: js.Any = js.native
  }
  /* static members */
  object AES_GCM {
    
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.decrypt")
    @js.native
    def decrypt(
      ciphertext: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.encrypt")
    @js.native
    def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.encrypt")
    @js.native
    def encrypt(
      cleartext: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.encrypt")
    @js.native
    def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/gcm", "AES_GCM.encrypt")
    @js.native
    def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
  }
}
