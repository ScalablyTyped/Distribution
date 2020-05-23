package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLTimeRanges extends js.Object {
  @JSName("MSHTML.IHTMLTimeRanges_typekey")
  var MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges
  val length: Double
  def end(index: Double): Double
  def start(index: Double): Double
}

object IHTMLTimeRanges {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges,
    end: Double => Double,
    length: Double,
    start: Double => Double
  ): IHTMLTimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.updateDynamic("MSHTML.IHTMLTimeRanges_typekey")(MSHTMLDotIHTMLTimeRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLTimeRanges]
  }
}

