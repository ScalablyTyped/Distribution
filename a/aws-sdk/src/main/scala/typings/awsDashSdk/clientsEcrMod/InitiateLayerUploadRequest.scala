package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateLayerUploadRequest extends js.Object {
  /**
    * The AWS account ID associated with the registry to which you intend to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to which you intend to upload layers.
    */
  var repositoryName: RepositoryName
}

object InitiateLayerUploadRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, registryId: RegistryId = null): InitiateLayerUploadRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[InitiateLayerUploadRequest]
  }
}

