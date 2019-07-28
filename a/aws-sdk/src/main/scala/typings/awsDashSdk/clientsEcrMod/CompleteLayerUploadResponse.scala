package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteLayerUploadResponse extends js.Object {
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  /**
    * The upload ID associated with the layer.
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}

object CompleteLayerUploadResponse {
  @scala.inline
  def apply(
    layerDigest: LayerDigest = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null,
    uploadId: UploadId = null
  ): CompleteLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[CompleteLayerUploadResponse]
  }
}

