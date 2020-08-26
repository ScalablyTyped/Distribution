package typings.androiduix.android.text.style.LeadingMarginSpan

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.text.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeadingMarginSpan2
  extends typings.androiduix.android.text.style.LeadingMarginSpan {
  def getLeadingMarginLineCount(): Double = js.native
}

object LeadingMarginSpan2 {
  @scala.inline
  def apply(
    drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
    getLeadingMargin: Boolean => Double,
    getLeadingMarginLineCount: () => Double
  ): LeadingMarginSpan2 = {
    val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin), getLeadingMarginLineCount = js.Any.fromFunction0(getLeadingMarginLineCount))
    __obj.asInstanceOf[LeadingMarginSpan2]
  }
  @scala.inline
  implicit class LeadingMarginSpan2Ops[Self <: LeadingMarginSpan2] (val x: Self) extends AnyVal {
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
    def setGetLeadingMarginLineCount(value: () => Double): Self = this.set("getLeadingMarginLineCount", js.Any.fromFunction0(value))
  }
  
}

