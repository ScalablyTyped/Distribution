package typings
package antlr4Lib.intervalSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/IntervalSet", "IntervalSet")
@js.native
class IntervalSet () extends js.Object {
  val intervals: js.Array[Interval] = js.native
  val length: scala.Boolean = js.native
  val readOnly: scala.Boolean = js.native
  def addInterval(interval: Interval): scala.Unit = js.native
  def addOne(v: scala.Double): scala.Unit = js.native
  def addRange(l: scala.Double, h: scala.Double): scala.Unit = js.native
  def addSet(other: IntervalSet): scala.Unit = js.native
  def complement(start: scala.Double, stop: scala.Double): IntervalSet = js.native
  def contains(item: scala.Double): scala.Boolean = js.native
  def elementName(
    literalNames: js.Array[java.lang.String],
    symbolicNames: js.Array[java.lang.String],
    token: antlr4Lib.tokenMod.Token
  ): java.lang.String = js.native
  def first(): scala.Double = js.native
  def reduce(k: scala.Double): scala.Unit = js.native
  def removeOne(v: scala.Double): scala.Boolean = js.native
  def removeRange(interval: Interval): scala.Boolean = js.native
  def toCharString(): java.lang.String = js.native
  def toIndexString(): java.lang.String = js.native
  def toString(literalNames: js.Array[java.lang.String]): java.lang.String = js.native
  def toString(literalNames: js.Array[java.lang.String], symbolicNames: js.Array[java.lang.String]): java.lang.String = js.native
  def toString(
    literalNames: js.Array[java.lang.String],
    symbolicNames: js.Array[java.lang.String],
    elemsAreChar: scala.Boolean
  ): java.lang.String = js.native
  def toTokenString(literalNames: js.Array[java.lang.String], symbolicNames: js.Array[java.lang.String]): java.lang.String = js.native
}

