package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  /**
    * The dimension name to be matched.
    */
  var Name: DimensionName
  /**
    * The value of the dimension to be matched.
    */
  var Value: js.UndefOr[DimensionValue] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(Name: DimensionName, Value: DimensionValue = null): DimensionFilter = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DimensionFilter]
  }
}

