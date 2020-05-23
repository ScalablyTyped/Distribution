package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "RSA_OAEP")
@js.native
class RSA_OAEP protected ()
  extends typings.asmcryptoJs.pkcs1Mod.RSA_OAEP {
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1, label: Uint8Array) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256, label: Uint8Array) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512, label: Uint8Array) = this()
}

