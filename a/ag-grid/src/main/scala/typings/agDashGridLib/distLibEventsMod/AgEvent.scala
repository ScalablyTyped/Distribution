package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgEvent extends js.Object {
  var `type`: java.lang.String
}

object AgEvent {
  @scala.inline
  def apply(`type`: java.lang.String): AgEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AgEvent]
  }
}

