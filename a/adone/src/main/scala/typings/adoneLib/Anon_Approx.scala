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
    approx: js.Function1[java.lang.String, java.lang.String],
    isFullWidth: js.Function1[java.lang.String, scala.Boolean],
    isFullWidthCodePoint: js.Function1[scala.Double, scala.Boolean],
    length: js.Function1[java.lang.String, scala.Double],
    surrogatePair: js.Function1[java.lang.String, scala.Double],
    symbol: Anon_ArrowDown,
    symbolFallback: Anon_110,
    toArray: js.Function1[java.lang.String, js.Array[java.lang.String]],
    toFullWidth: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Approx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approx")(approx)
    __obj.updateDynamic("isFullWidth")(isFullWidth)
    __obj.updateDynamic("isFullWidthCodePoint")(isFullWidthCodePoint)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("surrogatePair")(surrogatePair)
    __obj.updateDynamic("symbol")(symbol)
    __obj.updateDynamic("symbolFallback")(symbolFallback)
    __obj.updateDynamic("toArray")(toArray)
    __obj.updateDynamic("toFullWidth")(toFullWidth)
    __obj.asInstanceOf[Anon_Approx]
  }
}

