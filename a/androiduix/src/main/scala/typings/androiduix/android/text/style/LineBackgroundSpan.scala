package typings.androiduix.android.text.style

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBackgroundSpan extends ParagraphStyle {
  def drawBackground(
    c: Canvas,
    p: Paint,
    left: Double,
    right: Double,
    top: Double,
    baseline: Double,
    bottom: Double,
    text: String,
    start: Double,
    end: Double,
    lnum: Double
  ): Unit = js.native
}

object LineBackgroundSpan {
  @scala.inline
  def apply(
    drawBackground: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Double) => Unit
  ): LineBackgroundSpan = {
    val __obj = js.Dynamic.literal(drawBackground = js.Any.fromFunction11(drawBackground))
    __obj.asInstanceOf[LineBackgroundSpan]
  }
  @scala.inline
  implicit class LineBackgroundSpanOps[Self <: LineBackgroundSpan] (val x: Self) extends AnyVal {
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
    def setDrawBackground(
      value: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Double) => Unit
    ): Self = this.set("drawBackground", js.Any.fromFunction11(value))
  }
  
}

