package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStateMachineOutput extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: Timestamp
  /**
    * The Amazon Resource Name (ARN) that identifies the created state machine.
    */
  var stateMachineArn: Arn
}

object CreateStateMachineOutput {
  @scala.inline
  def apply(creationDate: Timestamp, stateMachineArn: Arn): CreateStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate, stateMachineArn = stateMachineArn)
  
    __obj.asInstanceOf[CreateStateMachineOutput]
  }
}

