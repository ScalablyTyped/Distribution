package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "RSA")
@js.native
class RSA protected ()
  extends typings.asmcryptoJs.rsaMod.RSA {
  def this(key: js.Array[Uint8Array]) = this()
}

