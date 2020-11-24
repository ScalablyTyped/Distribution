package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_CBC")
@js.native
class AES_CBC protected ()
  extends typings.asmcryptoJs.cbcMod.AES_CBC {
  def this(key: Uint8Array) = this()
  def this(key: Uint8Array, iv: Uint8Array) = this()
  def this(key: Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean) = this()
  def this(key: Uint8Array, iv: Uint8Array, padding: Boolean) = this()
}
/* static members */
@JSImport("asmcrypto.js", "AES_CBC")
@js.native
object AES_CBC extends js.Object {
  
  def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def decrypt(data: Uint8Array, key: Uint8Array, padding: js.UndefOr[scala.Nothing], iv: Uint8Array): Uint8Array = js.native
  def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
  def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = js.native
  
  def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, padding: js.UndefOr[scala.Nothing], iv: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
  def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = js.native
}
