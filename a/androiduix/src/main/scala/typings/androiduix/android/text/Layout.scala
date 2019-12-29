package typings.androiduix.android.text

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.Path
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.Layout.Directions
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.Layout")
@js.native
abstract class Layout protected () extends js.Object {
  def this(text: String, paint: TextPaint, width: Double, align: Alignment) = this()
  def this(text: String, paint: TextPaint, width: Double, align: Alignment, textDir: TextDirectionHeuristic) = this()
  def this(
    text: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingMult: Double
  ) = this()
  def this(
    text: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingMult: Double,
    spacingAdd: Double
  ) = this()
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
  /* private */ def addSelection(line: js.Any, start: js.Any, end: js.Any, top: js.Any, bottom: js.Any, dest: js.Any): js.Any = js.native
  def draw(canvas: Canvas): Unit = js.native
  def draw(canvas: Canvas, highlight: Path): Unit = js.native
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
  /* private */ def getLineVisibleEnd(line: js.Any): js.Any = js.native
  /* private */ def getLineVisibleEnd(line: js.Any, start: js.Any): js.Any = js.native
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

/* static members */
@JSGlobal("android.text.Layout")
@js.native
object Layout extends js.Object {
  @js.native
  sealed trait Alignment extends js.Object
  
  @js.native
  class Directions protected () extends js.Object {
    def this(dirs: js.Array[Double]) = this()
    var mDirections: js.Array[Double] = js.native
  }
  
  @js.native
  class Ellipsizer protected ()
    extends typings.std.String {
    def this(s: String) = this()
    var mLayout: Layout = js.native
    var mMethod: TruncateAt = js.native
    var mText: String = js.native
    var mWidth: Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.NumberDictionary because Already inherited
  - typings.std.String because Already inherited
  - typings.androiduix.android.text.Spanned because var conflicts: iterator. Inlined getSpans, getSpanStart, getSpanEnd, getSpanFlags, nextSpanTransition */ @js.native
  class SpannedEllipsizer protected () extends Ellipsizer {
    def this(display: String) = this()
    var mSpanned: js.Any = js.native
    def getSpanEnd(tag: js.Any): Double = js.native
    def getSpanFlags(tag: js.Any): Double = js.native
    def getSpanStart(tag: js.Any): Double = js.native
    def getSpans[T](start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
    def nextSpanTransition(start: Double, limit: Double, `type`: js.Any): Double = js.native
  }
  
  @js.native
  class TabStops protected () extends js.Object {
    def this(increment: Double, spans: js.Array[_]) = this()
    var mIncrement: js.Any = js.native
    var mNumStops: js.Any = js.native
    var mStops: js.Any = js.native
    def nextTab(h: Double): Double = js.native
    def reset(increment: Double, spans: js.Array[_]): Unit = js.native
  }
  
  var DIRS_ALL_LEFT_TO_RIGHT: Directions = js.native
  var DIRS_ALL_RIGHT_TO_LEFT: Directions = js.native
  var DIR_LEFT_TO_RIGHT: Double = js.native
  var DIR_REQUEST_DEFAULT_LTR: Double = js.native
  var DIR_REQUEST_DEFAULT_RTL: Double = js.native
  var DIR_REQUEST_LTR: Double = js.native
  var DIR_REQUEST_RTL: Double = js.native
  var DIR_RIGHT_TO_LEFT: Double = js.native
  var ELLIPSIS_NORMAL: js.Array[String] = js.native
  var ELLIPSIS_TWO_DOTS: js.Array[String] = js.native
  var NO_PARA_SPANS: js.Any = js.native
  var RUN_LENGTH_MASK: Double = js.native
  var RUN_LEVEL_MASK: Double = js.native
  var RUN_LEVEL_SHIFT: Double = js.native
  var RUN_RTL_FLAG: Double = js.native
  var TAB_INCREMENT: js.Any = js.native
  var sTempRect: js.Any = js.native
  def getDesiredWidth(source: String, paint: TextPaint): Double = js.native
  def getDesiredWidth(source: String, start: Double, end: Double, paint: TextPaint): Double = js.native
  /* private */ def getDesiredWidth_2(source: js.Any, paint: js.Any): js.Any = js.native
  /* private */ def getDesiredWidth_4(source: js.Any, start: js.Any, end: js.Any, paint: js.Any): js.Any = js.native
  def getParagraphSpans[T](text: Spanned, start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  def measurePara(paint: TextPaint, text: String, start: Double, end: Double): Double = js.native
  def nextTab(text: String, start: Double, end: Double, h: Double, tabs: js.Array[_]): Double = js.native
  @js.native
  object Alignment extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
    /* 2 */ @js.native
    object ALIGN_CENTER extends TopLevel[ALIGN_CENTER with Double]
    
    /* 3 */ @js.native
    object ALIGN_LEFT extends TopLevel[ALIGN_LEFT with Double]
    
    /* 0 */ @js.native
    object ALIGN_NORMAL extends TopLevel[ALIGN_NORMAL with Double]
    
    /* 1 */ @js.native
    object ALIGN_OPPOSITE extends TopLevel[ALIGN_OPPOSITE with Double]
    
    /* 4 */ @js.native
    object ALIGN_RIGHT extends TopLevel[ALIGN_RIGHT with Double]
    
  }
  
  /* static members */
  @js.native
  object TabStops extends js.Object {
    def nextDefaultStop(h: Double, inc: Double): Double = js.native
  }
  
}

