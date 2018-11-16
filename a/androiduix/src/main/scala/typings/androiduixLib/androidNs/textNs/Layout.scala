package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.Layout")
@js.native
abstract class Layout protected () extends js.Object {
  def this(text: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment) = this()
  def this(text: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic) = this()
  def this(text: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingMult: scala.Double) = this()
  def this(text: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingMult: scala.Double, spacingAdd: scala.Double) = this()
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
  def draw(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  def draw(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    highlight: androiduixLib.androidNs.graphicsNs.Path
  ): scala.Unit = js.native
  def draw(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    highlight: androiduixLib.androidNs.graphicsNs.Path,
    highlightPaint: androiduixLib.androidNs.graphicsNs.Paint
  ): scala.Unit = js.native
  def draw(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    highlight: androiduixLib.androidNs.graphicsNs.Path,
    highlightPaint: androiduixLib.androidNs.graphicsNs.Paint,
    cursorOffsetVertical: scala.Double
  ): scala.Unit = js.native
  def drawBackground(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    highlight: androiduixLib.androidNs.graphicsNs.Path,
    highlightPaint: androiduixLib.androidNs.graphicsNs.Paint,
    cursorOffsetVertical: scala.Double,
    firstLine: scala.Double,
    lastLine: scala.Double
  ): scala.Unit = js.native
  def drawText(canvas: androiduixLib.androidNs.graphicsNs.Canvas, firstLine: scala.Double, lastLine: scala.Double): scala.Unit = js.native
  /* private */ def ellipsize(start: js.Any, end: js.Any, line: js.Any, dest: js.Any, destoff: js.Any, method: js.Any): js.Any = js.native
  def getAlignment(): androiduixLib.androidNs.textNs.LayoutNs.Alignment = js.native
  def getBottomPadding(): scala.Double = js.native
  def getCursorPath(
    point: scala.Double,
    dest: androiduixLib.androidNs.graphicsNs.Path,
    editingBuffer: java.lang.String
  ): scala.Unit = js.native
  /* private */ def getEllipsisChar(method: js.Any): js.Any = js.native
  def getEllipsisCount(line: scala.Double): scala.Double = js.native
  def getEllipsisStart(line: scala.Double): scala.Double = js.native
  def getEllipsizedWidth(): scala.Double = js.native
  def getHeight(): scala.Double = js.native
  /* private */ def getHorizontal(offset: js.Any, trailing: js.Any, clamped: js.Any): js.Any = js.native
  /* private */ def getHorizontal_4(offset: js.Any, trailing: js.Any, line: js.Any, clamped: js.Any): js.Any = js.native
  def getLineAscent(line: scala.Double): scala.Double = js.native
  def getLineBaseline(line: scala.Double): scala.Double = js.native
  def getLineBottom(line: scala.Double): scala.Double = js.native
  def getLineBounds(line: scala.Double, bounds: androiduixLib.androidNs.graphicsNs.Rect): scala.Double = js.native
  def getLineContainsTab(line: scala.Double): scala.Boolean = js.native
  def getLineCount(): scala.Double = js.native
  def getLineDescent(line: scala.Double): scala.Double = js.native
  def getLineDirections(line: scala.Double): androiduixLib.androidNs.textNs.LayoutNs.Directions = js.native
  def getLineEnd(line: scala.Double): scala.Double = js.native
  /* private */ def getLineExtent(line: js.Any, full: js.Any): js.Any = js.native
  /* private */ def getLineExtent(line: js.Any, tabStops: js.Any, full: js.Any): js.Any = js.native
  /* private */ def getLineExtent_2(line: js.Any, full: js.Any): js.Any = js.native
  /* private */ def getLineExtent_3(line: js.Any, tabStops: js.Any, full: js.Any): js.Any = js.native
  def getLineForOffset(offset: scala.Double): scala.Double = js.native
  def getLineForVertical(vertical: scala.Double): scala.Double = js.native
  def getLineLeft(line: scala.Double): scala.Double = js.native
  def getLineMax(line: scala.Double): scala.Double = js.native
  def getLineRangeForDraw(canvas: androiduixLib.androidNs.graphicsNs.Canvas): js.Array[scala.Double] = js.native
  def getLineRight(line: scala.Double): scala.Double = js.native
  def getLineStart(line: scala.Double): scala.Double = js.native
  /* private */ def getLineStartPos(line: js.Any, left: js.Any, right: js.Any): js.Any = js.native
  def getLineTop(line: scala.Double): scala.Double = js.native
  /* private */ def getLineVisibleEnd(line: js.Any): js.Any = js.native
  /* private */ def getLineVisibleEnd(line: js.Any, start: js.Any): js.Any = js.native
  /* private */ def getLineVisibleEnd(line: js.Any, start: js.Any, end: js.Any): js.Any = js.native
  def getLineWidth(line: scala.Double): scala.Double = js.native
  /* private */ def getOffsetAtStartOf(offset: js.Any): js.Any = js.native
  def getOffsetForHorizontal(line: scala.Double, horiz: scala.Double): scala.Double = js.native
  def getOffsetToLeftOf(offset: scala.Double): scala.Double = js.native
  /* private */ def getOffsetToLeftRightOf(caret: js.Any, toLeft: js.Any): js.Any = js.native
  def getOffsetToRightOf(offset: scala.Double): scala.Double = js.native
  def getPaint(): TextPaint = js.native
  def getParagraphAlignment(line: scala.Double): androiduixLib.androidNs.textNs.LayoutNs.Alignment = js.native
  def getParagraphDirection(line: scala.Double): scala.Double = js.native
  /* private */ def getParagraphLeadingMargin(line: js.Any): js.Any = js.native
  def getParagraphLeft(line: scala.Double): scala.Double = js.native
  def getParagraphRight(line: scala.Double): scala.Double = js.native
  def getPrimaryHorizontal(offset: scala.Double): scala.Double = js.native
  def getPrimaryHorizontal(offset: scala.Double, clamped: scala.Boolean): scala.Double = js.native
  def getSecondaryHorizontal(offset: scala.Double): scala.Double = js.native
  def getSecondaryHorizontal(offset: scala.Double, clamped: scala.Boolean): scala.Double = js.native
  def getSelectionPath(start: scala.Double, end: scala.Double, dest: androiduixLib.androidNs.graphicsNs.Path): scala.Unit = js.native
  def getSpacingAdd(): scala.Double = js.native
  def getSpacingMultiplier(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def getTextDirectionHeuristic(): TextDirectionHeuristic = js.native
  def getTopPadding(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def increaseWidthTo(wid: scala.Double): scala.Unit = js.native
  def isLevelBoundary(offset: scala.Double): scala.Boolean = js.native
  def isRtlCharAt(offset: scala.Double): scala.Boolean = js.native
  /* protected */ def isSpanned(): scala.Boolean = js.native
  /* private */ def primaryIsTrailingPrevious(offset: js.Any): js.Any = js.native
  def replaceWith(
    text: java.lang.String,
    paint: TextPaint,
    width: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double
  ): scala.Unit = js.native
  def shouldClampCursor(line: scala.Double): scala.Boolean = js.native
}

@JSGlobal("android.text.Layout")
@js.native
object Layout extends js.Object {
  var DIRS_ALL_LEFT_TO_RIGHT: androiduixLib.androidNs.textNs.LayoutNs.Directions = js.native
  var DIRS_ALL_RIGHT_TO_LEFT: androiduixLib.androidNs.textNs.LayoutNs.Directions = js.native
  var DIR_LEFT_TO_RIGHT: scala.Double = js.native
  var DIR_REQUEST_DEFAULT_LTR: scala.Double = js.native
  var DIR_REQUEST_DEFAULT_RTL: scala.Double = js.native
  var DIR_REQUEST_LTR: scala.Double = js.native
  var DIR_REQUEST_RTL: scala.Double = js.native
  var DIR_RIGHT_TO_LEFT: scala.Double = js.native
  var ELLIPSIS_NORMAL: js.Array[java.lang.String] = js.native
  var ELLIPSIS_TWO_DOTS: js.Array[java.lang.String] = js.native
  var NO_PARA_SPANS: js.Any = js.native
  var RUN_LENGTH_MASK: scala.Double = js.native
  var RUN_LEVEL_MASK: scala.Double = js.native
  var RUN_LEVEL_SHIFT: scala.Double = js.native
  var RUN_RTL_FLAG: scala.Double = js.native
  var TAB_INCREMENT: js.Any = js.native
  var sTempRect: js.Any = js.native
  def getDesiredWidth(source: java.lang.String, paint: androiduixLib.androidNs.textNs.TextPaint): scala.Double = js.native
  def getDesiredWidth(
    source: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    paint: androiduixLib.androidNs.textNs.TextPaint
  ): scala.Double = js.native
  /* private */ def getDesiredWidth_2(source: js.Any, paint: js.Any): js.Any = js.native
  /* private */ def getDesiredWidth_4(source: js.Any, start: js.Any, end: js.Any, paint: js.Any): js.Any = js.native
  def getParagraphSpans[T](
    text: androiduixLib.androidNs.textNs.Spanned,
    start: scala.Double,
    end: scala.Double,
    `type`: js.Any
  ): js.Array[T] = js.native
  def measurePara(
    paint: androiduixLib.androidNs.textNs.TextPaint,
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double
  ): scala.Double = js.native
  def nextTab(text: java.lang.String, start: scala.Double, end: scala.Double, h: scala.Double, tabs: js.Array[_]): scala.Double = js.native
}

