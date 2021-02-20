package typings.androiduix.android.text

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.text.Layout.Directions
import typings.androiduix.android.text.Layout.TabStops
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLine extends StObject {
  
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
object TextLine {
  
  @scala.inline
  def apply(
    ascent: Double => Double,
    draw: (Canvas, Double, Double, Double, Double) => Unit,
    drawRun: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    drawTextRun: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getOffsetBeforeAfter: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getOffsetToLeftRightOf: (Double, Boolean) => Double,
    handleReplacement: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    handleRun: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    handleText: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    mCharacterStyleSpanSet: js.Any,
    mChars: js.Any,
    mCharsValid: js.Any,
    mDir: js.Any,
    mDirections: js.Any,
    mHasTabs: js.Any,
    mLen: js.Any,
    mMetricAffectingSpanSpanSet: js.Any,
    mPaint: js.Any,
    mReplacementSpanSpanSet: js.Any,
    mSpanned: js.Any,
    mStart: js.Any,
    mTabs: js.Any,
    mText: js.Any,
    mWorkPaint: js.Any,
    measure: (Double, Boolean, FontMetricsInt) => Double,
    measureRun: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    metrics: FontMetricsInt => Double,
    nextTab: Double => Double,
    set: (TextPaint, String, Double, Double, Double, Directions, Boolean, TabStops) => Unit
  ): TextLine = {
    val __obj = js.Dynamic.literal(ascent = js.Any.fromFunction1(ascent), draw = js.Any.fromFunction5(draw), drawRun = js.Any.fromFunction9(drawRun), drawTextRun = js.Any.fromFunction9(drawTextRun), getOffsetBeforeAfter = js.Any.fromFunction6(getOffsetBeforeAfter), getOffsetToLeftRightOf = js.Any.fromFunction2(getOffsetToLeftRightOf), handleReplacement = js.Any.fromFunction12(handleReplacement), handleRun = js.Any.fromFunction11(handleRun), handleText = js.Any.fromFunction13(handleText), mCharacterStyleSpanSet = mCharacterStyleSpanSet.asInstanceOf[js.Any], mChars = mChars.asInstanceOf[js.Any], mCharsValid = mCharsValid.asInstanceOf[js.Any], mDir = mDir.asInstanceOf[js.Any], mDirections = mDirections.asInstanceOf[js.Any], mHasTabs = mHasTabs.asInstanceOf[js.Any], mLen = mLen.asInstanceOf[js.Any], mMetricAffectingSpanSpanSet = mMetricAffectingSpanSpanSet.asInstanceOf[js.Any], mPaint = mPaint.asInstanceOf[js.Any], mReplacementSpanSpanSet = mReplacementSpanSpanSet.asInstanceOf[js.Any], mSpanned = mSpanned.asInstanceOf[js.Any], mStart = mStart.asInstanceOf[js.Any], mTabs = mTabs.asInstanceOf[js.Any], mText = mText.asInstanceOf[js.Any], mWorkPaint = mWorkPaint.asInstanceOf[js.Any], measure = js.Any.fromFunction3(measure), measureRun = js.Any.fromFunction5(measureRun), metrics = js.Any.fromFunction1(metrics), nextTab = js.Any.fromFunction1(nextTab), set = js.Any.fromFunction8(set))
    __obj.asInstanceOf[TextLine]
  }
  
  @scala.inline
  implicit class TextLineMutableBuilder[Self <: TextLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscent(value: Double => Double): Self = StObject.set(x, "ascent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraw(value: (Canvas, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDrawRun(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "drawRun", js.Any.fromFunction9(value))
    
    @scala.inline
    def setDrawTextRun(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "drawTextRun", js.Any.fromFunction9(value))
    
    @scala.inline
    def setGetOffsetBeforeAfter(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "getOffsetBeforeAfter", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetOffsetToLeftRightOf(value: (Double, Boolean) => Double): Self = StObject.set(x, "getOffsetToLeftRightOf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleReplacement(
      value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Self = StObject.set(x, "handleReplacement", js.Any.fromFunction12(value))
    
    @scala.inline
    def setHandleRun(
      value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Self = StObject.set(x, "handleRun", js.Any.fromFunction11(value))
    
    @scala.inline
    def setHandleText(
      value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Self = StObject.set(x, "handleText", js.Any.fromFunction13(value))
    
    @scala.inline
    def setMCharacterStyleSpanSet(value: js.Any): Self = StObject.set(x, "mCharacterStyleSpanSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMChars(value: js.Any): Self = StObject.set(x, "mChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCharsValid(value: js.Any): Self = StObject.set(x, "mCharsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDir(value: js.Any): Self = StObject.set(x, "mDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDirections(value: js.Any): Self = StObject.set(x, "mDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHasTabs(value: js.Any): Self = StObject.set(x, "mHasTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLen(value: js.Any): Self = StObject.set(x, "mLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMetricAffectingSpanSpanSet(value: js.Any): Self = StObject.set(x, "mMetricAffectingSpanSpanSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPaint(value: js.Any): Self = StObject.set(x, "mPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMReplacementSpanSpanSet(value: js.Any): Self = StObject.set(x, "mReplacementSpanSpanSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSpanned(value: js.Any): Self = StObject.set(x, "mSpanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMStart(value: js.Any): Self = StObject.set(x, "mStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTabs(value: js.Any): Self = StObject.set(x, "mTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMText(value: js.Any): Self = StObject.set(x, "mText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMWorkPaint(value: js.Any): Self = StObject.set(x, "mWorkPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasure(value: (Double, Boolean, FontMetricsInt) => Double): Self = StObject.set(x, "measure", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMeasureRun(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "measureRun", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMetrics(value: FontMetricsInt => Double): Self = StObject.set(x, "metrics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextTab(value: Double => Double): Self = StObject.set(x, "nextTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (TextPaint, String, Double, Double, Double, Directions, Boolean, TabStops) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction8(value))
  }
}
