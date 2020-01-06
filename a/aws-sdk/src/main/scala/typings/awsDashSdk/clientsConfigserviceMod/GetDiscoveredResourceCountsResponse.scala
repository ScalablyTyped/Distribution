package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredResourceCountsResponse extends js.Object {
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of ResourceCount objects. Each object is listed in descending order by the number of resources.
    */
  var resourceCounts: js.UndefOr[ResourceCounts] = js.native
  /**
    * The total number of resources that AWS Config is recording in the region for your account. If you specify resource types in the request, AWS Config returns only the total number of resources for those resource types.  Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets, for a total of 60 resources.   You make a call to the GetDiscoveredResourceCounts action and specify the resource type, "AWS::EC2::Instances", in the request.   AWS Config returns 25 for totalDiscoveredResources.  
    */
  var totalDiscoveredResources: js.UndefOr[Long] = js.native
}

object GetDiscoveredResourceCountsResponse {
  @scala.inline
  def apply(
    nextToken: NextToken = null,
    resourceCounts: ResourceCounts = null,
    totalDiscoveredResources: Int | Double = null
  ): GetDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceCounts != null) __obj.updateDynamic("resourceCounts")(resourceCounts.asInstanceOf[js.Any])
    if (totalDiscoveredResources != null) __obj.updateDynamic("totalDiscoveredResources")(totalDiscoveredResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiscoveredResourceCountsResponse]
  }
}

