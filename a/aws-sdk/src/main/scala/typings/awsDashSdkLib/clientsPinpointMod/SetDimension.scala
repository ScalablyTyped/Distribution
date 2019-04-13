package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDimension extends js.Object {
  /**
    * The type of dimension:
  INCLUSIVE - Endpoints that match the criteria are included in the segment.
  EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[DimensionType] = js.undefined
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[ListOf__string] = js.undefined
}

object SetDimension {
  @scala.inline
  def apply(DimensionType: DimensionType = null, Values: ListOf__string = null): SetDimension = {
    val __obj = js.Dynamic.literal()
    if (DimensionType != null) __obj.updateDynamic("DimensionType")(DimensionType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[SetDimension]
  }
}

