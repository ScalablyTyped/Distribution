package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetAttributesOutput extends js.Object {
  /**
    * Collection of objects containing attribute metadata for each requested fleet ID.
    */
  var FleetAttributes: js.UndefOr[FleetAttributesList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeFleetAttributesOutput {
  @scala.inline
  def apply(FleetAttributes: FleetAttributesList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetAttributes != null) __obj.updateDynamic("FleetAttributes")(FleetAttributes)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFleetAttributesOutput]
  }
}

