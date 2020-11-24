package typings.androiduix.global.android.text

import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.DynamicLayout")
@js.native
class DynamicLayout protected ()
  extends typings.androiduix.android.text.DynamicLayout {
  def this(
    base: String,
    display: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean
  ) = this()
  def this(
    base: String,
    display: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt
  ) = this()
  def this(
    base: String,
    display: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ) = this()
  def this(
    base: String,
    display: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
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
  
  var INVALID_BLOCK_INDEX: Double = js.native
  
  var PRIORITY: js.Any = js.native
  
  var START: js.Any = js.native
  
  var START_MASK: js.Any = js.native
  
  var TAB: js.Any = js.native
  
  var TAB_MASK: js.Any = js.native
  
  var TOP: js.Any = js.native
  
  var sLock: js.Any = js.native
  
  var sStaticLayout: js.Any = js.native
}
