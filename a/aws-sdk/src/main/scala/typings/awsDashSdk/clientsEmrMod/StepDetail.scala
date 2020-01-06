package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepDetail extends js.Object {
  /**
    * The description of the step status.
    */
  var ExecutionStatusDetail: StepExecutionStatusDetail = js.native
  /**
    * The step configuration.
    */
  var StepConfig: typings.awsDashSdk.clientsEmrMod.StepConfig = js.native
}

object StepDetail {
  @scala.inline
  def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], StepConfig = StepConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StepDetail]
  }
}

