package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Information about the configuration of an input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
  /**
    * The definition of the input.
    */
  var inputDefinition: js.UndefOr[InputDefinition] = js.undefined
}

object Input {
  @scala.inline
  def apply(inputConfiguration: InputConfiguration = null, inputDefinition: InputDefinition = null): Input = {
    val __obj = js.Dynamic.literal()
    if (inputConfiguration != null) __obj.updateDynamic("inputConfiguration")(inputConfiguration)
    if (inputDefinition != null) __obj.updateDynamic("inputDefinition")(inputDefinition)
    __obj.asInstanceOf[Input]
  }
}

