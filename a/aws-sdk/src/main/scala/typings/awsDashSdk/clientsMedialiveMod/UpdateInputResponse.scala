package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputResponse extends js.Object {
  var Input: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Input] = js.native
}

object UpdateInputResponse {
  @scala.inline
  def apply(Input: Input = null): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputResponse]
  }
}

