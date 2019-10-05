package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDirectionHeuristic extends js.Object {
  def isRtl(cs: String, start: Double, count: Double): Boolean
}

object TextDirectionHeuristic {
  @scala.inline
  def apply(isRtl: (String, Double, Double) => Boolean): TextDirectionHeuristic = {
    val __obj = js.Dynamic.literal(isRtl = js.Any.fromFunction3(isRtl))
  
    __obj.asInstanceOf[TextDirectionHeuristic]
  }
}

