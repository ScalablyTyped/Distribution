package typings.androiduix.android.text.TextUtils

import typings.androiduix.android.text.Spanned
import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextUtils")
@js.native
object ^ extends js.Object {
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
  def ellipsize(text: String, paint: TextPaint, avail: Double, where: TruncateAt): String = js.native
  def ellipsize(text: String, paint: TextPaint, avail: Double, where: TruncateAt, preserveLength: Boolean): String = js.native
  def ellipsize(
    text: String,
    paint: TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback
  ): String = js.native
  def ellipsize(
    text: String,
    paint: TextPaint,
    avail: Double,
    where: TruncateAt,
    preserveLength: Boolean,
    callback: EllipsizeCallback,
    textDir: TextDirectionHeuristic
  ): String = js.native
  def ellipsize(
    text: String,
    paint: TextPaint,
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
  def removeEmptySpans[T](spans: js.Array[T], spanned: Spanned, klass: js.Any): js.Array[T] = js.native
  /* private */ def setPara(mt: js.Any, paint: js.Any, text: js.Any, start: js.Any, end: js.Any, textDir: js.Any): js.Any = js.native
  def unpackRangeEndFromLong(range: js.Array[Double]): Double = js.native
  def unpackRangeStartFromLong(range: js.Array[Double]): Double = js.native
}

