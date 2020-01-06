package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag. Specify tags by using a key-value mapping.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.native
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the InstanceInformationFilter action. The InstanceInformationFilter action enables you to return instance information by using tags that are specified as a key-value mapping.  If you do use this method, then you can't use the InstanceInformationFilter action. Using this method and the InstanceInformationFilter action causes an exception error. 
    */
  var InstanceInformationFilterList: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceInformationFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeInstanceInformationRequest {
  @scala.inline
  def apply(
    Filters: InstanceInformationStringFilterList = null,
    InstanceInformationFilterList: InstanceInformationFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstanceInformationFilterList != null) __obj.updateDynamic("InstanceInformationFilterList")(InstanceInformationFilterList.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
}

