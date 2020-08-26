package typings.awsSdk.anon

import typings.awsSdk.ecrMod.ImageIdentifier
import typings.awsSdk.ecrMod.MaxResults
import typings.awsSdk.ecrMod.NextToken
import typings.awsSdk.ecrMod.RegistryId
import typings.awsSdk.ecrMod.RepositoryName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ecr.DescribeImageScanFindingsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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
  def apply(imageId: ImageIdentifier, repositoryName: RepositoryName): DescribeImageScanFindings = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageScanFindings]
  }
  @scala.inline
  implicit class DescribeImageScanFindingsOps[Self <: DescribeImageScanFindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageId(value: ImageIdentifier): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

