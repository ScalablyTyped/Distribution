package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.ReplacementSpan")
@js.native
abstract class ReplacementSpan () extends MetricAffectingSpan {
  def draw(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    x: scala.Double,
    top: scala.Double,
    y: scala.Double,
    bottom: scala.Double,
    paint: androiduixLib.androidNs.graphicsNs.Paint
  ): scala.Unit = js.native
  def getSize(
    paint: androiduixLib.androidNs.graphicsNs.Paint,
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    fm: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt
  ): scala.Double = js.native
}

@JSGlobal("android.text.style.ReplacementSpan")
@js.native
object ReplacementSpan extends js.Object {
  var `type`: js.Symbol = js.native
}

