package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the result of a goal seek operation. */
trait GoalResult extends js.Object {
  /** the amount by which the result changed in the last iteration. */
  var Divergence: scala.Double
  /** the resulting value. */
  var Result: scala.Double
}

object GoalResult {
  @scala.inline
  def apply(Divergence: scala.Double, Result: scala.Double): GoalResult = {
    val __obj = js.Dynamic.literal(Divergence = Divergence, Result = Result)
  
    __obj.asInstanceOf[GoalResult]
  }
}

