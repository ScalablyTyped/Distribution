package typings.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapacity extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
}

object AnonCapacity {
  @scala.inline
  def apply(capacity: Int | Double = null): AnonCapacity = {
    val __obj = js.Dynamic.literal()
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapacity]
  }
}

