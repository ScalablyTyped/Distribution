package typings
package androiduixLib.androidNs.textNs.TextDirectionHeuristicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl")
@js.native
abstract class TextDirectionHeuristicImpl protected ()
  extends androiduixLib.androidNs.textNs.TextDirectionHeuristic {
  def this(algorithm: TextDirectionAlgorithm) = this()
  var mAlgorithm: js.Any = js.native
  /* protected */ def defaultIsRtl(): scala.Boolean = js.native
  /* private */ def doCheck(cs: js.Any, start: js.Any, count: js.Any): js.Any = js.native
  /* CompleteClass */
  override def isRtl(cs: java.lang.String, start: scala.Double, count: scala.Double): scala.Boolean = js.native
}

