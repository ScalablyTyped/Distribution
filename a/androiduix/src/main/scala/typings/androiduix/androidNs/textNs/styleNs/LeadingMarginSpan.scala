package typings.androiduix.androidNs.textNs.styleNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Paint
import typings.androiduix.androidNs.textNs.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadingMarginSpan extends ParagraphStyle {
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

object LeadingMarginSpan {
  @scala.inline
  def apply(
    drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
    getLeadingMargin: Boolean => Double
  ): LeadingMarginSpan = {
    val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin))
  
    __obj.asInstanceOf[LeadingMarginSpan]
  }
}

