package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.SpanSet")
@js.native
class SpanSet[E] protected () extends js.Object {
  def this(`type`: js.Any) = this()
  var classType: js.Any = js.native
  var numberOfSpans: scala.Double = js.native
  var spanEnds: js.Array[scala.Double] = js.native
  var spanFlags: js.Array[scala.Double] = js.native
  var spanStarts: js.Array[scala.Double] = js.native
  var spans: js.Array[E] = js.native
  def getNextTransition(start: scala.Double, limit: scala.Double): scala.Double = js.native
  def hasSpansIntersecting(start: scala.Double, end: scala.Double): scala.Boolean = js.native
  def init(spanned: Spanned, start: scala.Double, limit: scala.Double): scala.Unit = js.native
  def recycle(): scala.Unit = js.native
}

