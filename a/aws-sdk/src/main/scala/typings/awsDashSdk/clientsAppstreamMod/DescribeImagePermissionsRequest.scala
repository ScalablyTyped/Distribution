package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImagePermissionsRequest extends js.Object {
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.MaxResults] = js.undefined
  /**
    * The name of the private image for which to describe permissions. The image must be one that you own. 
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The 12-digit identifier of one or more AWS accounts with which the image is shared.
    */
  var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.undefined
}

object DescribeImagePermissionsRequest {
  @scala.inline
  def apply(
    Name: Name,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    SharedAwsAccountIds: AwsAccountIdList = null
  ): DescribeImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SharedAwsAccountIds != null) __obj.updateDynamic("SharedAwsAccountIds")(SharedAwsAccountIds)
    __obj.asInstanceOf[DescribeImagePermissionsRequest]
  }
}

