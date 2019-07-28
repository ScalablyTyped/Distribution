package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryPolicyResponse extends js.Object {
  /**
    * The JSON repository policy text associated with the repository.
    */
  var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object GetRepositoryPolicyResponse {
  @scala.inline
  def apply(
    policyText: RepositoryPolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): GetRepositoryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (policyText != null) __obj.updateDynamic("policyText")(policyText)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[GetRepositoryPolicyResponse]
  }
}

