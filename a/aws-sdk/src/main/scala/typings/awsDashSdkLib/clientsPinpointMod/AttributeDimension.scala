package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDimension extends js.Object {
  /**
    * The type of dimension:
  INCLUSIVE - Endpoints that match the criteria are included in the segment.
  EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[AttributeType] = js.undefined
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[ListOf__string] = js.undefined
}

object AttributeDimension {
  @scala.inline
  def apply(AttributeType: AttributeType = null, Values: ListOf__string = null): AttributeDimension = {
    val __obj = js.Dynamic.literal()
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[AttributeDimension]
  }
}

