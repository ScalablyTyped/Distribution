package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_GCM")
@js.native
class AES_GCM protected ()
  extends typings.asmcryptoJs.gcmMod.AES_GCM {
  def this(key: Uint8Array, nonce: Uint8Array) = this()
  def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array) = this()
  def this(key: Uint8Array, nonce: Uint8Array, adata: js.UndefOr[scala.Nothing], tagSize: Double) = this()
  def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double) = this()
}
/* static members */
@JSImport("asmcrypto.js", "AES_GCM")
@js.native
object AES_GCM extends js.Object {
  
  def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  def decrypt(
    ciphertext: Uint8Array,
    key: Uint8Array,
    nonce: Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagsize: Double
  ): Uint8Array = js.native
  def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
  def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
  
  def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  def encrypt(
    cleartext: Uint8Array,
    key: Uint8Array,
    nonce: Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagsize: Double
  ): Uint8Array = js.native
  def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
  def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
}
