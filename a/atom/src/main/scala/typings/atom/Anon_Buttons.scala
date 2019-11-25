package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buttons extends js.Object {
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  var detailedMessage: js.UndefOr[String] = js.undefined
  var message: String
}

object Anon_Buttons {
  @scala.inline
  def apply(message: String, buttons: js.Array[String] = null, detailedMessage: String = null): Anon_Buttons = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buttons]
  }
}

