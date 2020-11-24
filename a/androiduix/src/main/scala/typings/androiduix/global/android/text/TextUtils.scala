package typings.androiduix.global.android.text

import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextUtils.EllipsizeCallback
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.TextUtils")
@js.native
class TextUtils ()
  extends typings.androiduix.android.text.TextUtils
/* static members */
@JSGlobal("android.text.TextUtils")
@js.native
object TextUtils extends js.Object {
  
  var ABSOLUTE_SIZE_SPAN: Double = js.native
  
  var ALIGNMENT_SPAN: Double = js.native
  
  var ANNOTATION: Double = js.native
  
  var ARAB_SCRIPT_SUBTAG: js.Any = js.native
  
  var BACKGROUND_COLOR_SPAN: Double = js.native
  
  var BULLET_SPAN: Double = js.native
  
  var EASY_EDIT_SPAN: Double = js.native
  
  var EMPTY_STRING_ARRAY: js.Any = js.native
  
  var FIRST_SPAN: Double = js.native
  
  var FOREGROUND_COLOR_SPAN: Double = js.native
  
  var HEBR_SCRIPT_SUBTAG: js.Any = js.native
  
  var LAST_SPAN: Double = js.native
  
  var LEADING_MARGIN_SPAN: Double = js.native
  
  var LOCALE_SPAN: Double = js.native
  
  var QUOTE_SPAN: Double = js.native
  
  var RELATIVE_SIZE_SPAN: Double = js.native
  
  var SCALE_X_SPAN: Double = js.native
  
  var SPELL_CHECK_SPAN: Double = js.native
  
  var STRIKETHROUGH_SPAN: Double = js.native
  
  var STYLE_SPAN: Double = js.native
  
  var SUBSCRIPT_SPAN: Double = js.native
  
  var SUGGESTION_RANGE_SPAN: Double = js.native
  
  var SUGGESTION_SPAN: Double = js.native
  
  var SUPERSCRIPT_SPAN: Double = js.native
  
  var TEXT_APPEARANCE_SPAN: Double = js.native
  
  var TYPEFACE_SPAN: Double = js.native
  
  var UNDERLINE_SPAN: Double = js.native
  
  var URL_SPAN: Double = js.native
  
  var ZWNBS_CHAR: js.Any = js.native
  
  def ellipsize(text: String, paint: typings.androiduix.android.text.TextPaint, avail: Double, where: TruncateAt): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    textDir: js.UndefOr[scala.Nothing],
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    textDir: TextDirectionHeuristic
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    textDir: TextDirectionHeuristic,
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: EllipsizeCallback
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: EllipsizeCallback,
    textDir: js.UndefOr[scala.Nothing],
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic,
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: js.UndefOr[scala.Nothing],
    textDir: js.UndefOr[scala.Nothing],
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: js.UndefOr[scala.Nothing],
    textDir: TextDirectionHeuristic
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: js.UndefOr[scala.Nothing],
    textDir: TextDirectionHeuristic,
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback,
    textDir: js.UndefOr[scala.Nothing],
    ellipsis: js.Any
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic
  ): String = js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic,
    ellipsis: js.Any
  ): String = js.native
  
  def getOffsetAfter(text: String, offset: Double): Double = js.native
  
  def getOffsetBefore(text: String, offset: Double): Double = js.native
  
  def isEmpty(str: String): Boolean = js.native
  
  def packRangeInLong(start: Double, end: Double): js.Array[Double] = js.native
  
  def removeEmptySpans[T](spans: js.Array[T], spanned: typings.androiduix.android.text.Spanned, klass: js.Any): js.Array[T] = js.native
  
  /* private */ def setPara(mt: js.Any, paint: js.Any, text: js.Any, start: js.Any, end: js.Any, textDir: js.Any): js.Any = js.native
  
  def unpackRangeEndFromLong(range: js.Array[Double]): Double = js.native
  
  def unpackRangeStartFromLong(range: js.Array[Double]): Double = js.native
  
  @js.native
  object TruncateAt extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.text.TextUtils.TruncateAt with Double] = js.native
    
    /* 2 */ val END: typings.androiduix.android.text.TextUtils.TruncateAt.END with Double = js.native
    
    /* 4 */ val END_SMALL: typings.androiduix.android.text.TextUtils.TruncateAt.END_SMALL with Double = js.native
    
    /* 3 */ val MARQUEE: typings.androiduix.android.text.TextUtils.TruncateAt.MARQUEE with Double = js.native
    
    /* 1 */ val MIDDLE: typings.androiduix.android.text.TextUtils.TruncateAt.MIDDLE with Double = js.native
    
    /* 0 */ val START: typings.androiduix.android.text.TextUtils.TruncateAt.START with Double = js.native
  }
}
