package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInputResponse extends js.Object {
  var Input: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Input] = js.undefined
}

object CreateInputResponse {
  @scala.inline
  def apply(Input: Input = null): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input)
    __obj.asInstanceOf[CreateInputResponse]
  }
}

