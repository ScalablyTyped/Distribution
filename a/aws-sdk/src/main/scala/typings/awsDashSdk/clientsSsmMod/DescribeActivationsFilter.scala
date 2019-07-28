package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivationsFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.undefined
  /**
    * The filter values.
    */
  var FilterValues: js.UndefOr[StringList] = js.undefined
}

object DescribeActivationsFilter {
  @scala.inline
  def apply(FilterKey: DescribeActivationsFilterKeys = null, FilterValues: StringList = null): DescribeActivationsFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterKey != null) __obj.updateDynamic("FilterKey")(FilterKey.asInstanceOf[js.Any])
    if (FilterValues != null) __obj.updateDynamic("FilterValues")(FilterValues)
    __obj.asInstanceOf[DescribeActivationsFilter]
  }
}

