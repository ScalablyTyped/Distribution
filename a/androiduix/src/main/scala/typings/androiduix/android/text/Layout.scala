package typings.androiduix.android.text

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.Path
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.Layout.Directions
import typings.androiduix.android.text.TextUtils.TruncateAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends StObject {
  
  /* private */ def addSelection(line: js.Any, start: js.Any, end: js.Any, top: js.Any, bottom: js.Any, dest: js.Any): js.Any = js.native
  
  def draw(canvas: Canvas): Unit = js.native
  def draw(
    canvas: Canvas,
    highlight: js.UndefOr[scala.Nothing],
    highlightPaint: js.UndefOr[scala.Nothing],
    cursorOffsetVertical: Double
  ): Unit = js.native
  def draw(canvas: Canvas, highlight: js.UndefOr[scala.Nothing], highlightPaint: Paint): Unit = js.native
  def draw(
    canvas: Canvas,
    highlight: js.UndefOr[scala.Nothing],
    highlightPaint: Paint,
    cursorOffsetVertical: Double
  ): Unit = js.native
  def draw(canvas: Canvas, highlight: Path): Unit = js.native
  def draw(
    canvas: Canvas,
    highlight: Path,
    highlightPaint: js.UndefOr[scala.Nothing],
    cursorOffsetVertical: Double
  ): Unit = js.native
  def draw(canvas: Canvas, highlight: Path, highlightPaint: Paint): Unit = js.native
  def draw(canvas: Canvas, highlight: Path, highlightPaint: Paint, cursorOffsetVertical: Double): Unit = js.native
  
  def drawBackground(
    canvas: Canvas,
    highlight: Path,
    highlightPaint: Paint,
    cursorOffsetVertical: Double,
    firstLine: Double,
    lastLine: Double
  ): Unit = js.native
  
  def drawText(canvas: Canvas, firstLine: Double, lastLine: Double): Unit = js.native
  
  /* private */ def ellipsize(start: js.Any, end: js.Any, line: js.Any, dest: js.Any, destoff: js.Any, method: js.Any): js.Any = js.native
  
  def getAlignment(): Alignment = js.native
  
  def getBottomPadding(): Double = js.native
  
  def getCursorPath(point: Double, dest: Path, editingBuffer: String): Unit = js.native
  
  /* private */ def getEllipsisChar(method: js.Any): js.Any = js.native
  
  def getEllipsisCount(line: Double): Double = js.native
  
  def getEllipsisStart(line: Double): Double = js.native
  
  def getEllipsizedWidth(): Double = js.native
  
  def getHeight(): Double = js.native
  
  /* private */ def getHorizontal(offset: js.Any, trailing: js.Any, clamped: js.Any): js.Any = js.native
  
  /* private */ def getHorizontal_4(offset: js.Any, trailing: js.Any, line: js.Any, clamped: js.Any): js.Any = js.native
  
  def getLineAscent(line: Double): Double = js.native
  
  def getLineBaseline(line: Double): Double = js.native
  
  def getLineBottom(line: Double): Double = js.native
  
  def getLineBounds(line: Double, bounds: Rect): Double = js.native
  
  def getLineContainsTab(line: Double): Boolean = js.native
  
  def getLineCount(): Double = js.native
  
  def getLineDescent(line: Double): Double = js.native
  
  def getLineDirections(line: Double): Directions = js.native
  
  def getLineEnd(line: Double): Double = js.native
  
  /* private */ def getLineExtent(line: js.Any, full: js.Any): js.Any = js.native
  /* private */ def getLineExtent(line: js.Any, tabStops: js.Any, full: js.Any): js.Any = js.native
  
  /* private */ def getLineExtent_2(line: js.Any, full: js.Any): js.Any = js.native
  
  /* private */ def getLineExtent_3(line: js.Any, tabStops: js.Any, full: js.Any): js.Any = js.native
  
  def getLineForOffset(offset: Double): Double = js.native
  
  def getLineForVertical(vertical: Double): Double = js.native
  
  def getLineLeft(line: Double): Double = js.native
  
  def getLineMax(line: Double): Double = js.native
  
  def getLineRangeForDraw(canvas: Canvas): js.Array[Double] = js.native
  
  def getLineRight(line: Double): Double = js.native
  
  def getLineStart(line: Double): Double = js.native
  
  /* private */ def getLineStartPos(line: js.Any, left: js.Any, right: js.Any): js.Any = js.native
  
  def getLineTop(line: Double): Double = js.native
  
  /* private */ def getLineVisibleEnd(line: js.Any, start: js.Any, end: js.Any): js.Any = js.native
  
  def getLineWidth(line: Double): Double = js.native
  
  /* private */ def getOffsetAtStartOf(offset: js.Any): js.Any = js.native
  
  def getOffsetForHorizontal(line: Double, horiz: Double): Double = js.native
  
  def getOffsetToLeftOf(offset: Double): Double = js.native
  
  /* private */ def getOffsetToLeftRightOf(caret: js.Any, toLeft: js.Any): js.Any = js.native
  
  def getOffsetToRightOf(offset: Double): Double = js.native
  
  def getPaint(): TextPaint = js.native
  
  def getParagraphAlignment(line: Double): Alignment = js.native
  
  def getParagraphDirection(line: Double): Double = js.native
  
  /* private */ def getParagraphLeadingMargin(line: js.Any): js.Any = js.native
  
  def getParagraphLeft(line: Double): Double = js.native
  
  def getParagraphRight(line: Double): Double = js.native
  
  def getPrimaryHorizontal(offset: Double): Double = js.native
  def getPrimaryHorizontal(offset: Double, clamped: Boolean): Double = js.native
  
  def getSecondaryHorizontal(offset: Double): Double = js.native
  def getSecondaryHorizontal(offset: Double, clamped: Boolean): Double = js.native
  
  def getSelectionPath(start: Double, end: Double, dest: Path): Unit = js.native
  
  def getSpacingAdd(): Double = js.native
  
  def getSpacingMultiplier(): Double = js.native
  
  def getText(): String = js.native
  
  def getTextDirectionHeuristic(): TextDirectionHeuristic = js.native
  
  def getTopPadding(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def increaseWidthTo(wid: Double): Unit = js.native
  
  def isLevelBoundary(offset: Double): Boolean = js.native
  
  def isRtlCharAt(offset: Double): Boolean = js.native
  
  /* protected */ def isSpanned(): Boolean = js.native
  
  var mAlignment: js.Any = js.native
  
  var mLineBackgroundSpans: js.Any = js.native
  
  var mPaint: js.Any = js.native
  
  var mSpacingAdd: js.Any = js.native
  
  var mSpacingMult: js.Any = js.native
  
  var mSpannedText: js.Any = js.native
  
  var mText: js.Any = js.native
  
  var mTextDir: js.Any = js.native
  
  var mWidth: js.Any = js.native
  
  var mWorkPaint: TextPaint = js.native
  
  /* private */ def primaryIsTrailingPrevious(offset: js.Any): js.Any = js.native
  
  def replaceWith(
    text: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double
  ): Unit = js.native
  
  def shouldClampCursor(line: Double): Boolean = js.native
}
object Layout {
  
  @js.native
  sealed trait Alignment extends StObject
  @JSGlobal("android.text.Layout.Alignment")
  @js.native
  object Alignment extends StObject {
    
    @js.native
    sealed trait ALIGN_CENTER extends Alignment
    
    @js.native
    sealed trait ALIGN_LEFT extends Alignment
    
    @js.native
    sealed trait ALIGN_NORMAL extends Alignment
    
    @js.native
    sealed trait ALIGN_OPPOSITE extends Alignment
    
    @js.native
    sealed trait ALIGN_RIGHT extends Alignment
  }
  
  @js.native
  trait Directions extends StObject {
    
    var mDirections: js.Array[Double] = js.native
  }
  object Directions {
    
    @scala.inline
    def apply(mDirections: js.Array[Double]): Directions = {
      val __obj = js.Dynamic.literal(mDirections = mDirections.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directions]
    }
    
    @scala.inline
    implicit class DirectionsMutableBuilder[Self <: Directions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMDirections(value: js.Array[Double]): Self = StObject.set(x, "mDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDirectionsVarargs(value: Double*): Self = StObject.set(x, "mDirections", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Ellipsizer
    extends typings.std.String {
    
    var mLayout: Layout = js.native
    
    var mMethod: TruncateAt = js.native
    
    var mText: String = js.native
    
    var mWidth: Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.NumberDictionary because Already inherited
  - typings.std.String because Already inherited
  - typings.androiduix.android.text.Spanned because var conflicts: iterator. Inlined getSpans, getSpanStart, getSpanEnd, getSpanFlags, nextSpanTransition */ @js.native
  trait SpannedEllipsizer extends Ellipsizer {
    
    def getSpanEnd(tag: js.Any): Double = js.native
    
    def getSpanFlags(tag: js.Any): Double = js.native
    
    def getSpanStart(tag: js.Any): Double = js.native
    
    def getSpans[T](start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
    
    var mSpanned: js.Any = js.native
    
    def nextSpanTransition(start: Double, limit: Double, `type`: js.Any): Double = js.native
  }
  
  @js.native
  trait TabStops extends StObject {
    
    var mIncrement: js.Any = js.native
    
    var mNumStops: js.Any = js.native
    
    var mStops: js.Any = js.native
    
    def nextTab(h: Double): Double = js.native
    
    def reset(increment: Double, spans: js.Array[_]): Unit = js.native
  }
  object TabStops {
    
    @scala.inline
    def apply(
      mIncrement: js.Any,
      mNumStops: js.Any,
      mStops: js.Any,
      nextTab: Double => Double,
      reset: (Double, js.Array[_]) => Unit
    ): TabStops = {
      val __obj = js.Dynamic.literal(mIncrement = mIncrement.asInstanceOf[js.Any], mNumStops = mNumStops.asInstanceOf[js.Any], mStops = mStops.asInstanceOf[js.Any], nextTab = js.Any.fromFunction1(nextTab), reset = js.Any.fromFunction2(reset))
      __obj.asInstanceOf[TabStops]
    }
    
    @scala.inline
    implicit class TabStopsMutableBuilder[Self <: TabStops] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIncrement(value: js.Any): Self = StObject.set(x, "mIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNumStops(value: js.Any): Self = StObject.set(x, "mNumStops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMStops(value: js.Any): Self = StObject.set(x, "mStops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTab(value: Double => Double): Self = StObject.set(x, "nextTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: (Double, js.Array[_]) => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
    }
  }
}
