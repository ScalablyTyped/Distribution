package typings.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextDirectionHeuristics.AnyStrong")
@js.native
class AnyStrong protected () extends TextDirectionAlgorithm {
  def this(lookForRtl: Boolean) = this()
  var mLookForRtl: js.Any = js.native
  /* CompleteClass */
  override def checkRtl(cs: String, start: Double, count: Double): Double = js.native
}

/* static members */
@JSGlobal("android.text.TextDirectionHeuristics.AnyStrong")
@js.native
object AnyStrong extends js.Object {
  var INSTANCE_LTR: AnyStrong = js.native
  var INSTANCE_RTL: AnyStrong = js.native
}

