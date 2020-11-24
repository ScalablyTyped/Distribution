package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "RSA_PSS")
@js.native
class RSA_PSS protected ()
  extends typings.asmcryptoJs.pkcs1Mod.RSA_PSS {
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1, saltLength: Double) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256, saltLength: Double) = this()
  def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512, saltLength: Double) = this()
}
