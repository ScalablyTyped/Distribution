package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/aes/ccm", JSImport.Namespace)
@js.native
object ccmMod extends js.Object {
  
  @js.native
  class AES_CCM protected () extends AES {
    def this(
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: Double,
      dataLength: Double
    ) = this()
    def this(
      key: Uint8Array,
      nonce: Uint8Array,
      adata: Uint8Array,
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double, dataLength: Double) = this()
    
    def AES_CCM_Decrypt_finish(): Uint8Array = js.native
    
    def AES_CCM_Decrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_CCM_Encrypt_finish(): Uint8Array = js.native
    
    def AES_CCM_Encrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_CCM_calculate_iv(): Unit = js.native
    
    var AES_CTR_set_options: js.Any = js.native
    
    def _cbc_mac_process(data: Uint8Array): Unit = js.native
    
    val adata: js.Any = js.native
    
    var counter: js.Any = js.native
    
    var dataLength: js.Any = js.native
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
    
    val lengthSize: js.Any = js.native
    
    var nonce: js.Any = js.native
    
    val tagSize: js.Any = js.native
  }
  /* static members */
  @js.native
  object AES_CCM extends js.Object {
    
    def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    def decrypt(
      cipher: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
    
    def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    def encrypt(
      clear: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
  }
}
