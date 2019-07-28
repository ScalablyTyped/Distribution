package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRepositoryPolicyRequest extends js.Object {
  /**
    * The AWS account ID associated with the registry that contains the repository policy to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository that is associated with the repository policy to delete.
    */
  var repositoryName: RepositoryName
}

object DeleteRepositoryPolicyRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, registryId: RegistryId = null): DeleteRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[DeleteRepositoryPolicyRequest]
  }
}

