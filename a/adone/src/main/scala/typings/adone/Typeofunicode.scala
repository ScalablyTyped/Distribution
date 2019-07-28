package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofunicode extends js.Object {
  val symbol: Anon_ArrowDown
  val symbolFallback: Anon_110
  def approx(str: String): String
  def isFullWidth(char: String): Boolean
  def isFullWidthCodePoint(code: Double): Boolean
  def length(str: String): Double
  def surrogatePair(char: String): Double
  def toArray(str: String): js.Array[String]
  def toFullWidth(str: String): String
}

object Typeofunicode {
  @scala.inline
  def apply(
    approx: String => String,
    isFullWidth: String => Boolean,
    isFullWidthCodePoint: Double => Boolean,
    length: String => Double,
    surrogatePair: String => Double,
    symbol: Anon_ArrowDown,
    symbolFallback: Anon_110,
    toArray: String => js.Array[String],
    toFullWidth: String => String
  ): Typeofunicode = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), isFullWidth = js.Any.fromFunction1(isFullWidth), isFullWidthCodePoint = js.Any.fromFunction1(isFullWidthCodePoint), length = js.Any.fromFunction1(length), surrogatePair = js.Any.fromFunction1(surrogatePair), symbol = symbol, symbolFallback = symbolFallback, toArray = js.Any.fromFunction1(toArray), toFullWidth = js.Any.fromFunction1(toFullWidth))
  
    __obj.asInstanceOf[Typeofunicode]
  }
}

