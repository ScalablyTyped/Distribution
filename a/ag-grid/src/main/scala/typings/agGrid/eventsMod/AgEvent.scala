package typings.agGrid.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgEvent extends js.Object {
  var `type`: String
}

object AgEvent {
  @scala.inline
  def apply(`type`: String): AgEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgEvent]
  }
}

