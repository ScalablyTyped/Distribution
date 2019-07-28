package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePolicyRequest extends js.Object {
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository.
    */
  var repositoryName: RepositoryName
}

object GetLifecyclePolicyRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, registryId: RegistryId = null): GetLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[GetLifecyclePolicyRequest]
  }
}

