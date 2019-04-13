package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceInformationRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag. Specify tags by using a key-value mapping.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the InstanceInformationFilter action. The InstanceInformationFilter action enables you to return instance information by using tags that are specified as a key-value mapping.  If you do use this method, then you can't use the InstanceInformationFilter action. Using this method and the InstanceInformationFilter action causes an exception error. 
    */
  var InstanceInformationFilterList: js.UndefOr[InstanceInformationFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInstanceInformationRequest {
  @scala.inline
  def apply(
    Filters: InstanceInformationStringFilterList = null,
    InstanceInformationFilterList: InstanceInformationFilterList = null,
    MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (InstanceInformationFilterList != null) __obj.updateDynamic("InstanceInformationFilterList")(InstanceInformationFilterList)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
}

