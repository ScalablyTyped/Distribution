package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListImagesRequest extends js.Object {
  /**
    * The filter key and value with which to filter your ListImages results.
    */
  var filter: js.UndefOr[ListImagesFilter] = js.undefined
  /**
    * The maximum number of image results returned by ListImages in paginated output. When this parameter is used, ListImages only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListImages request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then ListImages returns up to 100 results and a nextToken value, if applicable.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The nextToken value returned from a previous paginated ListImages request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The AWS account ID associated with the registry that contains the repository in which to list images. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository with image IDs to be listed.
    */
  var repositoryName: RepositoryName
}

object ListImagesRequest {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    filter: ListImagesFilter = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    registryId: RegistryId = null
  ): ListImagesRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[ListImagesRequest]
  }
}

