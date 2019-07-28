package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExecutionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution to describe.
    */
  var executionArn: Arn
}

object DescribeExecutionInput {
  @scala.inline
  def apply(executionArn: Arn): DescribeExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn)
  
    __obj.asInstanceOf[DescribeExecutionInput]
  }
}

