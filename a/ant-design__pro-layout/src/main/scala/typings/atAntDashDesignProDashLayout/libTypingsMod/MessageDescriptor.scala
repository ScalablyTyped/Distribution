package typings.atAntDashDesignProDashLayout.libTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.Any
}

object MessageDescriptor {
  @scala.inline
  def apply(id: js.Any, defaultMessage: String = null, description: String = null): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
}

