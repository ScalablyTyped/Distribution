package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryPolicyRequest extends js.Object {
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository with the policy to retrieve.
    */
  var repositoryName: RepositoryName
}

object GetRepositoryPolicyRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, registryId: RegistryId = null): GetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[GetRepositoryPolicyRequest]
  }
}

