package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupingInterval extends js.Object {
  var groupingInterval: js.UndefOr[scala.Double] = js.undefined
}

object Anon_GroupingInterval {
  @scala.inline
  def apply(groupingInterval: scala.Int | scala.Double = null): Anon_GroupingInterval = {
    val __obj = js.Dynamic.literal()
    if (groupingInterval != null) __obj.updateDynamic("groupingInterval")(groupingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupingInterval]
  }
}

