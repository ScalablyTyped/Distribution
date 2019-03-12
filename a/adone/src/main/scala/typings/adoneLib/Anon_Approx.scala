package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approx extends js.Object {
  val symbol: Anon_ArrowDown
  val symbolFallback: Anon_110
  def approx(str: java.lang.String): java.lang.String
  def isFullWidth(char: java.lang.String): scala.Boolean
  def isFullWidthCodePoint(code: scala.Double): scala.Boolean
  def length(str: java.lang.String): scala.Double
  def surrogatePair(char: java.lang.String): scala.Double
  def toArray(str: java.lang.String): js.Array[java.lang.String]
  def toFullWidth(str: java.lang.String): java.lang.String
}

object Anon_Approx {
  @scala.inline
  def apply(
    approx: java.lang.String => java.lang.String,
    isFullWidth: java.lang.String => scala.Boolean,
    isFullWidthCodePoint: scala.Double => scala.Boolean,
    length: java.lang.String => scala.Double,
    surrogatePair: java.lang.String => scala.Double,
    symbol: Anon_ArrowDown,
    symbolFallback: Anon_110,
    toArray: java.lang.String => js.Array[java.lang.String],
    toFullWidth: java.lang.String => java.lang.String
  ): Anon_Approx = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), isFullWidth = js.Any.fromFunction1(isFullWidth), isFullWidthCodePoint = js.Any.fromFunction1(isFullWidthCodePoint), length = js.Any.fromFunction1(length), surrogatePair = js.Any.fromFunction1(surrogatePair), symbol = symbol, symbolFallback = symbolFallback, toArray = js.Any.fromFunction1(toArray), toFullWidth = js.Any.fromFunction1(toFullWidth))
  
    __obj.asInstanceOf[Anon_Approx]
  }
}

