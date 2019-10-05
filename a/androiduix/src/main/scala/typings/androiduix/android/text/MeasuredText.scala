package typings.androiduix.android.text

import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.text.style.MetricAffectingSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.MeasuredText")
@js.native
class MeasuredText () extends js.Object {
  var mChars: String = js.native
  var mDir: Double = js.native
  var mEasy: Boolean = js.native
  var mLen: Double = js.native
  var mLevels: js.Array[Double] = js.native
  var mPos: js.Any = js.native
  var mText: String = js.native
  var mTextStart: Double = js.native
  var mWidths: js.Array[Double] = js.native
  var mWorkPaint: js.Any = js.native
  def addStyleRun(paint: TextPaint, len: Double, fm: FontMetricsInt): Double = js.native
  def addStyleRun(paint: TextPaint, spans: js.Array[MetricAffectingSpan], len: Double, fm: FontMetricsInt): Double = js.native
  /* private */ def addStyleRun_3(paint: js.Any, len: js.Any, fm: js.Any): js.Any = js.native
  /* private */ def addStyleRun_4(paint: js.Any, spans: js.Any, len: js.Any, fm: js.Any): js.Any = js.native
  def breakText(limit: Double, forwards: Boolean, width: Double): Double = js.native
  def measure(start: Double, limit: Double): Double = js.native
  def setPara(text: String, start: Double, end: Double, textDir: TextDirectionHeuristic): Unit = js.native
  def setPos(pos: Double): Unit = js.native
}

/* static members */
@JSGlobal("android.text.MeasuredText")
@js.native
object MeasuredText extends js.Object {
  var localLOGV: js.Any = js.native
  var sCached: js.Any = js.native
  var sLock: js.Any = js.native
  def obtain(): MeasuredText = js.native
  def recycle(mt: MeasuredText): MeasuredText = js.native
}

