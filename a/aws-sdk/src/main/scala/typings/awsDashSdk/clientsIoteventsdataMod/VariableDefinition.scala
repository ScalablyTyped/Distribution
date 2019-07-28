package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDefinition extends js.Object {
  /**
    * The name of the variable.
    */
  var name: VariableName
  /**
    * The new value of the variable.
    */
  var value: VariableValue
}

object VariableDefinition {
  @scala.inline
  def apply(name: VariableName, value: VariableValue): VariableDefinition = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[VariableDefinition]
  }
}

