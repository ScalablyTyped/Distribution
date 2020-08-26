package typings.awsSdk.anon

import typings.awsSdk.ecrMod.ImageIdentifier
import typings.awsSdk.ecrMod.ImageIdentifierList
import typings.awsSdk.ecrMod.LifecyclePolicyPreviewFilter
import typings.awsSdk.ecrMod.LifecyclePreviewMaxResults
import typings.awsSdk.ecrMod.NextToken
import typings.awsSdk.ecrMod.RegistryId
import typings.awsSdk.ecrMod.RepositoryName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ecr.GetLifecyclePolicyPreviewRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait GetLifecyclePolicyPreview extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An optional parameter that filters results based on image tag status and all tags, if tagged.
    */
  var filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.native
  /**
    * The list of imageIDs to be included.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
  /**
    * The maximum number of repository results returned by GetLifecyclePolicyPreviewRequest in&#x2028; paginated output. When this parameter is used, GetLifecyclePolicyPreviewRequest only returns&#x2028; maxResults results in a single page along with a nextToken&#x2028; response element. The remaining results of the initial request can be seen by sending&#x2028; another GetLifecyclePolicyPreviewRequest request with the returned nextToken&#x2028; value. This value can be between 1 and 1000. If this&#x2028; parameter is not used, then GetLifecyclePolicyPreviewRequest returns up to&#x2028; 100 results and a nextToken value, if&#x2028; applicable. This option cannot be used when you specify images with imageIds.
    */
  var maxResults: js.UndefOr[LifecyclePreviewMaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated&#x2028; GetLifecyclePolicyPreviewRequest request where maxResults was used and the&#x2028; results exceeded the value of that parameter. Pagination continues from the end of the&#x2028; previous results that returned the nextToken value. This value is&#x2028; null when there are no more results to return. This option cannot be used when you specify images with imageIds.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository.
    */
  var repositoryName: RepositoryName = js.native
}

object GetLifecyclePolicyPreview {
  @scala.inline
  def apply(repositoryName: RepositoryName): GetLifecyclePolicyPreview = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyPreview]
  }
  @scala.inline
  implicit class GetLifecyclePolicyPreviewOps[Self <: GetLifecyclePolicyPreview] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setFilter(value: LifecyclePolicyPreviewFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = this.set("imageIds", js.Array(value :_*))
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = this.set("imageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageIds: Self = this.set("imageIds", js.undefined)
    @scala.inline
    def setMaxResults(value: LifecyclePreviewMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
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

