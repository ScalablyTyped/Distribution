package typings.asmcryptoJs.rsaMod

import typings.asmcryptoJs.bignumMod.BigNumber
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/rsa/rsa", "RSA")
@js.native
class RSA protected () extends js.Object {
  def this(key: js.Array[Uint8Array]) = this()
  
  def decrypt(msg: BigNumber): this.type = js.native
  
  def encrypt(msg: BigNumber): this.type = js.native
  
  val key: typings.asmcryptoJs.rsaMod.key = js.native
  
  var result: Uint8Array = js.native
}
