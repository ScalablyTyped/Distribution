package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCheckLayerAvailabilityRequest extends js.Object {
  /**
    * The digests of the image layers to check.
    */
  var layerDigests: BatchedOperationLayerDigestList = js.native
  /**
    * The AWS account ID associated with the registry that contains the image layers to check. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository that is associated with the image layers to check.
    */
  var repositoryName: RepositoryName = js.native
}

object BatchCheckLayerAvailabilityRequest {
  @scala.inline
  def apply(
    layerDigests: BatchedOperationLayerDigestList,
    repositoryName: RepositoryName,
    registryId: RegistryId = null
  ): BatchCheckLayerAvailabilityRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCheckLayerAvailabilityRequest]
  }
}

