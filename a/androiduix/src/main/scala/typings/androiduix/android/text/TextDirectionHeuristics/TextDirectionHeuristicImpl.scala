package typings.androiduix.android.text.TextDirectionHeuristics

import typings.androiduix.android.text.TextDirectionHeuristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl")
@js.native
abstract class TextDirectionHeuristicImpl protected () extends TextDirectionHeuristic {
  def this(algorithm: TextDirectionAlgorithm) = this()
  var mAlgorithm: js.Any = js.native
  /* protected */ def defaultIsRtl(): Boolean = js.native
  /* private */ def doCheck(cs: js.Any, start: js.Any, count: js.Any): js.Any = js.native
  /* CompleteClass */
  override def isRtl(cs: String, start: Double, count: Double): Boolean = js.native
}

