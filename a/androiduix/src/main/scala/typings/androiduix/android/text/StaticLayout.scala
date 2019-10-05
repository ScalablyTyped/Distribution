package typings.androiduix.android.text

import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.StaticLayout")
@js.native
class StaticLayout protected () extends Layout {
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double,
    maxLines: Double
  ) = this()
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
  def finish(): Unit = js.native
  def generate(
    source: String,
    bufStart: Double,
    bufEnd: Double,
    paint: TextPaint,
    outerWidth: Double,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    trackpad: Boolean,
    ellipsizedWidth: Double,
    ellipsize: TruncateAt
  ): Unit = js.native
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
  def prepare(): Unit = js.native
}

/* static members */
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
  var TAG: String = js.native
  var TOP: js.Any = js.native
  /* private */ def isIdeographic(c: js.Any, includeNonStarters: js.Any): js.Any = js.native
}

