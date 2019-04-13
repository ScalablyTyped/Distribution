package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubnetGroupsResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * An array of subnet groups. Each element in the array represents a single subnet group.
    */
  var SubnetGroups: js.UndefOr[SubnetGroupList] = js.undefined
}

object DescribeSubnetGroupsResponse {
  @scala.inline
  def apply(NextToken: String = null, SubnetGroups: SubnetGroupList = null): DescribeSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SubnetGroups != null) __obj.updateDynamic("SubnetGroups")(SubnetGroups)
    __obj.asInstanceOf[DescribeSubnetGroupsResponse]
  }
}

