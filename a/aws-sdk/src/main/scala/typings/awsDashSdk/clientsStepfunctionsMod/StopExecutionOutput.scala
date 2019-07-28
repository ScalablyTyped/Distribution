package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopExecutionOutput extends js.Object {
  /**
    * The date the execution is stopped.
    */
  var stopDate: Timestamp
}

object StopExecutionOutput {
  @scala.inline
  def apply(stopDate: Timestamp): StopExecutionOutput = {
    val __obj = js.Dynamic.literal(stopDate = stopDate)
  
    __obj.asInstanceOf[StopExecutionOutput]
  }
}

