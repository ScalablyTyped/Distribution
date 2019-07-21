package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultMessage extends js.Object {
  var defaultMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
}

object Anon_DefaultMessage {
  @scala.inline
  def apply(id: java.lang.String, defaultMessage: java.lang.String = null): Anon_DefaultMessage = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    __obj.asInstanceOf[Anon_DefaultMessage]
  }
}

