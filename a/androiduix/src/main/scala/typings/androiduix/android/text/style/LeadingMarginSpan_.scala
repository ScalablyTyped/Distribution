package typings.androiduix.android.text.style

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.text.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeadingMarginSpan_ extends ParagraphStyle {
  def drawLeadingMargin(
    c: Canvas,
    p: Paint,
    x: Double,
    dir: Double,
    top: Double,
    baseline: Double,
    bottom: Double,
    text: String,
    start: Double,
    end: Double,
    first: Boolean,
    layout: Layout
  ): Unit = js.native
  def getLeadingMargin(first: Boolean): Double = js.native
}

object LeadingMarginSpan_ {
  @scala.inline
  def apply(
    drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
    getLeadingMargin: Boolean => Double
  ): LeadingMarginSpan_ = {
    val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin))
    __obj.asInstanceOf[LeadingMarginSpan_]
  }
  @scala.inline
  implicit class LeadingMarginSpan_Ops[Self <: LeadingMarginSpan_] (val x: Self) extends AnyVal {
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
    def setDrawLeadingMargin(
      value: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit
    ): Self = this.set("drawLeadingMargin", js.Any.fromFunction12(value))
    @scala.inline
    def setGetLeadingMargin(value: Boolean => Double): Self = this.set("getLeadingMargin", js.Any.fromFunction1(value))
  }
  
}

