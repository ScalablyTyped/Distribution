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
    drawLeadingMargin: js.Function12[
      androiduixLib.androidNs.graphicsNs.Canvas, 
      androiduixLib.androidNs.graphicsNs.Paint, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Boolean, 
      androiduixLib.androidNs.textNs.Layout, 
      scala.Unit
    ],
    getLeadingMargin: js.Function1[scala.Boolean, scala.Double],
    getLeadingMarginLineCount: js.Function0[scala.Double]
  ): LeadingMarginSpan2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drawLeadingMargin")(drawLeadingMargin)
    __obj.updateDynamic("getLeadingMargin")(getLeadingMargin)
    __obj.updateDynamic("getLeadingMarginLineCount")(getLeadingMarginLineCount)
    __obj.asInstanceOf[LeadingMarginSpan2]
  }
}

