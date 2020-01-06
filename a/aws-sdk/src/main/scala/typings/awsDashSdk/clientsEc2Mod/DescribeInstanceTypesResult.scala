package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceTypesResult extends js.Object {
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeInfoList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.native
}

object DescribeInstanceTypesResult {
  @scala.inline
  def apply(InstanceTypes: InstanceTypeInfoList = null, NextToken: NextToken = null): DescribeInstanceTypesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceTypes != null) __obj.updateDynamic("InstanceTypes")(InstanceTypes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceTypesResult]
  }
}

