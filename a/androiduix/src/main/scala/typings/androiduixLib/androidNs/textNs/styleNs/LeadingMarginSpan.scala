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

