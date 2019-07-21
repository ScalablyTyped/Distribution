package typings
package atAntDashDesignProDashLayoutLib.esTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaultMessage: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.Any
}

object MessageDescriptor {
  @scala.inline
  def apply(id: js.Any, defaultMessage: java.lang.String = null, description: java.lang.String = null): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[MessageDescriptor]
  }
}

