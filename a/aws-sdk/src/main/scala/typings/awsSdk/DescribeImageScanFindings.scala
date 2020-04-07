package typings.awsSdk

import typings.awsSdk.ecrMod.ImageIdentifier
import typings.awsSdk.ecrMod.MaxResults
import typings.awsSdk.ecrMod.NextToken
import typings.awsSdk.ecrMod.RegistryId
import typings.awsSdk.ecrMod.RepositoryName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ecr.DescribeImageScanFindingsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeImageScanFindings extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  var imageId: ImageIdentifier = js.native
  /**
    * The maximum number of image scan results returned by DescribeImageScanFindings in paginated output. When this parameter is used, DescribeImageScanFindings only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeImageScanFindings request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeImageScanFindings returns up to 100 results and a nextToken value, if applicable.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated DescribeImageScanFindings request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository in which to describe the image scan findings for. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository for the image for which to describe the scan findings.
    */
  var repositoryName: RepositoryName = js.native
}

object DescribeImageScanFindings {
  @scala.inline
  def apply(
    imageId: ImageIdentifier,
    repositoryName: RepositoryName,
    $waiter: WaiterConfiguration = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    registryId: RegistryId = null
  ): DescribeImageScanFindings = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageScanFindings]
  }
}

