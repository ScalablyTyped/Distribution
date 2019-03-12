package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadingMarginSpan extends ParagraphStyle {
  def drawLeadingMargin(
    c: androiduixLib.androidNs.graphicsNs.Canvas,
    p: androiduixLib.androidNs.graphicsNs.Paint,
    x: scala.Double,
    dir: scala.Double,
    top: scala.Double,
    baseline: scala.Double,
    bottom: scala.Double,
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    first: scala.Boolean,
    layout: androiduixLib.androidNs.textNs.Layout
  ): scala.Unit
  def getLeadingMargin(first: scala.Boolean): scala.Double
}

object LeadingMarginSpan {
  @scala.inline
  def apply(
    drawLeadingMargin: (androiduixLib.androidNs.graphicsNs.Canvas, androiduixLib.androidNs.graphicsNs.Paint, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, java.lang.String, scala.Double, scala.Double, scala.Boolean, androiduixLib.androidNs.textNs.Layout) => scala.Unit,
    getLeadingMargin: scala.Boolean => scala.Double
  ): LeadingMarginSpan = {
    val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin))
  
    __obj.asInstanceOf[LeadingMarginSpan]
  }
}

