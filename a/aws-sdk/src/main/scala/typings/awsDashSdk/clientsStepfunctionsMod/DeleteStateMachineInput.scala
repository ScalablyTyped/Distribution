package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStateMachineInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the state machine to delete.
    */
  var stateMachineArn: Arn = js.native
}

object DeleteStateMachineInput {
  @scala.inline
  def apply(stateMachineArn: Arn): DeleteStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteStateMachineInput]
  }
}

