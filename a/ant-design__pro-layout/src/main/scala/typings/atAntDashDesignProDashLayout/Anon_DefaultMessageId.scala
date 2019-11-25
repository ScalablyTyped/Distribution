package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultMessageId extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var id: js.Any
}

object Anon_DefaultMessageId {
  @scala.inline
  def apply(id: js.Any, defaultMessage: String = null): Anon_DefaultMessageId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultMessageId]
  }
}

