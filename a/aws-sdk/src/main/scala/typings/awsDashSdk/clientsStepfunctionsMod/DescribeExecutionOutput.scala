package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExecutionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn
  /**
    * The string that contains the JSON input data of the execution.
    */
  var input: SensitiveData
  /**
    * The name of the execution. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The JSON output data of the execution.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The date the execution is started.
    */
  var startDate: Timestamp
  /**
    * The Amazon Resource Name (ARN) of the executed stated machine.
    */
  var stateMachineArn: Arn
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus
  /**
    * If the execution has already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[Timestamp] = js.undefined
}

object DescribeExecutionOutput {
  @scala.inline
  def apply(
    executionArn: Arn,
    input: SensitiveData,
    startDate: Timestamp,
    stateMachineArn: Arn,
    status: ExecutionStatus,
    name: Name = null,
    output: SensitiveData = null,
    stopDate: Timestamp = null
  ): DescribeExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn, input = input, startDate = startDate, stateMachineArn = stateMachineArn, status = status.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (output != null) __obj.updateDynamic("output")(output)
    if (stopDate != null) __obj.updateDynamic("stopDate")(stopDate)
    __obj.asInstanceOf[DescribeExecutionOutput]
  }
}

