package typings.asmcryptoJs

import typings.asmcryptoJs.aesAsmMod.AESAsm
import typings.asmcryptoJs.aesAsmMod.AESMode
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/aes/aes", JSImport.Namespace)
@js.native
object aesMod extends js.Object {
  
  @js.native
  abstract class AES protected () extends js.Object {
    protected def this(key: Uint8Array, iv: js.UndefOr[scala.Nothing], padding: js.UndefOr[scala.Nothing], mode: AESMode) = this()
    protected def this(key: Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean, mode: AESMode) = this()
    protected def this(key: Uint8Array, iv: Uint8Array, padding: js.UndefOr[scala.Nothing], mode: AESMode) = this()
    protected def this(key: Uint8Array, iv: Uint8Array, padding: Boolean, mode: AESMode) = this()
    
    def AES_Decrypt_finish(): Uint8Array = js.native
    
    def AES_Decrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_Encrypt_finish(): Uint8Array = js.native
    
    def AES_Encrypt_process(data: Uint8Array): Uint8Array = js.native
    
    val asm: AESAsm = js.native
    
    val heap: Uint8Array = js.native
    
    var len: Double = js.native
    
    val mode: js.Any = js.native
    
    var padding: Boolean = js.native
    
    var pos: Double = js.native
  }
}
