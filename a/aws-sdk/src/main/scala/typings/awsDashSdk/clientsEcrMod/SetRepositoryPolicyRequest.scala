package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRepositoryPolicyRequest extends js.Object {
  /**
    * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in the future, you must force the SetRepositoryPolicy operation. This is intended to prevent accidental repository lock outs.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  /**
    * The JSON repository policy text to apply to the repository. For more information, see Amazon ECR Repository Policy Examples in the Amazon Elastic Container Registry User Guide.
    */
  var policyText: RepositoryPolicyText = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName = js.native
}

object SetRepositoryPolicyRequest {
  @scala.inline
  def apply(
    policyText: RepositoryPolicyText,
    repositoryName: RepositoryName,
    force: js.UndefOr[Boolean] = js.undefined,
    registryId: RegistryId = null
  ): SetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(policyText = policyText.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRepositoryPolicyRequest]
  }
}

