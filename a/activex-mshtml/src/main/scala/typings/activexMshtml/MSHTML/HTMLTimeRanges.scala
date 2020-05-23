package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTimeRanges extends js.Object {
  @JSName("MSHTML.HTMLTimeRanges_typekey")
  var MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges
  val length: Double
  def end(index: Double): Double
  def endDouble(index: Double): Double
  def start(index: Double): Double
  def startDouble(index: Double): Double
}

object HTMLTimeRanges {
  @scala.inline
  def apply(
    MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges,
    end: Double => Double,
    endDouble: Double => Double,
    length: Double,
    start: Double => Double,
    startDouble: Double => Double
  ): HTMLTimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), endDouble = js.Any.fromFunction1(endDouble), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), startDouble = js.Any.fromFunction1(startDouble))
    __obj.updateDynamic("MSHTML.HTMLTimeRanges_typekey")(MSHTMLDotHTMLTimeRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTimeRanges]
  }
}

