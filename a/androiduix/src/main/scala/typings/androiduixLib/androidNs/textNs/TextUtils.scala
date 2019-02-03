package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextUtils")
@js.native
class TextUtils () extends js.Object

/* static members */
@JSGlobal("android.text.TextUtils")
@js.native
object TextUtils extends js.Object {
  var ABSOLUTE_SIZE_SPAN: scala.Double = js.native
  var ALIGNMENT_SPAN: scala.Double = js.native
  var ANNOTATION: scala.Double = js.native
  var ARAB_SCRIPT_SUBTAG: js.Any = js.native
  var BACKGROUND_COLOR_SPAN: scala.Double = js.native
  var BULLET_SPAN: scala.Double = js.native
  var EASY_EDIT_SPAN: scala.Double = js.native
  var EMPTY_STRING_ARRAY: js.Any = js.native
  var FIRST_SPAN: scala.Double = js.native
  var FOREGROUND_COLOR_SPAN: scala.Double = js.native
  var HEBR_SCRIPT_SUBTAG: js.Any = js.native
  var LAST_SPAN: scala.Double = js.native
  var LEADING_MARGIN_SPAN: scala.Double = js.native
  var LOCALE_SPAN: scala.Double = js.native
  var QUOTE_SPAN: scala.Double = js.native
  var RELATIVE_SIZE_SPAN: scala.Double = js.native
  var SCALE_X_SPAN: scala.Double = js.native
  var SPELL_CHECK_SPAN: scala.Double = js.native
  var STRIKETHROUGH_SPAN: scala.Double = js.native
  var STYLE_SPAN: scala.Double = js.native
  var SUBSCRIPT_SPAN: scala.Double = js.native
  var SUGGESTION_RANGE_SPAN: scala.Double = js.native
  var SUGGESTION_SPAN: scala.Double = js.native
  var SUPERSCRIPT_SPAN: scala.Double = js.native
  var TEXT_APPEARANCE_SPAN: scala.Double = js.native
  var TYPEFACE_SPAN: scala.Double = js.native
  var UNDERLINE_SPAN: scala.Double = js.native
  var URL_SPAN: scala.Double = js.native
  var ZWNBS_CHAR: js.Any = js.native
  def ellipsize(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    avail: scala.Double,
    where: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  ): java.lang.String = js.native
  def ellipsize(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    avail: scala.Double,
    where: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt,
    preserveLength: scala.Boolean
  ): java.lang.String = js.native
  def ellipsize(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    avail: scala.Double,
    where: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt,
    preserveLength: scala.Boolean,
    callback: androiduixLib.androidNs.textNs.TextUtilsNs.EllipsizeCallback
  ): java.lang.String = js.native
  def ellipsize(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    avail: scala.Double,
    where: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt,
    preserveLength: scala.Boolean,
    callback: androiduixLib.androidNs.textNs.TextUtilsNs.EllipsizeCallback,
    textDir: androiduixLib.androidNs.textNs.TextDirectionHeuristic
  ): java.lang.String = js.native
  def ellipsize(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    avail: scala.Double,
    where: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt,
    preserveLength: scala.Boolean,
    callback: androiduixLib.androidNs.textNs.TextUtilsNs.EllipsizeCallback,
    textDir: androiduixLib.androidNs.textNs.TextDirectionHeuristic,
    ellipsis: js.Any
  ): java.lang.String = js.native
  def getOffsetAfter(text: java.lang.String, offset: scala.Double): scala.Double = js.native
  def getOffsetBefore(text: java.lang.String, offset: scala.Double): scala.Double = js.native
  def isEmpty(str: java.lang.String): scala.Boolean = js.native
  def packRangeInLong(start: scala.Double, end: scala.Double): js.Array[scala.Double] = js.native
  def removeEmptySpans[T](spans: js.Array[T], spanned: androiduixLib.androidNs.textNs.Spanned, klass: js.Any): js.Array[T] = js.native
  /* private */ def setPara(mt: js.Any, paint: js.Any, text: js.Any, start: js.Any, end: js.Any, textDir: js.Any): js.Any = js.native
  def unpackRangeEndFromLong(range: js.Array[scala.Double]): scala.Double = js.native
  def unpackRangeStartFromLong(range: js.Array[scala.Double]): scala.Double = js.native
}

