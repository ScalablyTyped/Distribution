package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult extends js.Object {
  /**
    * Elapsed time in milliseconds
    */
  var elapsed: scala.Double
  /**
    * Resulting error
    */
  var err: js.Any
}

object ExecutionResult {
  @scala.inline
  def apply(elapsed: scala.Double, err: js.Any): ExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elapsed")(elapsed)
    __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[ExecutionResult]
  }
}

