package typings.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capacity extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
}

object Anon_Capacity {
  @scala.inline
  def apply(capacity: Int | Double = null): Anon_Capacity = {
    val __obj = js.Dynamic.literal()
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Capacity]
  }
}

