package typings.atom

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonsDetailedMessage extends js.Object {
  var buttons: js.UndefOr[StringDictionary[js.Function0[Unit]]] = js.undefined
  var detailedMessage: js.UndefOr[String] = js.undefined
  var message: String
}

object Anon_ButtonsDetailedMessage {
  @scala.inline
  def apply(
    message: String,
    buttons: StringDictionary[js.Function0[Unit]] = null,
    detailedMessage: String = null
  ): Anon_ButtonsDetailedMessage = {
    val __obj = js.Dynamic.literal(message = message)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage)
    __obj.asInstanceOf[Anon_ButtonsDetailedMessage]
  }
}

