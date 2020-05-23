package typings.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "Modulus")
@js.native
class Modulus protected ()
  extends typings.asmcryptoJs.bignumMod.Modulus {
  def this(number: typings.asmcryptoJs.bignumMod.BigNumber) = this()
}

/* static members */
@JSImport("asmcrypto.js", "Modulus")
@js.native
object Modulus extends js.Object {
  def _Montgomery_reduce(a: typings.asmcryptoJs.bignumMod.BigNumber, n: typings.asmcryptoJs.bignumMod.Modulus): typings.asmcryptoJs.bignumMod.BigNumber = js.native
}

