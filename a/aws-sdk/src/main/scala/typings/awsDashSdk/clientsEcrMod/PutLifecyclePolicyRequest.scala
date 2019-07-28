package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLifecyclePolicyRequest extends js.Object {
  /**
    * The JSON repository policy text to apply to the repository.
    */
  var lifecyclePolicyText: LifecyclePolicyText
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName
}

object PutLifecyclePolicyRequest {
  @scala.inline
  def apply(
    lifecyclePolicyText: LifecyclePolicyText,
    repositoryName: RepositoryName,
    registryId: RegistryId = null
  ): PutLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(lifecyclePolicyText = lifecyclePolicyText, repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[PutLifecyclePolicyRequest]
  }
}

