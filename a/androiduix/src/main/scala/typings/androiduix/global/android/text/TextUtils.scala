package typings.androiduix.global.android.text

import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextUtils.EllipsizeCallback
import typings.androiduix.android.text.TextUtils.TruncateAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.TextUtils")
@js.native
class TextUtils ()
  extends typings.androiduix.android.text.TextUtils
object TextUtils {
  
  @JSGlobal("android.text.TextUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.ABSOLUTE_SIZE_SPAN")
  @js.native
  def ABSOLUTE_SIZE_SPAN: Double = js.native
  @scala.inline
  def ABSOLUTE_SIZE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE_SIZE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.ALIGNMENT_SPAN")
  @js.native
  def ALIGNMENT_SPAN: Double = js.native
  @scala.inline
  def ALIGNMENT_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGNMENT_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.ANNOTATION")
  @js.native
  def ANNOTATION: Double = js.native
  @scala.inline
  def ANNOTATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.ARAB_SCRIPT_SUBTAG")
  @js.native
  def ARAB_SCRIPT_SUBTAG: js.Any = js.native
  @scala.inline
  def ARAB_SCRIPT_SUBTAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARAB_SCRIPT_SUBTAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.BACKGROUND_COLOR_SPAN")
  @js.native
  def BACKGROUND_COLOR_SPAN: Double = js.native
  @scala.inline
  def BACKGROUND_COLOR_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKGROUND_COLOR_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.BULLET_SPAN")
  @js.native
  def BULLET_SPAN: Double = js.native
  @scala.inline
  def BULLET_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BULLET_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.EASY_EDIT_SPAN")
  @js.native
  def EASY_EDIT_SPAN: Double = js.native
  @scala.inline
  def EASY_EDIT_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASY_EDIT_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.EMPTY_STRING_ARRAY")
  @js.native
  def EMPTY_STRING_ARRAY: js.Any = js.native
  @scala.inline
  def EMPTY_STRING_ARRAY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_STRING_ARRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.FIRST_SPAN")
  @js.native
  def FIRST_SPAN: Double = js.native
  @scala.inline
  def FIRST_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.FOREGROUND_COLOR_SPAN")
  @js.native
  def FOREGROUND_COLOR_SPAN: Double = js.native
  @scala.inline
  def FOREGROUND_COLOR_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREGROUND_COLOR_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.HEBR_SCRIPT_SUBTAG")
  @js.native
  def HEBR_SCRIPT_SUBTAG: js.Any = js.native
  @scala.inline
  def HEBR_SCRIPT_SUBTAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEBR_SCRIPT_SUBTAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.LAST_SPAN")
  @js.native
  def LAST_SPAN: Double = js.native
  @scala.inline
  def LAST_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAST_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.LEADING_MARGIN_SPAN")
  @js.native
  def LEADING_MARGIN_SPAN: Double = js.native
  @scala.inline
  def LEADING_MARGIN_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_MARGIN_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.LOCALE_SPAN")
  @js.native
  def LOCALE_SPAN: Double = js.native
  @scala.inline
  def LOCALE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCALE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.QUOTE_SPAN")
  @js.native
  def QUOTE_SPAN: Double = js.native
  @scala.inline
  def QUOTE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.RELATIVE_SIZE_SPAN")
  @js.native
  def RELATIVE_SIZE_SPAN: Double = js.native
  @scala.inline
  def RELATIVE_SIZE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_SIZE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.SCALE_X_SPAN")
  @js.native
  def SCALE_X_SPAN: Double = js.native
  @scala.inline
  def SCALE_X_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALE_X_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.SPELL_CHECK_SPAN")
  @js.native
  def SPELL_CHECK_SPAN: Double = js.native
  @scala.inline
  def SPELL_CHECK_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPELL_CHECK_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.STRIKETHROUGH_SPAN")
  @js.native
  def STRIKETHROUGH_SPAN: Double = js.native
  @scala.inline
  def STRIKETHROUGH_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRIKETHROUGH_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.STYLE_SPAN")
  @js.native
  def STYLE_SPAN: Double = js.native
  @scala.inline
  def STYLE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STYLE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.SUBSCRIPT_SPAN")
  @js.native
  def SUBSCRIPT_SPAN: Double = js.native
  @scala.inline
  def SUBSCRIPT_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBSCRIPT_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.SUGGESTION_RANGE_SPAN")
  @js.native
  def SUGGESTION_RANGE_SPAN: Double = js.native
  @scala.inline
  def SUGGESTION_RANGE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUGGESTION_RANGE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.SUGGESTION_SPAN")
  @js.native
  def SUGGESTION_SPAN: Double = js.native
  @scala.inline
  def SUGGESTION_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUGGESTION_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.SUPERSCRIPT_SPAN")
  @js.native
  def SUPERSCRIPT_SPAN: Double = js.native
  @scala.inline
  def SUPERSCRIPT_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPERSCRIPT_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.TEXT_APPEARANCE_SPAN")
  @js.native
  def TEXT_APPEARANCE_SPAN: Double = js.native
  @scala.inline
  def TEXT_APPEARANCE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_APPEARANCE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.TYPEFACE_SPAN")
  @js.native
  def TYPEFACE_SPAN: Double = js.native
  @scala.inline
  def TYPEFACE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPEFACE_SPAN")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.TextUtils.TruncateAt")
  @js.native
  object TruncateAt extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.text.TextUtils.TruncateAt with Double] = js.native
    
    /* 2 */ val END: typings.androiduix.android.text.TextUtils.TruncateAt.END with Double = js.native
    
    /* 4 */ val END_SMALL: typings.androiduix.android.text.TextUtils.TruncateAt.END_SMALL with Double = js.native
    
    /* 3 */ val MARQUEE: typings.androiduix.android.text.TextUtils.TruncateAt.MARQUEE with Double = js.native
    
    /* 1 */ val MIDDLE: typings.androiduix.android.text.TextUtils.TruncateAt.MIDDLE with Double = js.native
    
    /* 0 */ val START: typings.androiduix.android.text.TextUtils.TruncateAt.START with Double = js.native
  }
  
  /* static member */
  @JSGlobal("android.text.TextUtils.UNDERLINE_SPAN")
  @js.native
  def UNDERLINE_SPAN: Double = js.native
  @scala.inline
  def UNDERLINE_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNDERLINE_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.URL_SPAN")
  @js.native
  def URL_SPAN: Double = js.native
  @scala.inline
  def URL_SPAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_SPAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.ZWNBS_CHAR")
  @js.native
  def ZWNBS_CHAR: js.Any = js.native
  @scala.inline
  def ZWNBS_CHAR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZWNBS_CHAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(text: String, paint: typings.androiduix.android.text.TextPaint, avail: Double, where: TruncateAt): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    textDir: TextDirectionHeuristic
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: EllipsizeCallback
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: js.UndefOr[scala.Nothing],
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: js.UndefOr[scala.Nothing],
    textDir: TextDirectionHeuristic
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
  def ellipsize(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic
  ): String = js.native
  @JSGlobal("android.text.TextUtils.ellipsize")
  @js.native
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
  
  /* static member */
  @JSGlobal("android.text.TextUtils.getOffsetAfter")
  @js.native
  def getOffsetAfter(text: String, offset: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.getOffsetBefore")
  @js.native
  def getOffsetBefore(text: String, offset: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.isEmpty")
  @js.native
  def isEmpty(str: String): Boolean = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.packRangeInLong")
  @js.native
  def packRangeInLong(start: Double, end: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.removeEmptySpans")
  @js.native
  def removeEmptySpans[T](spans: js.Array[T], spanned: typings.androiduix.android.text.Spanned, klass: js.Any): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.setPara")
  @js.native
  def setPara(mt: js.Any, paint: js.Any, text: js.Any, start: js.Any, end: js.Any, textDir: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.unpackRangeEndFromLong")
  @js.native
  def unpackRangeEndFromLong(range: js.Array[Double]): Double = js.native
  
  /* static member */
  @JSGlobal("android.text.TextUtils.unpackRangeStartFromLong")
  @js.native
  def unpackRangeStartFromLong(range: js.Array[Double]): Double = js.native
}
