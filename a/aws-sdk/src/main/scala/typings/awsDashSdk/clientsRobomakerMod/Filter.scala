package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * A list of values.
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}

object Filter {
  @scala.inline
  def apply(name: Name = null, values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Filter]
  }
}

