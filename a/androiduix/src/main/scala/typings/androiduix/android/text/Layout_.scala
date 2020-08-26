package typings.androiduix.android.text

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.Path
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.Layout.Directions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout_ extends js.Object {
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

