package typings
package androiduixLib.androidNs.textNs.TextDirectionHeuristicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextDirectionHeuristics.AnyStrong")
@js.native
class AnyStrong protected () extends TextDirectionAlgorithm {
  def this(lookForRtl: scala.Boolean) = this()
  var mLookForRtl: js.Any = js.native
  /* CompleteClass */
  override def checkRtl(cs: java.lang.String, start: scala.Double, count: scala.Double): scala.Double = js.native
}

@JSGlobal("android.text.TextDirectionHeuristics.AnyStrong")
@js.native
object AnyStrong extends js.Object {
  var INSTANCE_LTR: androiduixLib.androidNs.textNs.TextDirectionHeuristicsNs.AnyStrong = js.native
  var INSTANCE_RTL: androiduixLib.androidNs.textNs.TextDirectionHeuristicsNs.AnyStrong = js.native
}

