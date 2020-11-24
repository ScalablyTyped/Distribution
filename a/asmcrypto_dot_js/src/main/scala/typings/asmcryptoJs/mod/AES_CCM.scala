package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_CCM")
@js.native
class AES_CCM protected ()
  extends typings.asmcryptoJs.ccmMod.AES_CCM {
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
}
/* static members */
@JSImport("asmcrypto.js", "AES_CCM")
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
