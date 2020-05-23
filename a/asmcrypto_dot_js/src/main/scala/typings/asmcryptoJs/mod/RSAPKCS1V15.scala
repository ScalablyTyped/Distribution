package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "RSA_PKCS1_v1_5")
@js.native
class RSAPKCS1V15 protected ()
  extends typings.asmcryptoJs.pkcs1Mod.RSAPKCS1V15 {
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512) = this()
}

