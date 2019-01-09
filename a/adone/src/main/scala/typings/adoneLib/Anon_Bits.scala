package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bits
  extends org.scalablytyped.runtime.Instantiable1[
      (/* n */ adoneLib.adoneNs.mathNs.BigNumber) | (/* n */ scala.Double) | (/* n */ java.lang.String), 
      adoneLib.adoneNs.mathNs.BigNumber
    ] {
  /**
    * One
    */
  var ONE: adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
    * Zero
    */
  var ZERO: adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
    * Creates a new bignum from a Buffer.
    */
  def fromBuffer(buf: nodeLib.Buffer): adoneLib.adoneNs.mathNs.BigNumber = js.native
  def fromBuffer(buf: nodeLib.Buffer, opts: adoneLib.adoneNs.mathNs.INs.BigNumberNs.BufferConvertOptions): adoneLib.adoneNs.mathNs.BigNumber = js.native
  /**
    * Generates a probable prime number of length bits.
    *
    * @param bits the number of bits
    * @param safe If true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime. Default: true
    */
  def prime(bits: scala.Double): adoneLib.adoneNs.mathNs.BigNumber = js.native
  def prime(bits: scala.Double, safe: scala.Boolean): adoneLib.adoneNs.mathNs.BigNumber = js.native
}

