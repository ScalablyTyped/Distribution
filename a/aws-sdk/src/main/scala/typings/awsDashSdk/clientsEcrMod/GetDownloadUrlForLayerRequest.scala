package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDownloadUrlForLayerRequest extends js.Object {
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: LayerDigest = js.native
  /**
    * The AWS account ID associated with the registry that contains the image layer to download. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository that is associated with the image layer to download.
    */
  var repositoryName: RepositoryName = js.native
}

object GetDownloadUrlForLayerRequest {
  @scala.inline
  def apply(layerDigest: LayerDigest, repositoryName: RepositoryName, registryId: RegistryId = null): GetDownloadUrlForLayerRequest = {
    val __obj = js.Dynamic.literal(layerDigest = layerDigest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadUrlForLayerRequest]
  }
}

