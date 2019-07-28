package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepFunctionsAction extends js.Object {
  /**
    * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step Functions automatically creates a unique name for each state machine execution if one is not provided.
    */
  var executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.undefined
  /**
    * The ARN of the role that grants IoT permission to start execution of a state machine ("Action":"states:StartExecution").
    */
  var roleArn: AwsArn
  /**
    * The name of the Step Functions state machine whose execution will be started.
    */
  var stateMachineName: StateMachineName
}

object StepFunctionsAction {
  @scala.inline
  def apply(
    roleArn: AwsArn,
    stateMachineName: StateMachineName,
    executionNamePrefix: ExecutionNamePrefix = null
  ): StepFunctionsAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, stateMachineName = stateMachineName)
    if (executionNamePrefix != null) __obj.updateDynamic("executionNamePrefix")(executionNamePrefix)
    __obj.asInstanceOf[StepFunctionsAction]
  }
}

