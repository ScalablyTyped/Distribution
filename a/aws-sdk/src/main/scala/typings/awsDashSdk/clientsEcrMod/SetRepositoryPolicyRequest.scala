package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRepositoryPolicyRequest extends js.Object {
  /**
    * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in the future, you must force the SetRepositoryPolicy operation. This is intended to prevent accidental repository lock outs.
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  /**
    * The JSON repository policy text to apply to the repository. For more information, see Amazon ECR Repository Policy Examples in the Amazon Elastic Container Registry User Guide.
    */
  var policyText: RepositoryPolicyText
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName
}

object SetRepositoryPolicyRequest {
  @scala.inline
  def apply(
    policyText: RepositoryPolicyText,
    repositoryName: RepositoryName,
    force: js.UndefOr[Boolean] = js.undefined,
    registryId: RegistryId = null
  ): SetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(policyText = policyText, repositoryName = repositoryName)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[SetRepositoryPolicyRequest]
  }
}

