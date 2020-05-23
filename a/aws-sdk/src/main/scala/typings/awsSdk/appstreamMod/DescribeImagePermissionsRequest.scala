package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagePermissionsRequest extends js.Object {
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appstreamMod.MaxResults] = js.native
  /**
    * The name of the private image for which to describe permissions. The image must be one that you own. 
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The 12-digit identifier of one or more AWS accounts with which the image is shared.
    */
  var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.native
}

object DescribeImagePermissionsRequest {
  @scala.inline
  def apply(
    Name: Name,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null,
    SharedAwsAccountIds: AwsAccountIdList = null
  ): DescribeImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SharedAwsAccountIds != null) __obj.updateDynamic("SharedAwsAccountIds")(SharedAwsAccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagePermissionsRequest]
  }
}

