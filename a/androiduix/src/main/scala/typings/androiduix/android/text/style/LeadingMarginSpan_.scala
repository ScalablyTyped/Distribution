package typings.androiduix.android.text.style

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.text.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ): Unit
  def getLeadingMargin(first: Boolean): Double
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
}

