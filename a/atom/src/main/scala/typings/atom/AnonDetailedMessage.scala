package typings.atom

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetailedMessage extends js.Object {
  var buttons: js.UndefOr[StringDictionary[js.Function0[Unit]]] = js.undefined
  var detailedMessage: js.UndefOr[String] = js.undefined
  var message: String
}

object AnonDetailedMessage {
  @scala.inline
  def apply(
    message: String,
    buttons: StringDictionary[js.Function0[Unit]] = null,
    detailedMessage: String = null
  ): AnonDetailedMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetailedMessage]
  }
}

