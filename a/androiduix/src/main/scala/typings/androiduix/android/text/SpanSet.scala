package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.SpanSet")
@js.native
class SpanSet[E] protected () extends js.Object {
  def this(`type`: js.Any) = this()
  var classType: js.Any = js.native
  var numberOfSpans: Double = js.native
  var spanEnds: js.Array[Double] = js.native
  var spanFlags: js.Array[Double] = js.native
  var spanStarts: js.Array[Double] = js.native
  var spans: js.Array[E] = js.native
  def getNextTransition(start: Double, limit: Double): Double = js.native
  def hasSpansIntersecting(start: Double, end: Double): Boolean = js.native
  def init(spanned: Spanned, start: Double, limit: Double): Unit = js.native
  def recycle(): Unit = js.native
}

