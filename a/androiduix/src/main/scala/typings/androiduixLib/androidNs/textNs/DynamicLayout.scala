package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.DynamicLayout")
@js.native
class DynamicLayout protected () extends Layout {
  def this(base: java.lang.String, display: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean) = this()
  def this(base: java.lang.String, display: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt) = this()
  def this(base: java.lang.String, display: java.lang.String, paint: TextPaint, width: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt, ellipsizedWidth: scala.Double) = this()
  var mBase: js.Any = js.native
  var mBlockEndLines: js.Any = js.native
  var mBlockIndices: js.Any = js.native
  var mBottomPadding: js.Any = js.native
  var mDisplay: js.Any = js.native
  var mEllipsize: js.Any = js.native
  var mEllipsizeAt: js.Any = js.native
  var mEllipsizedWidth: js.Any = js.native
  var mIncludePad: js.Any = js.native
  var mIndexFirstChangedBlock: js.Any = js.native
  var mInts: js.Any = js.native
  var mNumberOfBlocks: js.Any = js.native
  var mObjects: js.Any = js.native
  var mTopPadding: js.Any = js.native
  var mWatcher: js.Any = js.native
  /* private */ def addBlockAtOffset(offset: js.Any): js.Any = js.native
  /* private */ def createBlocks(): js.Any = js.native
  def getBlockEndLines(): js.Array[scala.Double] = js.native
  def getBlockIndices(): js.Array[scala.Double] = js.native
  def getIndexFirstChangedBlock(): scala.Double = js.native
  def getNumberOfBlocks(): scala.Double = js.native
  /* private */ def reflow(s: js.Any, where: js.Any, before: js.Any, after: js.Any): js.Any = js.native
  def setBlocksDataForTest(
    blockEndLines: js.Array[scala.Double],
    blockIndices: js.Array[scala.Double],
    numberOfBlocks: scala.Double
  ): scala.Unit = js.native
  def setIndexFirstChangedBlock(i: scala.Double): scala.Unit = js.native
  def updateBlocks(startLine: scala.Double, endLine: scala.Double, newLineCount: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.text.DynamicLayout")
@js.native
object DynamicLayout extends js.Object {
  var BLOCK_MINIMUM_CHARACTER_LENGTH: js.Any = js.native
  var COLUMNS_ELLIPSIZE: js.Any = js.native
  var COLUMNS_NORMAL: js.Any = js.native
  var DESCENT: js.Any = js.native
  var DIR: js.Any = js.native
  var DIR_SHIFT: js.Any = js.native
  var ELLIPSIS_COUNT: js.Any = js.native
  var ELLIPSIS_START: js.Any = js.native
  var ELLIPSIS_UNDEFINED: js.Any = js.native
  var INVALID_BLOCK_INDEX: scala.Double = js.native
  var PRIORITY: js.Any = js.native
  var START: js.Any = js.native
  var START_MASK: js.Any = js.native
  var TAB: js.Any = js.native
  var TAB_MASK: js.Any = js.native
  var TOP: js.Any = js.native
  var sLock: js.Any = js.native
  var sStaticLayout: js.Any = js.native
}

