package typings.asmcryptoJs

import typings.asmcryptoJs.aesMod.AES
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ofbMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB")
  @js.native
  class AES_OFB protected () extends AES {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
  }
  /* static members */
  object AES_OFB {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
  }
}
