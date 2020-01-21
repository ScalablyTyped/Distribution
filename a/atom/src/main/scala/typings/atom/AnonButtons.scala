package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtons extends js.Object {
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  var detailedMessage: js.UndefOr[String] = js.undefined
  var message: String
}

object AnonButtons {
  @scala.inline
  def apply(message: String, buttons: js.Array[String] = null, detailedMessage: String = null): AnonButtons = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtons]
  }
}

