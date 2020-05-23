package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMessageId extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var id: String
}

object DefaultMessageId {
  @scala.inline
  def apply(id: String, defaultMessage: String = null): DefaultMessageId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessageId]
  }
}

