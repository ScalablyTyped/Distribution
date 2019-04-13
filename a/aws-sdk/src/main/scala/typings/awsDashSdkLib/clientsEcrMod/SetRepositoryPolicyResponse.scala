package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRepositoryPolicyResponse extends js.Object {
  /**
    * The JSON repository policy text applied to the repository.
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

object SetRepositoryPolicyResponse {
  @scala.inline
  def apply(
    policyText: RepositoryPolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): SetRepositoryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (policyText != null) __obj.updateDynamic("policyText")(policyText)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[SetRepositoryPolicyResponse]
  }
}

