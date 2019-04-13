package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInputResponse extends js.Object {
  var Input: js.UndefOr[Input] = js.undefined
}

object UpdateInputResponse {
  @scala.inline
  def apply(Input: Input = null): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input)
    __obj.asInstanceOf[UpdateInputResponse]
  }
}

