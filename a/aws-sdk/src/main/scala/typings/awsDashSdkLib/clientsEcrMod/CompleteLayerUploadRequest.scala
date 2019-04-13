package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteLayerUploadRequest extends js.Object {
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigests: LayerDigestList
  /**
    * The AWS account ID associated with the registry to which to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to associate with the image layer.
    */
  var repositoryName: RepositoryName
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the image layer.
    */
  var uploadId: UploadId
}

object CompleteLayerUploadRequest {
  @scala.inline
  def apply(
    layerDigests: LayerDigestList,
    repositoryName: RepositoryName,
    uploadId: UploadId,
    registryId: RegistryId = null
  ): CompleteLayerUploadRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests, repositoryName = repositoryName, uploadId = uploadId)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[CompleteLayerUploadRequest]
  }
}

