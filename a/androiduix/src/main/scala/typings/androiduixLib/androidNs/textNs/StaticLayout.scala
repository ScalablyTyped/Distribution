package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.StaticLayout")
@js.native
class StaticLayout protected () extends Layout {
  def this(source: java.lang.String, bufstart: scala.Double, bufend: scala.Double, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean) = this()
  def this(source: java.lang.String, bufstart: scala.Double, bufend: scala.Double, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt) = this()
  def this(source: java.lang.String, bufstart: scala.Double, bufend: scala.Double, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt, ellipsizedWidth: scala.Double) = this()
  def this(source: java.lang.String, bufstart: scala.Double, bufend: scala.Double, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, textDir: TextDirectionHeuristic, spacingmult: scala.Double, spacingadd: scala.Double, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt, ellipsizedWidth: scala.Double, maxLines: scala.Double) = this()
  var mBottomPadding: js.Any = js.native
  var mColumns: js.Any = js.native
  var mEllipsizedWidth: js.Any = js.native
  var mFontMetricsInt: js.Any = js.native
  var mLineCount: js.Any = js.native
  var mLineDirections: js.Any = js.native
  var mLines: js.Any = js.native
  var mMaximumVisibleLineCount: js.Any = js.native
  var mMeasured: js.Any = js.native
  var mTopPadding: js.Any = js.native
  /* private */ def calculateEllipsis(
    lineStart: js.Any,
    lineEnd: js.Any,
    widths: js.Any,
    widthStart: js.Any,
    avail: js.Any,
    where: js.Any,
    line: js.Any,
    textWidth: js.Any,
    paint: js.Any,
    forceEllipsis: js.Any
  ): js.Any = js.native
  def finish(): scala.Unit = js.native
  def generate(
    source: java.lang.String,
    bufStart: scala.Double,
    bufEnd: scala.Double,
    paint: TextPaint,
    outerWidth: scala.Double,
    textDir: TextDirectionHeuristic,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    includepad: scala.Boolean,
    trackpad: scala.Boolean,
    ellipsizedWidth: scala.Double,
    ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  ): scala.Unit = js.native
  /* private */ def out(
    text: js.Any,
    start: js.Any,
    end: js.Any,
    above: js.Any,
    below: js.Any,
    top: js.Any,
    bottom: js.Any,
    v: js.Any,
    spacingmult: js.Any,
    spacingadd: js.Any,
    chooseHt: js.Any,
    chooseHtv: js.Any,
    fm: js.Any,
    hasTabOrEmoji: js.Any,
    needMultiply: js.Any,
    chdirs: js.Any,
    dir: js.Any,
    easy: js.Any,
    bufEnd: js.Any,
    includePad: js.Any,
    trackPad: js.Any,
    chs: js.Any,
    widths: js.Any,
    widthStart: js.Any,
    ellipsize: js.Any,
    ellipsisWidth: js.Any,
    textWidth: js.Any,
    paint: js.Any,
    moreChars: js.Any
  ): js.Any = js.native
  def prepare(): scala.Unit = js.native
}

@JSGlobal("android.text.StaticLayout")
@js.native
object StaticLayout extends js.Object {
  var CHAR_FIRST_CJK: js.Any = js.native
  var CHAR_FIRST_HIGH_SURROGATE: js.Any = js.native
  var CHAR_HYPHEN: js.Any = js.native
  var CHAR_LAST_LOW_SURROGATE: js.Any = js.native
  var CHAR_NEW_LINE: js.Any = js.native
  var CHAR_SLASH: js.Any = js.native
  var CHAR_SPACE: js.Any = js.native
  var CHAR_TAB: js.Any = js.native
  var CHAR_ZWSP: js.Any = js.native
  var COLUMNS_ELLIPSIZE: js.Any = js.native
  var COLUMNS_NORMAL: js.Any = js.native
  var DESCENT: js.Any = js.native
  var DIR: js.Any = js.native
  var DIR_SHIFT: js.Any = js.native
  var ELLIPSIS_COUNT: js.Any = js.native
  var ELLIPSIS_START: js.Any = js.native
  var EXTRA_ROUNDING: js.Any = js.native
  var START: js.Any = js.native
  var START_MASK: js.Any = js.native
  var TAB: js.Any = js.native
  var TAB_MASK: js.Any = js.native
  var TAG: java.lang.String = js.native
  var TOP: js.Any = js.native
  /* private */ def isIdeographic(c: js.Any, includeNonStarters: js.Any): js.Any = js.native
}

