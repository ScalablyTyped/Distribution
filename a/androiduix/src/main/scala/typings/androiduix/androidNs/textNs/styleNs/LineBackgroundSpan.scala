package typings.androiduix.androidNs.textNs.styleNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Paint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ): Unit
}

object LineBackgroundSpan {
  @scala.inline
  def apply(
    drawBackground: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Double) => Unit
  ): LineBackgroundSpan = {
    val __obj = js.Dynamic.literal(drawBackground = js.Any.fromFunction11(drawBackground))
  
    __obj.asInstanceOf[LineBackgroundSpan]
  }
}

