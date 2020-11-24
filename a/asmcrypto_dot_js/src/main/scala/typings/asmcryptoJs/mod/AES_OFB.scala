package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_OFB")
@js.native
class AES_OFB protected ()
  extends typings.asmcryptoJs.ofbMod.AES_OFB {
  def this(key: Uint8Array) = this()
  def this(key: Uint8Array, iv: Uint8Array) = this()
}
/* static members */
@JSImport("asmcrypto.js", "AES_OFB")
@js.native
object AES_OFB extends js.Object {
  
  def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
  
  def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
}
