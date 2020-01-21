package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultMessageId extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var id: String
}

object AnonDefaultMessageId {
  @scala.inline
  def apply(id: String, defaultMessage: String = null): AnonDefaultMessageId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultMessageId]
  }
}

