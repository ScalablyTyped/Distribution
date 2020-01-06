package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputRequest extends js.Object {
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition = js.native
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  /**
    * The name you want to give to the input.
    */
  var inputName: InputName = js.native
  /**
    * Metadata that can be used to manage the input.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateInputRequest {
  @scala.inline
  def apply(
    inputDefinition: InputDefinition,
    inputName: InputName,
    inputDescription: InputDescription = null,
    tags: Tags = null
  ): CreateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any])
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputRequest]
  }
}

