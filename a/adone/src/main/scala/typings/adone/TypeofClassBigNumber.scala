package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.mathNs.BigNumber
import typings.adone.adoneNs.mathNs.INs.BigNumberNs.BufferConvertOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBigNumber extends Instantiable1[(/* n */ BigNumber) | (/* n */ Double) | (/* n */ String), BigNumber] {
  /**
    * One
    */
  var ONE: BigNumber = js.native
  /**
    * Zero
    */
  var ZERO: BigNumber = js.native
  /**
    * Creates a new bignum from a Buffer.
    */
  def fromBuffer(buf: Buffer): BigNumber = js.native
  def fromBuffer(buf: Buffer, opts: BufferConvertOptions): BigNumber = js.native
  /**
    * Generates a probable prime number of length bits.
    *
    * @param bits the number of bits
    * @param safe If true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime. Default: true
    */
  def prime(bits: Double): BigNumber = js.native
  def prime(bits: Double, safe: Boolean): BigNumber = js.native
}

