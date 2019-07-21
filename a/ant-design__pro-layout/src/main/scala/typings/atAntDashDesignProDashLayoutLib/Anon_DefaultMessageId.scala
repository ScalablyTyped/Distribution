package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultMessageId extends js.Object {
  var defaultMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: js.Any
}

object Anon_DefaultMessageId {
  @scala.inline
  def apply(id: js.Any, defaultMessage: java.lang.String = null): Anon_DefaultMessageId = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    __obj.asInstanceOf[Anon_DefaultMessageId]
  }
}

