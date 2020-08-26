package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLTimeRanges extends js.Object {
  @JSName("MSHTML.IHTMLTimeRanges_typekey")
  var MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges = js.native
  val length: Double = js.native
  def end(index: Double): Double = js.native
  def start(index: Double): Double = js.native
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
  @scala.inline
  implicit class IHTMLTimeRangesOps[Self <: IHTMLTimeRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotIHTMLTimeRanges_typekey(value: IHTMLTimeRanges): Self = this.set("MSHTML.IHTMLTimeRanges_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double => Double): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double => Double): Self = this.set("start", js.Any.fromFunction1(value))
  }
  
}

