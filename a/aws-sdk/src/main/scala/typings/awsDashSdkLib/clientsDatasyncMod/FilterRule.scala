package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterRule extends js.Object {
  /**
    *  Specifies the type of filter rule pattern to apply. DataSync only supports the SIMPLE_PATTERN rule type.
    */
  var FilterType: js.UndefOr[FilterType] = js.undefined
  /**
    *  A pattern that defines the filter. The filter might include or exclude files is a transfer.
    */
  var Value: js.UndefOr[FilterValue] = js.undefined
}

object FilterRule {
  @scala.inline
  def apply(FilterType: FilterType = null, Value: FilterValue = null): FilterRule = {
    val __obj = js.Dynamic.literal()
    if (FilterType != null) __obj.updateDynamic("FilterType")(FilterType.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[FilterRule]
  }
}

