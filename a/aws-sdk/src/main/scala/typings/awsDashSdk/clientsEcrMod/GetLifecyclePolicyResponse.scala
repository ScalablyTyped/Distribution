package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePolicyResponse extends js.Object {
  /**
    * The time stamp of the last time that the lifecycle policy was run.
    */
  var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined
  /**
    * The JSON lifecycle policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object GetLifecyclePolicyResponse {
  @scala.inline
  def apply(
    lastEvaluatedAt: EvaluationTimestamp = null,
    lifecyclePolicyText: LifecyclePolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): GetLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (lastEvaluatedAt != null) __obj.updateDynamic("lastEvaluatedAt")(lastEvaluatedAt)
    if (lifecyclePolicyText != null) __obj.updateDynamic("lifecyclePolicyText")(lifecyclePolicyText)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[GetLifecyclePolicyResponse]
  }
}

