package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartExecutionInput extends js.Object {
  /**
    * The string that contains the JSON input data for the execution, for example:  "input": "{\"first_name\" : \"test\"}"   If you don't include any JSON input data, you still must include the two braces, for example: "input": "{}"  
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The name of the execution. This name must be unique for your AWS account, region, and state machine for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the state machine to execute.
    */
  var stateMachineArn: Arn
}

object StartExecutionInput {
  @scala.inline
  def apply(stateMachineArn: Arn, input: SensitiveData = null, name: Name = null): StartExecutionInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn)
    if (input != null) __obj.updateDynamic("input")(input)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StartExecutionInput]
  }
}

