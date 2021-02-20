package typings.androiduix.android.text

import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.text.style.MetricAffectingSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasuredText extends StObject {
  
  def addStyleRun(paint: TextPaint, len: Double, fm: FontMetricsInt): Double = js.native
  def addStyleRun(paint: TextPaint, spans: js.Array[MetricAffectingSpan], len: Double, fm: FontMetricsInt): Double = js.native
  
  /* private */ def addStyleRun_3(paint: js.Any, len: js.Any, fm: js.Any): js.Any = js.native
  
  /* private */ def addStyleRun_4(paint: js.Any, spans: js.Any, len: js.Any, fm: js.Any): js.Any = js.native
  
  def breakText(limit: Double, forwards: Boolean, width: Double): Double = js.native
  
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
  
  def measure(start: Double, limit: Double): Double = js.native
  
  def setPara(text: String, start: Double, end: Double, textDir: TextDirectionHeuristic): Unit = js.native
  
  def setPos(pos: Double): Unit = js.native
}
