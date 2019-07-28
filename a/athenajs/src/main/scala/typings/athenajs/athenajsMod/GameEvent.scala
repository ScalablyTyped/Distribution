package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameEvent extends js.Object {
  var data: JSObject
  var `type`: String
}

object GameEvent {
  @scala.inline
  def apply(data: JSObject, `type`: String): GameEvent = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GameEvent]
  }
}

