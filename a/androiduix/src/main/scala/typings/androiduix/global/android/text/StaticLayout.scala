package typings.androiduix.global.android.text

import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.StaticLayout")
@js.native
class StaticLayout protected ()
  extends typings.androiduix.android.text.StaticLayout {
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typings.androiduix.android.text.TextPaint,
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
    paint: typings.androiduix.android.text.TextPaint,
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
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typings.androiduix.android.text.TextPaint,
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
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: js.UndefOr[scala.Nothing],
    maxLines: Double
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double,
    maxLines: Double
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: js.UndefOr[scala.Nothing],
    maxLines: Double
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typings.androiduix.android.text.TextPaint,
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
