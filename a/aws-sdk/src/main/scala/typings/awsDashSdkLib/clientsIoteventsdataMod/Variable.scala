package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  /**
    * The name of the variable.
    */
  var name: VariableName
  /**
    * The current value of the variable.
    */
  var value: VariableValue
}

object Variable {
  @scala.inline
  def apply(name: VariableName, value: VariableValue): Variable = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Variable]
  }
}

