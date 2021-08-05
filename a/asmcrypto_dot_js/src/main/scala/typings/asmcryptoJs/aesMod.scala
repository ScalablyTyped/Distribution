package typings.asmcryptoJs

import typings.asmcryptoJs.aesAsmMod.AESAsm
import typings.asmcryptoJs.aesAsmMod.AESMode
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aesMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/aes", "AES")
  @js.native
  abstract class AES protected () extends StObject {
    /* protected */ def this(key: Uint8Array, iv: Unit, padding: Boolean, mode: AESMode) = this()
    /* protected */ def this(key: Uint8Array, iv: Unit, padding: Unit, mode: AESMode) = this()
    /* protected */ def this(key: Uint8Array, iv: Uint8Array, padding: Boolean, mode: AESMode) = this()
    /* protected */ def this(key: Uint8Array, iv: Uint8Array, padding: Unit, mode: AESMode) = this()
    
    def AES_Decrypt_finish(): Uint8Array = js.native
    
    def AES_Decrypt_process(data: Uint8Array): Uint8Array = js.native
    
    def AES_Encrypt_finish(): Uint8Array = js.native
    
    def AES_Encrypt_process(data: Uint8Array): Uint8Array = js.native
    
    /* protected */ val asm: AESAsm = js.native
    
    /* protected */ val heap: Uint8Array = js.native
    
    /* protected */ var len: Double = js.native
    
    /* private */ val mode: js.Any = js.native
    
    /* protected */ var padding: Boolean = js.native
    
    /* protected */ var pos: Double = js.native
  }
}
