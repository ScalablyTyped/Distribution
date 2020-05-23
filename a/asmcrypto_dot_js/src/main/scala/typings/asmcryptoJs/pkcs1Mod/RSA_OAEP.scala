package typings.asmcryptoJs.pkcs1Mod

import typings.asmcryptoJs.sha1Mod.Sha1
import typings.asmcryptoJs.sha256Mod.Sha256
import typings.asmcryptoJs.sha512Mod.Sha512
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_OAEP")
@js.native
class RSA_OAEP protected () extends js.Object {
  def this(key: js.Array[Uint8Array], hash: Sha1) = this()
  def this(key: js.Array[Uint8Array], hash: Sha256) = this()
  def this(key: js.Array[Uint8Array], hash: Sha512) = this()
  def this(key: js.Array[Uint8Array], hash: Sha1, label: Uint8Array) = this()
  def this(key: js.Array[Uint8Array], hash: Sha256, label: Uint8Array) = this()
  def this(key: js.Array[Uint8Array], hash: Sha512, label: Uint8Array) = this()
  val hash: js.Any = js.native
  val label: js.Any = js.native
  val rsa: js.Any = js.native
  def RSA_MGF1_generate(seed: Uint8Array): Uint8Array = js.native
  def RSA_MGF1_generate(seed: Uint8Array, length: Double): Uint8Array = js.native
  def decrypt(data: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array): Uint8Array = js.native
  def encrypt(data: Uint8Array, random: Uint8Array): Uint8Array = js.native
}

