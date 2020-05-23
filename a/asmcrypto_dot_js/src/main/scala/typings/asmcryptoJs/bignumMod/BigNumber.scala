package typings.asmcryptoJs.bignumMod

import typings.asmcryptoJs.anon.BitLength
import typings.asmcryptoJs.anon.Gcd
import typings.asmcryptoJs.anon.Quotient
import typings.std.ArrayBuffer
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
@js.native
class BigNumber () extends js.Object {
  def this(num: Uint8Array) = this()
  var bitLength: Double = js.native
  var limbs: Uint32Array = js.native
  var sign: Double = js.native
  def add(that: BigNumber): BigNumber = js.native
  def clamp(b: Double): BigNumber = js.native
  def compare(that: BigNumber): Double = js.native
  def divide(that: BigNumber): Quotient = js.native
  def isMillerRabinProbablePrime(rounds: Double): Boolean = js.native
  def isProbablePrime(): Boolean = js.native
  def isProbablePrime(paranoia: Double): Boolean = js.native
  def multiply(that: BigNumber): BigNumber = js.native
  def negate(): BigNumber = js.native
  def slice(f: Double): BigNumber = js.native
  def slice(f: Double, b: Double): BigNumber = js.native
  def square(): BigNumber = js.native
  def subtract(that: BigNumber): BigNumber = js.native
  def toBytes(): Uint8Array = js.native
  def toString(radix: Double): String = js.native
}

/* static members */
@JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
@js.native
object BigNumber extends js.Object {
  var ONE: BigNumber = js.native
  var ZERO: BigNumber = js.native
  @JSName("extGCD")
  var extGCD_Original: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
  def extGCD(a: this.type, b: this.type): Gcd = js.native
  def fromArrayBuffer(buffer: ArrayBuffer): BigNumber = js.native
  def fromConfig(obj: BitLength): BigNumber = js.native
  def fromNumber(num: Double): BigNumber = js.native
  def fromString(str: String): BigNumber = js.native
}

