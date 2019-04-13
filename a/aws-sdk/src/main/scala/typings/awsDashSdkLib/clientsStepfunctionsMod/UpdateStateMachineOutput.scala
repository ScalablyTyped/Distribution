package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStateMachineOutput extends js.Object {
  /**
    * The date and time the state machine was updated.
    */
  var updateDate: Timestamp
}

object UpdateStateMachineOutput {
  @scala.inline
  def apply(updateDate: Timestamp): UpdateStateMachineOutput = {
    val __obj = js.Dynamic.literal(updateDate = updateDate)
  
    __obj.asInstanceOf[UpdateStateMachineOutput]
  }
}

