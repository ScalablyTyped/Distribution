package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsType extends js.Object {
  /**
    * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example, auto-scaling-group) is 1000.
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Filters] = js.undefined
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object DescribeTagsType {
  @scala.inline
  def apply(
    Filters: Filters = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: XmlString = null
  ): DescribeTagsType = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeTagsType]
  }
}

