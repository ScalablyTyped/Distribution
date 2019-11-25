package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultMessage extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var id: String
}

object Anon_DefaultMessage {
  @scala.inline
  def apply(id: String, defaultMessage: String = null): Anon_DefaultMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultMessage]
  }
}

