package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDimension extends js.Object {
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[DimensionType] = js.undefined
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the DimensionType property, endpoints are included or excluded from the segment if their values match the criteria values.
    */
  var Values: ListOf__string
}

object SetDimension {
  @scala.inline
  def apply(Values: ListOf__string, DimensionType: DimensionType = null): SetDimension = {
    val __obj = js.Dynamic.literal(Values = Values)
    if (DimensionType != null) __obj.updateDynamic("DimensionType")(DimensionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDimension]
  }
}

