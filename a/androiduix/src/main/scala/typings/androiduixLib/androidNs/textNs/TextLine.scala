package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextLine")
@js.native
class TextLine () extends js.Object {
  var mCharacterStyleSpanSet: js.Any = js.native
  var mChars: js.Any = js.native
  var mCharsValid: js.Any = js.native
  var mDir: js.Any = js.native
  var mDirections: js.Any = js.native
  var mHasTabs: js.Any = js.native
  var mLen: js.Any = js.native
  var mMetricAffectingSpanSpanSet: js.Any = js.native
  var mPaint: js.Any = js.native
  var mReplacementSpanSpanSet: js.Any = js.native
  var mSpanned: js.Any = js.native
  var mStart: js.Any = js.native
  var mTabs: js.Any = js.native
  var mText: js.Any = js.native
  var mWorkPaint: js.Any = js.native
  def ascent(pos: scala.Double): scala.Double = js.native
  def draw(
    c: androiduixLib.androidNs.graphicsNs.Canvas,
    x: scala.Double,
    top: scala.Double,
    y: scala.Double,
    bottom: scala.Double
  ): scala.Unit = js.native
  /* private */ def drawRun(
    c: js.Any,
    start: js.Any,
    limit: js.Any,
    runIsRtl: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  /* private */ def drawTextRun(
    c: js.Any,
    wp: js.Any,
    start: js.Any,
    end: js.Any,
    contextStart: js.Any,
    contextEnd: js.Any,
    runIsRtl: js.Any,
    x: js.Any,
    y: js.Any
  ): js.Any = js.native
  /* private */ def getOffsetBeforeAfter(
    runIndex: js.Any,
    runStart: js.Any,
    runLimit: js.Any,
    runIsRtl: js.Any,
    offset: js.Any,
    after: js.Any
  ): js.Any = js.native
  def getOffsetToLeftRightOf(cursor: scala.Double, toLeft: scala.Boolean): scala.Double = js.native
  /* private */ def handleReplacement(
    replacement: js.Any,
    wp: js.Any,
    start: js.Any,
    limit: js.Any,
    runIsRtl: js.Any,
    c: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    fmi: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  /* private */ def handleRun(
    start: js.Any,
    measureLimit: js.Any,
    limit: js.Any,
    runIsRtl: js.Any,
    c: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    fmi: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  /* private */ def handleText(
    wp: js.Any,
    start: js.Any,
    end: js.Any,
    contextStart: js.Any,
    contextEnd: js.Any,
    runIsRtl: js.Any,
    c: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    fmi: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  def measure(
    offset: scala.Double,
    trailing: scala.Boolean,
    fmi: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt
  ): scala.Double = js.native
  /* private */ def measureRun(start: js.Any, offset: js.Any, limit: js.Any, runIsRtl: js.Any, fmi: js.Any): js.Any = js.native
  def metrics(fmi: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt): scala.Double = js.native
  def nextTab(h: scala.Double): scala.Double = js.native
  def set(
    paint: TextPaint,
    text: java.lang.String,
    start: scala.Double,
    limit: scala.Double,
    dir: scala.Double,
    directions: androiduixLib.androidNs.textNs.LayoutNs.Directions,
    hasTabs: scala.Boolean,
    tabStops: androiduixLib.androidNs.textNs.LayoutNs.TabStops
  ): scala.Unit = js.native
}

@JSGlobal("android.text.TextLine")
@js.native
object TextLine extends js.Object {
  var DEBUG: js.Any = js.native
  var TAB_INCREMENT: js.Any = js.native
  var sCached: js.Any = js.native
  /* private */ def expandMetricsFromPaint(fmi: js.Any, wp: js.Any): js.Any = js.native
  def obtain(): androiduixLib.androidNs.textNs.TextLine = js.native
  def recycle(tl: androiduixLib.androidNs.textNs.TextLine): androiduixLib.androidNs.textNs.TextLine = js.native
  def updateMetrics(
    fmi: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt,
    previousTop: scala.Double,
    previousAscent: scala.Double,
    previousDescent: scala.Double,
    previousBottom: scala.Double,
    previousLeading: scala.Double
  ): scala.Unit = js.native
}

