package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePolicyPreviewResponse extends js.Object {
  /**
    * The JSON lifecycle policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
  /**
    * The nextToken value to include in a future GetLifecyclePolicyPreview request. When the results of a GetLifecyclePolicyPreview request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The results of the lifecycle policy preview request.
    */
  var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  /**
    * The status of the lifecycle policy preview request.
    */
  var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
  /**
    * The list of images that is returned as a result of the action.
    */
  var summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined
}

object GetLifecyclePolicyPreviewResponse {
  @scala.inline
  def apply(
    lifecyclePolicyText: LifecyclePolicyText = null,
    nextToken: NextToken = null,
    previewResults: LifecyclePolicyPreviewResultList = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null,
    status: LifecyclePolicyPreviewStatus = null,
    summary: LifecyclePolicyPreviewSummary = null
  ): GetLifecyclePolicyPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (lifecyclePolicyText != null) __obj.updateDynamic("lifecyclePolicyText")(lifecyclePolicyText)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (previewResults != null) __obj.updateDynamic("previewResults")(previewResults)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[GetLifecyclePolicyPreviewResponse]
  }
}

