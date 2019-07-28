package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStateMachineInput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: js.UndefOr[Definition] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the state machine.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the state machine.
    */
  var stateMachineArn: Arn
}

object UpdateStateMachineInput {
  @scala.inline
  def apply(stateMachineArn: Arn, definition: Definition = null, roleArn: Arn = null): UpdateStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[UpdateStateMachineInput]
  }
}

