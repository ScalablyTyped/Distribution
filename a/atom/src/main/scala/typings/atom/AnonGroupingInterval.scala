package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupingInterval extends js.Object {
  var groupingInterval: js.UndefOr[Double] = js.undefined
}

object AnonGroupingInterval {
  @scala.inline
  def apply(groupingInterval: Int | Double = null): AnonGroupingInterval = {
    val __obj = js.Dynamic.literal()
    if (groupingInterval != null) __obj.updateDynamic("groupingInterval")(groupingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupingInterval]
  }
}

