package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineBackgroundSpan extends ParagraphStyle {
  def drawBackground(
    c: androiduixLib.androidNs.graphicsNs.Canvas,
    p: androiduixLib.androidNs.graphicsNs.Paint,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    baseline: scala.Double,
    bottom: scala.Double,
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    lnum: scala.Double
  ): scala.Unit
}

object LineBackgroundSpan {
  @scala.inline
  def apply(
    drawBackground: js.Function11[
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
      scala.Double, 
      scala.Unit
    ]
  ): LineBackgroundSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drawBackground")(drawBackground)
    __obj.asInstanceOf[LineBackgroundSpan]
  }
}

