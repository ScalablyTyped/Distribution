package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCustomActionTypeOutput extends js.Object {
  /**
    * Returns information about the details of an action type.
    */
  var actionType: ActionType
}

object CreateCustomActionTypeOutput {
  @scala.inline
  def apply(actionType: ActionType): CreateCustomActionTypeOutput = {
    val __obj = js.Dynamic.literal(actionType = actionType)
  
    __obj.asInstanceOf[CreateCustomActionTypeOutput]
  }
}

