package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStaleSecurityGroupsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the stale security groups.
    */
  var StaleSecurityGroupSet: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.StaleSecurityGroupSet] = js.undefined
}

object DescribeStaleSecurityGroupsResult {
  @scala.inline
  def apply(NextToken: String = null, StaleSecurityGroupSet: StaleSecurityGroupSet = null): DescribeStaleSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StaleSecurityGroupSet != null) __obj.updateDynamic("StaleSecurityGroupSet")(StaleSecurityGroupSet)
    __obj.asInstanceOf[DescribeStaleSecurityGroupsResult]
  }
}

