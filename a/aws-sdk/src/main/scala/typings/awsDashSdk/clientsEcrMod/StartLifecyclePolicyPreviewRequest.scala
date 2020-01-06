package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLifecyclePolicyPreviewRequest extends js.Object {
  /**
    * The policy to be evaluated against. If you do not specify a policy, the current policy for the repository is used.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to be evaluated.
    */
  var repositoryName: RepositoryName = js.native
}

object StartLifecyclePolicyPreviewRequest {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    lifecyclePolicyText: LifecyclePolicyText = null,
    registryId: RegistryId = null
  ): StartLifecyclePolicyPreviewRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (lifecyclePolicyText != null) __obj.updateDynamic("lifecyclePolicyText")(lifecyclePolicyText.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLifecyclePolicyPreviewRequest]
  }
}

