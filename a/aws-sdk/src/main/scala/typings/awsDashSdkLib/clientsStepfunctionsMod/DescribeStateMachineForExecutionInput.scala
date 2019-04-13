package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStateMachineForExecutionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution you want state machine information for.
    */
  var executionArn: Arn
}

object DescribeStateMachineForExecutionInput {
  @scala.inline
  def apply(executionArn: Arn): DescribeStateMachineForExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn)
  
    __obj.asInstanceOf[DescribeStateMachineForExecutionInput]
  }
}

