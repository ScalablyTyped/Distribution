package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceStatusResult extends js.Object {
  /**
    * One or more instance status descriptions.
    */
  var InstanceStatuses: js.UndefOr[InstanceStatusList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeInstanceStatusResult {
  @scala.inline
  def apply(InstanceStatuses: InstanceStatusList = null, NextToken: String = null): DescribeInstanceStatusResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceStatuses != null) __obj.updateDynamic("InstanceStatuses")(InstanceStatuses)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstanceStatusResult]
  }
}

