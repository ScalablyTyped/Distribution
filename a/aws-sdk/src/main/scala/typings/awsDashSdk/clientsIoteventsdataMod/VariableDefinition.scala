package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDefinition extends js.Object {
  /**
    * The name of the variable.
    */
  var name: VariableName = js.native
  /**
    * The new value of the variable.
    */
  var value: VariableValue = js.native
}

object VariableDefinition {
  @scala.inline
  def apply(name: VariableName, value: VariableValue): VariableDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableDefinition]
  }
}

