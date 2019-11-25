package typings.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeEvent extends js.Object {
  var state: js.Any
  var `type`: String
}

object LocationChangeEvent {
  @scala.inline
  def apply(state: js.Any, `type`: String): LocationChangeEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeEvent]
  }
}

