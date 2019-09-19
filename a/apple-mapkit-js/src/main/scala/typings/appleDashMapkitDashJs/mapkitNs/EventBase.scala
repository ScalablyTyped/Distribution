package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBase[T] extends js.Object {
  var target: T
  var `type`: String
}

object EventBase {
  @scala.inline
  def apply[T](target: T, `type`: String): EventBase[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventBase[T]]
  }
}

