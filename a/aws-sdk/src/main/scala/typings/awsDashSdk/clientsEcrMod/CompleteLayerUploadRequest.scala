package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteLayerUploadRequest extends js.Object {
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigests: LayerDigestList = js.native
  /**
    * The AWS account ID associated with the registry to which to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to associate with the image layer.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the image layer.
    */
  var uploadId: UploadId = js.native
}

object CompleteLayerUploadRequest {
  @scala.inline
  def apply(
    layerDigests: LayerDigestList,
    repositoryName: RepositoryName,
    uploadId: UploadId,
    registryId: RegistryId = null
  ): CompleteLayerUploadRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLayerUploadRequest]
  }
}

