package typings.adone.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult extends js.Object {
  /**
    * Elapsed time in milliseconds
    */
  var elapsed: Double
  /**
    * Resulting error
    */
  var err: js.Any
}

object ExecutionResult {
  @scala.inline
  def apply(elapsed: Double, err: js.Any): ExecutionResult = {
    val __obj = js.Dynamic.literal(elapsed = elapsed, err = err)
  
    __obj.asInstanceOf[ExecutionResult]
  }
}

