package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMessage extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var id: js.Any
}

object DefaultMessage {
  @scala.inline
  def apply(id: js.Any, defaultMessage: String = null): DefaultMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessage]
  }
}

