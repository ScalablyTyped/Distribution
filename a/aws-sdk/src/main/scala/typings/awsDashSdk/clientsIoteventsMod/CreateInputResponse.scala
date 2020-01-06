package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputResponse extends js.Object {
  /**
    * Information about the configuration of the input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
}

object CreateInputResponse {
  @scala.inline
  def apply(inputConfiguration: InputConfiguration = null): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (inputConfiguration != null) __obj.updateDynamic("inputConfiguration")(inputConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputResponse]
  }
}

