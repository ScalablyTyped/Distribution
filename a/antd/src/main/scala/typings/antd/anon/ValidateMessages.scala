package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateMessages extends js.Object {
  var validateMessages: js.UndefOr[typings.rcFieldForm.interfaceMod.ValidateMessages] = js.undefined
}

object ValidateMessages {
  @scala.inline
  def apply(validateMessages: typings.rcFieldForm.interfaceMod.ValidateMessages = null): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateMessages]
  }
}

