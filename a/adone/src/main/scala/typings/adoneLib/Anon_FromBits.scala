package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FromBits
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.mathNs.Long]
     with org.scalablytyped.runtime.Instantiable1[/* low */ scala.Double, adoneLib.adoneNs.mathNs.Long]
     with org.scalablytyped.runtime.Instantiable2[/* low */ scala.Double, /* high */ scala.Double, adoneLib.adoneNs.mathNs.Long]
     with org.scalablytyped.runtime.Instantiable3[
      /* low */ scala.Double, 
      /* high */ scala.Double, 
      /* unsigned */ scala.Boolean, 
      adoneLib.adoneNs.mathNs.Long
    ] {
  /**
    * Maximum unsigned value
    */
  var MAX_UNSIGNED_VALUE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Maximum signed value
    */
  var MAX_VALUE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Minimum signed value
    */
  var MIN_VALUE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Signed negative one
    */
  var NEG_ONE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Signed one
    */
  var ONE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Unsigned one
    */
  var UONE: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Unsigned zero
    */
  var UZERO: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Signed zero
    */
  var ZERO: adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value
    */
  def fromInt(value: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromInt(value: scala.Double, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned
    */
  def fromNumber(): adoneLib.adoneNs.mathNs.Long = js.native
  def fromNumber(value: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromNumber(value: scala.Double, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix
    */
  def fromString(str: java.lang.String): adoneLib.adoneNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, radix: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean): adoneLib.adoneNs.mathNs.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean, radix: scala.Double): adoneLib.adoneNs.mathNs.Long = js.native
  /**
    * Converts the specified value to a Long
    */
  def fromValue(`val`: adoneLib.adoneNs.mathNs.INs.Longable): adoneLib.adoneNs.mathNs.Long = js.native
}

