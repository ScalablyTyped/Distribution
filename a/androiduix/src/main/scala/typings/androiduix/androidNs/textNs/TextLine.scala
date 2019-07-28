package typings.androiduix.androidNs.textNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.PaintNs.FontMetricsInt
import typings.androiduix.androidNs.textNs.LayoutNs.Directions
import typings.androiduix.androidNs.textNs.LayoutNs.TabStops
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
  def ascent(pos: Double): Double = js.native
  def draw(c: Canvas, x: Double, top: Double, y: Double, bottom: Double): Unit = js.native
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
  def getOffsetToLeftRightOf(cursor: Double, toLeft: Boolean): Double = js.native
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
  def measure(offset: Double, trailing: Boolean, fmi: FontMetricsInt): Double = js.native
  /* private */ def measureRun(start: js.Any, offset: js.Any, limit: js.Any, runIsRtl: js.Any, fmi: js.Any): js.Any = js.native
  def metrics(fmi: FontMetricsInt): Double = js.native
  def nextTab(h: Double): Double = js.native
  def set(
    paint: TextPaint,
    text: String,
    start: Double,
    limit: Double,
    dir: Double,
    directions: Directions,
    hasTabs: Boolean,
    tabStops: TabStops
  ): Unit = js.native
}

/* static members */
@JSGlobal("android.text.TextLine")
@js.native
object TextLine extends js.Object {
  var DEBUG: js.Any = js.native
  var TAB_INCREMENT: js.Any = js.native
  var sCached: js.Any = js.native
  /* private */ def expandMetricsFromPaint(fmi: js.Any, wp: js.Any): js.Any = js.native
  def obtain(): TextLine = js.native
  def recycle(tl: TextLine): TextLine = js.native
  def updateMetrics(
    fmi: FontMetricsInt,
    previousTop: Double,
    previousAscent: Double,
    previousDescent: Double,
    previousBottom: Double,
    previousLeading: Double
  ): Unit = js.native
}

