package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetVariableAction extends js.Object {
  /**
    * The new value of the variable.
    */
  var value: VariableValue
  /**
    * The name of the variable.
    */
  var variableName: VariableName
}

object SetVariableAction {
  @scala.inline
  def apply(value: VariableValue, variableName: VariableName): SetVariableAction = {
    val __obj = js.Dynamic.literal(value = value, variableName = variableName)
  
    __obj.asInstanceOf[SetVariableAction]
  }
}

