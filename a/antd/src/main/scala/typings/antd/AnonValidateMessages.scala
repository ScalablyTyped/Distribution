package typings.antd

import typings.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidateMessages extends js.Object {
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
}

object AnonValidateMessages {
  @scala.inline
  def apply(validateMessages: ValidateMessages = null): AnonValidateMessages = {
    val __obj = js.Dynamic.literal()
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidateMessages]
  }
}

