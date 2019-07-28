package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeParameterGroupsResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * An array of parameter groups. Each element in the array represents one parameter group.
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
}

object DescribeParameterGroupsResponse {
  @scala.inline
  def apply(NextToken: String = null, ParameterGroups: ParameterGroupList = null): DescribeParameterGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ParameterGroups != null) __obj.updateDynamic("ParameterGroups")(ParameterGroups)
    __obj.asInstanceOf[DescribeParameterGroupsResponse]
  }
}

