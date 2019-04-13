package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The name for this filter.
    */
  var Name: js.UndefOr[FilterName] = js.undefined
  /**
    * The values of the filter. These are all the values for any of the applied filters.
    */
  var Values: js.UndefOr[FilterValues] = js.undefined
}

object Filter {
  @scala.inline
  def apply(Name: FilterName = null, Values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Filter]
  }
}

