package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buttons extends js.Object {
  var buttons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var detailedMessage: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
}

object Anon_Buttons {
  @scala.inline
  def apply(
    message: java.lang.String,
    buttons: js.Array[java.lang.String] = null,
    detailedMessage: java.lang.String = null
  ): Anon_Buttons = {
    val __obj = js.Dynamic.literal(message = message)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage)
    __obj.asInstanceOf[Anon_Buttons]
  }
}

