package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInputRequest extends js.Object {
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  /**
    * The name of the input you want to update.
    */
  var inputName: InputName
}

object UpdateInputRequest {
  @scala.inline
  def apply(inputDefinition: InputDefinition, inputName: InputName, inputDescription: InputDescription = null): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition, inputName = inputName)
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription)
    __obj.asInstanceOf[UpdateInputRequest]
  }
}

