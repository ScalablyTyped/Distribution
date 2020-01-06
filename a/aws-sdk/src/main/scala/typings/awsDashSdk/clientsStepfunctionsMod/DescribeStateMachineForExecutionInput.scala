package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineForExecutionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution you want state machine information for.
    */
  var executionArn: Arn = js.native
}

object DescribeStateMachineForExecutionInput {
  @scala.inline
  def apply(executionArn: Arn): DescribeStateMachineForExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStateMachineForExecutionInput]
  }
}

