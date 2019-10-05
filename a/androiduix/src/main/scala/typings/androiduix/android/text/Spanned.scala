package typings.androiduix.android.text

import typings.std.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spanned extends String {
  def getSpanEnd(tag: js.Any): Double = js.native
  def getSpanFlags(tag: js.Any): Double = js.native
  def getSpanStart(tag: js.Any): Double = js.native
  def getSpans[T](start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  def nextSpanTransition(start: Double, limit: Double, `type`: js.Any): Double = js.native
}

@JSGlobal("android.text.Spanned")
@js.native
object Spanned extends js.Object {
  var SPAN_COMPOSING: Double = js.native
  var SPAN_EXCLUSIVE_EXCLUSIVE: Double = js.native
  var SPAN_EXCLUSIVE_INCLUSIVE: Double = js.native
  var SPAN_INCLUSIVE_EXCLUSIVE: Double = js.native
  var SPAN_INCLUSIVE_INCLUSIVE: Double = js.native
  var SPAN_INTERMEDIATE: Double = js.native
  var SPAN_MARK_MARK: Double = js.native
  var SPAN_MARK_POINT: Double = js.native
  var SPAN_PARAGRAPH: Double = js.native
  var SPAN_POINT_MARK: Double = js.native
  var SPAN_POINT_MARK_MASK: Double = js.native
  var SPAN_POINT_POINT: Double = js.native
  var SPAN_PRIORITY: Double = js.native
  var SPAN_PRIORITY_SHIFT: Double = js.native
  var SPAN_USER: Double = js.native
  var SPAN_USER_SHIFT: Double = js.native
  def isImplements(obj: js.Any): js.Any = js.native
}

