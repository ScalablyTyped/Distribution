package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStateMachineOutput extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: Timestamp
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name
  /**
    * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains security by granting Step Functions access to AWS resources.)
    */
  var roleArn: Arn
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn
  /**
    * The current status of the state machine.
    */
  var status: js.UndefOr[StateMachineStatus] = js.undefined
}

object DescribeStateMachineOutput {
  @scala.inline
  def apply(
    creationDate: Timestamp,
    definition: Definition,
    name: Name,
    roleArn: Arn,
    stateMachineArn: Arn,
    status: StateMachineStatus = null
  ): DescribeStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate, definition = definition, name = name, roleArn = roleArn, stateMachineArn = stateMachineArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineOutput]
  }
}

