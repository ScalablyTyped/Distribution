package typings.asmcryptoJs.bignumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/bignum/bignum", "Modulus")
@js.native
class Modulus protected () extends BigNumber {
  def this(number: BigNumber) = this()
  var coefficient: js.Any = js.native
  var comodulus: js.Any = js.native
  var comodulusRemainder: js.Any = js.native
  var comodulusRemainderSquare: js.Any = js.native
  /**
    * Modular inverse
    */
  def inverse(a: BigNumber): BigNumber = js.native
  /**
    * Modular exponentiation
    */
  def power(g: BigNumber, e: BigNumber): BigNumber = js.native
  /**
    * Modular reduction
    */
  def reduce(a: BigNumber): BigNumber = js.native
}

/* static members */
@JSImport("asmcrypto.js/dist_es8/bignum/bignum", "Modulus")
@js.native
object Modulus extends js.Object {
  def _Montgomery_reduce(a: BigNumber, n: Modulus): BigNumber = js.native
}

