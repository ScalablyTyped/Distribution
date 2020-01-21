package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultMessage extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var id: js.Any
}

object AnonDefaultMessage {
  @scala.inline
  def apply(id: js.Any, defaultMessage: String = null): AnonDefaultMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultMessage]
  }
}

