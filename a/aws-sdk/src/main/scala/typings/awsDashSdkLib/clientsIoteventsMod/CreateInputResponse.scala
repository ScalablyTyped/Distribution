package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInputResponse extends js.Object {
  /**
    * Information about the configuration of the input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
}

object CreateInputResponse {
  @scala.inline
  def apply(inputConfiguration: InputConfiguration = null): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (inputConfiguration != null) __obj.updateDynamic("inputConfiguration")(inputConfiguration)
    __obj.asInstanceOf[CreateInputResponse]
  }
}

