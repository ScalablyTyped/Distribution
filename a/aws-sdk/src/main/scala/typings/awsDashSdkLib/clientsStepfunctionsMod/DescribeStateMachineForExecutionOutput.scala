package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStateMachineForExecutionOutput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition
  /**
    * The name of the state machine associated with the execution.
    */
  var name: Name
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution. 
    */
  var roleArn: Arn
  /**
    * The Amazon Resource Name (ARN) of the state machine associated with the execution.
    */
  var stateMachineArn: Arn
  /**
    * The date and time the state machine associated with an execution was updated. For a newly created state machine, this is the creation date.
    */
  var updateDate: Timestamp
}

object DescribeStateMachineForExecutionOutput {
  @scala.inline
  def apply(definition: Definition, name: Name, roleArn: Arn, stateMachineArn: Arn, updateDate: Timestamp): DescribeStateMachineForExecutionOutput = {
    val __obj = js.Dynamic.literal(definition = definition, name = name, roleArn = roleArn, stateMachineArn = stateMachineArn, updateDate = updateDate)
  
    __obj.asInstanceOf[DescribeStateMachineForExecutionOutput]
  }
}

