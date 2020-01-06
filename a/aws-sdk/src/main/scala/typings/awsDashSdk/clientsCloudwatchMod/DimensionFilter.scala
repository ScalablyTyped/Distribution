package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionFilter extends js.Object {
  /**
    * The dimension name to be matched.
    */
  var Name: DimensionName = js.native
  /**
    * The value of the dimension to be matched.
    */
  var Value: js.UndefOr[DimensionValue] = js.native
}

object DimensionFilter {
  @scala.inline
  def apply(Name: DimensionName, Value: DimensionValue = null): DimensionFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilter]
  }
}

