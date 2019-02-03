package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.MeasuredText")
@js.native
class MeasuredText () extends js.Object {
  var mChars: java.lang.String = js.native
  var mDir: scala.Double = js.native
  var mEasy: scala.Boolean = js.native
  var mLen: scala.Double = js.native
  var mLevels: js.Array[scala.Double] = js.native
  var mPos: js.Any = js.native
  var mText: java.lang.String = js.native
  var mTextStart: scala.Double = js.native
  var mWidths: js.Array[scala.Double] = js.native
  var mWorkPaint: js.Any = js.native
  def addStyleRun(paint: TextPaint, len: scala.Double, fm: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt): scala.Double = js.native
  def addStyleRun(
    paint: TextPaint,
    spans: js.Array[androiduixLib.androidNs.textNs.styleNs.MetricAffectingSpan],
    len: scala.Double,
    fm: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt
  ): scala.Double = js.native
  /* private */ def addStyleRun_3(paint: js.Any, len: js.Any, fm: js.Any): js.Any = js.native
  /* private */ def addStyleRun_4(paint: js.Any, spans: js.Any, len: js.Any, fm: js.Any): js.Any = js.native
  def breakText(limit: scala.Double, forwards: scala.Boolean, width: scala.Double): scala.Double = js.native
  def measure(start: scala.Double, limit: scala.Double): scala.Double = js.native
  def setPara(text: java.lang.String, start: scala.Double, end: scala.Double, textDir: TextDirectionHeuristic): scala.Unit = js.native
  def setPos(pos: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.text.MeasuredText")
@js.native
object MeasuredText extends js.Object {
  var localLOGV: js.Any = js.native
  var sCached: js.Any = js.native
  var sLock: js.Any = js.native
  def obtain(): androiduixLib.androidNs.textNs.MeasuredText = js.native
  def recycle(mt: androiduixLib.androidNs.textNs.MeasuredText): androiduixLib.androidNs.textNs.MeasuredText = js.native
}

