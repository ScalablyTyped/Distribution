package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ccmMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ccm", "AES_CCM")
  @js.native
  class AES_CCM protected () extends AES {
    def this(key: Uint8Array, nonce: Uint8Array, adata: Unit, tagSize: Double, dataLength: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Unit, tagSize: Unit, dataLength: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double, dataLength: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Unit, dataLength: Double) = this()
    
    def AES_CCM_Decrypt_finish(): Uint8Array = js.native
    
    def AES_CCM_Decrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_CCM_Encrypt_finish(): Uint8Array = js.native
    
    def AES_CCM_Encrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_CCM_calculate_iv(): Unit = js.native
    
    /* private */ var AES_CTR_set_options: js.Any = js.native
    
    def _cbc_mac_process(data: Uint8Array): Unit = js.native
    
    /* private */ val adata: js.Any = js.native
    
    /* private */ var counter: js.Any = js.native
    
    /* private */ var dataLength: js.Any = js.native
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
    
    /* private */ val lengthSize: js.Any = js.native
    
    /* private */ var nonce: js.Any = js.native
    
    /* private */ val tagSize: js.Any = js.native
  }
  /* static members */
  object AES_CCM {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ccm", "AES_CCM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Unit, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Unit, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
}
