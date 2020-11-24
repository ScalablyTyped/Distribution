package typings.asmcryptoJs.pkcs1Mod

import typings.asmcryptoJs.sha1Mod.Sha1
import typings.asmcryptoJs.sha256Mod.Sha256
import typings.asmcryptoJs.sha512Mod.Sha512
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PSS")
@js.native
class RSA_PSS protected () extends js.Object {
  def this(key: js.Array[Uint8Array], hash: Sha1) = this()
  def this(key: js.Array[Uint8Array], hash: Sha256) = this()
  def this(key: js.Array[Uint8Array], hash: Sha512) = this()
  def this(key: js.Array[Uint8Array], hash: Sha1, saltLength: Double) = this()
  def this(key: js.Array[Uint8Array], hash: Sha256, saltLength: Double) = this()
  def this(key: js.Array[Uint8Array], hash: Sha512, saltLength: Double) = this()
  
  def RSA_MGF1_generate(seed: Uint8Array): Uint8Array = js.native
  def RSA_MGF1_generate(seed: Uint8Array, length: Double): Uint8Array = js.native
  
  val hash: js.Any = js.native
  
  val rsa: js.Any = js.native
  
  val saltLength: js.Any = js.native
  
  def sign(data: Uint8Array): Uint8Array = js.native
  def sign(data: Uint8Array, random: Uint8Array): Uint8Array = js.native
  
  def verify(signature: Uint8Array, data: Uint8Array): Unit = js.native
}
