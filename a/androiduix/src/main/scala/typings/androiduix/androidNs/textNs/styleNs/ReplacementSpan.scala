package typings.androiduix.androidNs.textNs.styleNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Paint
import typings.androiduix.androidNs.graphicsNs.PaintNs.FontMetricsInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.ReplacementSpan")
@js.native
abstract class ReplacementSpan () extends MetricAffectingSpan {
  def draw(
    canvas: Canvas,
    text: String,
    start: Double,
    end: Double,
    x: Double,
    top: Double,
    y: Double,
    bottom: Double,
    paint: Paint
  ): Unit = js.native
  def getSize(paint: Paint, text: String, start: Double, end: Double, fm: FontMetricsInt): Double = js.native
}

/* static members */
@JSGlobal("android.text.style.ReplacementSpan")
@js.native
object ReplacementSpan extends js.Object {
  var `type`: js.Symbol = js.native
}

