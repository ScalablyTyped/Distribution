package typings
package androiduixLib.androidNs.textNs.TextDirectionHeuristicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDirectionAlgorithm extends js.Object {
  def checkRtl(cs: java.lang.String, start: scala.Double, count: scala.Double): scala.Double
}

object TextDirectionAlgorithm {
  @scala.inline
  def apply(checkRtl: (java.lang.String, scala.Double, scala.Double) => scala.Double): TextDirectionAlgorithm = {
    val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl))
  
    __obj.asInstanceOf[TextDirectionAlgorithm]
  }
}

