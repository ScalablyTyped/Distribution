package typings.androiduix.android.text

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.Path
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.text.BoringLayout.Metrics
import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.Layout.Directions
import typings.androiduix.android.text.TextUtils.EllipsizeCallback
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoringLayout_
  extends Layout
     with EllipsizeCallback {
  var mBottom: Double = js.native
  var mBottomPadding: js.Any = js.native
  var mDesc: Double = js.native
  var mDirect: js.Any = js.native
  var mEllipsizedCount: js.Any = js.native
  var mEllipsizedStart: js.Any = js.native
  var mEllipsizedWidth: js.Any = js.native
  var mMax: js.Any = js.native
  var mTopPadding: js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def addSelection(line: js.Any, start: js.Any, end: js.Any, top: js.Any, bottom: js.Any, dest: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): Unit = js.native
  /* InferMemberOverrides */
  override def draw(
    canvas: Canvas,
    highlight: js.UndefOr[scala.Nothing],
    highlightPaint: js.UndefOr[scala.Nothing],
    cursorOffsetVertical: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas, highlight: js.UndefOr[scala.Nothing], highlightPaint: Paint): Unit = js.native
  /* InferMemberOverrides */
  override def draw(
    canvas: Canvas,
    highlight: js.UndefOr[scala.Nothing],
    highlightPaint: Paint,
    cursorOffsetVertical: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas, highlight: Path): Unit = js.native
  /* InferMemberOverrides */
  override def draw(
    canvas: Canvas,
    highlight: Path,
    highlightPaint: js.UndefOr[scala.Nothing],
    cursorOffsetVertical: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas, highlight: Path, highlightPaint: Paint): Unit = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas, highlight: Path, highlightPaint: Paint, cursorOffsetVertical: Double): Unit = js.native
  /* InferMemberOverrides */
  override def drawBackground(
    canvas: Canvas,
    highlight: Path,
    highlightPaint: Paint,
    cursorOffsetVertical: Double,
    firstLine: Double,
    lastLine: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def drawText(canvas: Canvas, firstLine: Double, lastLine: Double): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def ellipsize(start: js.Any, end: js.Any, line: js.Any, dest: js.Any, destoff: js.Any, method: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getAlignment(): Alignment = js.native
  /* InferMemberOverrides */
  override def getBottomPadding(): Double = js.native
  /* InferMemberOverrides */
  override def getCursorPath(point: Double, dest: Path, editingBuffer: String): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def getEllipsisChar(method: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getEllipsisCount(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getEllipsisStart(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getEllipsizedWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getHeight(): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getHorizontal(offset: js.Any, trailing: js.Any, clamped: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def getHorizontal_4(offset: js.Any, trailing: js.Any, line: js.Any, clamped: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getLineAscent(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineBaseline(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineBottom(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineBounds(line: Double, bounds: Rect): Double = js.native
  /* InferMemberOverrides */
  override def getLineContainsTab(line: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def getLineCount(): Double = js.native
  /* InferMemberOverrides */
  override def getLineDescent(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineDirections(line: Double): Directions = js.native
  /* InferMemberOverrides */
  override def getLineEnd(line: Double): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getLineExtent(line: js.Any, full: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def getLineExtent(line: js.Any, tabStops: js.Any, full: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def getLineExtent_2(line: js.Any, full: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def getLineExtent_3(line: js.Any, tabStops: js.Any, full: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getLineForOffset(offset: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineForVertical(vertical: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineLeft(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineMax(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineRangeForDraw(canvas: Canvas): js.Array[Double] = js.native
  /* InferMemberOverrides */
  override def getLineRight(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getLineStart(line: Double): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getLineStartPos(line: js.Any, left: js.Any, right: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getLineTop(line: Double): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getLineVisibleEnd(line: js.Any, start: js.Any, end: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getLineWidth(line: Double): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getOffsetAtStartOf(offset: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getOffsetForHorizontal(line: Double, horiz: Double): Double = js.native
  /* InferMemberOverrides */
  override def getOffsetToLeftOf(offset: Double): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getOffsetToLeftRightOf(caret: js.Any, toLeft: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getOffsetToRightOf(offset: Double): Double = js.native
  /* InferMemberOverrides */
  override def getPaint(): TextPaint = js.native
  /* InferMemberOverrides */
  override def getParagraphAlignment(line: Double): Alignment = js.native
  /* InferMemberOverrides */
  override def getParagraphDirection(line: Double): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getParagraphLeadingMargin(line: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getParagraphLeft(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getParagraphRight(line: Double): Double = js.native
  /* InferMemberOverrides */
  override def getPrimaryHorizontal(offset: Double): Double = js.native
  /* InferMemberOverrides */
  override def getPrimaryHorizontal(offset: Double, clamped: Boolean): Double = js.native
  /* InferMemberOverrides */
  override def getSecondaryHorizontal(offset: Double): Double = js.native
  /* InferMemberOverrides */
  override def getSecondaryHorizontal(offset: Double, clamped: Boolean): Double = js.native
  /* InferMemberOverrides */
  override def getSelectionPath(start: Double, end: Double, dest: Path): Unit = js.native
  /* InferMemberOverrides */
  override def getSpacingAdd(): Double = js.native
  /* InferMemberOverrides */
  override def getSpacingMultiplier(): Double = js.native
  /* InferMemberOverrides */
  override def getText(): String = js.native
  /* InferMemberOverrides */
  override def getTextDirectionHeuristic(): TextDirectionHeuristic = js.native
  /* InferMemberOverrides */
  override def getTopPadding(): Double = js.native
  /* InferMemberOverrides */
  override def getWidth(): Double = js.native
  /* InferMemberOverrides */
  override def increaseWidthTo(wid: Double): Unit = js.native
  def init(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    trustWidth: Boolean
  ): Unit = js.native
  /* InferMemberOverrides */
  override def isLevelBoundary(offset: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def isRtlCharAt(offset: Double): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def isSpanned(): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def primaryIsTrailingPrevious(offset: js.Any): js.Any = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean
  ): BoringLayout = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ): BoringLayout = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ): BoringLayout = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ): BoringLayout = js.native
  /* InferMemberOverrides */
  override def replaceWith(
    text: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def shouldClampCursor(line: Double): Boolean = js.native
}

