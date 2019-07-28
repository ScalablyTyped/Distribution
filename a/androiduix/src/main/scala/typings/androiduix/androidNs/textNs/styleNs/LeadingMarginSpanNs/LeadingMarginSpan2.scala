package typings.androiduix.androidNs.textNs.styleNs.LeadingMarginSpanNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Paint
import typings.androiduix.androidNs.textNs.Layout
import typings.androiduix.androidNs.textNs.styleNs.LeadingMarginSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadingMarginSpan2 extends LeadingMarginSpan {
  def getLeadingMarginLineCount(): Double
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
}

