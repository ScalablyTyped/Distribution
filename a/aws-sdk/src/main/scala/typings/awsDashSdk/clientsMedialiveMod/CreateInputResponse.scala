package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputResponse extends js.Object {
  var Input: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Input] = js.native
}

object CreateInputResponse {
  @scala.inline
  def apply(Input: Input = null): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputResponse]
  }
}

