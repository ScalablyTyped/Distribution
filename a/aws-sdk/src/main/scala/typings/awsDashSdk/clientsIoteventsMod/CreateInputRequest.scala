package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInputRequest extends js.Object {
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  /**
    * The name you want to give to the input.
    */
  var inputName: InputName
  /**
    * Metadata that can be used to manage the input.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateInputRequest {
  @scala.inline
  def apply(
    inputDefinition: InputDefinition,
    inputName: InputName,
    inputDescription: InputDescription = null,
    tags: Tags = null
  ): CreateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition, inputName = inputName)
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateInputRequest]
  }
}

