package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonsDetailedMessage extends js.Object {
  var buttons: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function0[scala.Unit]]] = js.undefined
  var detailedMessage: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
}

object Anon_ButtonsDetailedMessage {
  @scala.inline
  def apply(
    message: java.lang.String,
    buttons: org.scalablytyped.runtime.StringDictionary[js.Function0[scala.Unit]] = null,
    detailedMessage: java.lang.String = null
  ): Anon_ButtonsDetailedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage)
    __obj.asInstanceOf[Anon_ButtonsDetailedMessage]
  }
}

