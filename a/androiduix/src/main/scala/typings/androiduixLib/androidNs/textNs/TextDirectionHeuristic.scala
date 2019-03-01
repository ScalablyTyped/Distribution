package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDirectionHeuristic extends js.Object {
  def isRtl(cs: java.lang.String, start: scala.Double, count: scala.Double): scala.Boolean
}

object TextDirectionHeuristic {
  @scala.inline
  def apply(isRtl: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Boolean]): TextDirectionHeuristic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRtl")(isRtl)
    __obj.asInstanceOf[TextDirectionHeuristic]
  }
}

