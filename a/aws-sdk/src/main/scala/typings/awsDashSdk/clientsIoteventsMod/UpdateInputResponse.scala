package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInputResponse extends js.Object {
  /**
    * Information about the configuration of the input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
}

object UpdateInputResponse {
  @scala.inline
  def apply(inputConfiguration: InputConfiguration = null): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (inputConfiguration != null) __obj.updateDynamic("inputConfiguration")(inputConfiguration)
    __obj.asInstanceOf[UpdateInputResponse]
  }
}

