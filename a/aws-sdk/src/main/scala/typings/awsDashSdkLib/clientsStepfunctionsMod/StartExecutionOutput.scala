package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartExecutionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn
  /**
    * The date the execution is started.
    */
  var startDate: Timestamp
}

object StartExecutionOutput {
  @scala.inline
  def apply(executionArn: Arn, startDate: Timestamp): StartExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn, startDate = startDate)
  
    __obj.asInstanceOf[StartExecutionOutput]
  }
}

