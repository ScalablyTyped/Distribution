package typings
package androiduixLib.androidNs.textNs.styleNs.LeadingMarginSpanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadingMarginSpan2
  extends androiduixLib.androidNs.textNs.styleNs.LeadingMarginSpan {
  def getLeadingMarginLineCount(): scala.Double
}

object LeadingMarginSpan2 {
  @scala.inline
  def apply(
    drawLeadingMargin: (androiduixLib.androidNs.graphicsNs.Canvas, androiduixLib.androidNs.graphicsNs.Paint, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, java.lang.String, scala.Double, scala.Double, scala.Boolean, androiduixLib.androidNs.textNs.Layout) => scala.Unit,
    getLeadingMargin: scala.Boolean => scala.Double,
    getLeadingMarginLineCount: () => scala.Double
  ): LeadingMarginSpan2 = {
    val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin), getLeadingMarginLineCount = js.Any.fromFunction0(getLeadingMarginLineCount))
  
    __obj.asInstanceOf[LeadingMarginSpan2]
  }
}

