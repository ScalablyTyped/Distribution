package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAutoScalingInstancesType extends js.Object {
  /**
    * The IDs of the instances. You can specify up to MaxRecords IDs. If you omit this parameter, all Auto Scaling instances are described. If you specify an ID that does not exist, it is ignored with no error.
    */
  var InstanceIds: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.InstanceIds] = js.undefined
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 50.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object DescribeAutoScalingInstancesType {
  @scala.inline
  def apply(
    InstanceIds: InstanceIds = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: XmlString = null
  ): DescribeAutoScalingInstancesType = {
    val __obj = js.Dynamic.literal()
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAutoScalingInstancesType]
  }
}

