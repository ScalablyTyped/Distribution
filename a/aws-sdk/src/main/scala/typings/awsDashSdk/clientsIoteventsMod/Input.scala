package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  /**
    * Information about the configuration of an input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
  /**
    * The definition of the input.
    */
  var inputDefinition: js.UndefOr[InputDefinition] = js.native
}

object Input {
  @scala.inline
  def apply(inputConfiguration: InputConfiguration = null, inputDefinition: InputDefinition = null): Input = {
    val __obj = js.Dynamic.literal()
    if (inputConfiguration != null) __obj.updateDynamic("inputConfiguration")(inputConfiguration.asInstanceOf[js.Any])
    if (inputDefinition != null) __obj.updateDynamic("inputDefinition")(inputDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

