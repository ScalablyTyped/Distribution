package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.adone.adoneNs.mathNs.INs.Longable
import typings.adone.adoneNs.mathNs.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassLongFromBits
  extends Instantiable0[Long]
     with Instantiable1[/* low */ Double, Long]
     with Instantiable2[/* low */ Double, /* high */ Double, Long]
     with Instantiable3[/* low */ Double, /* high */ Double, /* unsigned */ Boolean, Long] {
  /**
    * Maximum unsigned value
    */
  var MAX_UNSIGNED_VALUE: Long = js.native
  /**
    * Maximum signed value
    */
  var MAX_VALUE: Long = js.native
  /**
    * Minimum signed value
    */
  var MIN_VALUE: Long = js.native
  /**
    * Signed negative one
    */
  var NEG_ONE: Long = js.native
  /**
    * Signed one
    */
  var ONE: Long = js.native
  /**
    * Unsigned one
    */
  var UONE: Long = js.native
  /**
    * Unsigned zero
    */
  var UZERO: Long = js.native
  /**
    * Signed zero
    */
  var ZERO: Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits
    */
  def fromBits(lowBits: Double, highBits: Double): Long = js.native
  def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value
    */
  def fromInt(value: Double): Long = js.native
  def fromInt(value: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned
    */
  def fromNumber(): Long = js.native
  def fromNumber(value: Double): Long = js.native
  def fromNumber(value: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix
    */
  def fromString(str: String): Long = js.native
  def fromString(str: String, radix: Double): Long = js.native
  def fromString(str: String, unsigned: Boolean): Long = js.native
  def fromString(str: String, unsigned: Boolean, radix: Double): Long = js.native
  /**
    * Converts the specified value to a Long
    */
  def fromValue(`val`: Longable): Long = js.native
}

