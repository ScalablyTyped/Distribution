package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDetail extends js.Object {
  /**
    * The description of the step status.
    */
  var ExecutionStatusDetail: StepExecutionStatusDetail
  /**
    * The step configuration.
    */
  var StepConfig: typings.awsDashSdk.clientsEmrMod.StepConfig
}

object StepDetail {
  @scala.inline
  def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail, StepConfig = StepConfig)
  
    __obj.asInstanceOf[StepDetail]
  }
}

