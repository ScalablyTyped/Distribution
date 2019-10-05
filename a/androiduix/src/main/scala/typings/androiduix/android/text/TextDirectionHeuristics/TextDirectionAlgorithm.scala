package typings.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDirectionAlgorithm extends js.Object {
  def checkRtl(cs: String, start: Double, count: Double): Double
}

object TextDirectionAlgorithm {
  @scala.inline
  def apply(checkRtl: (String, Double, Double) => Double): TextDirectionAlgorithm = {
    val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl))
  
    __obj.asInstanceOf[TextDirectionAlgorithm]
  }
}

