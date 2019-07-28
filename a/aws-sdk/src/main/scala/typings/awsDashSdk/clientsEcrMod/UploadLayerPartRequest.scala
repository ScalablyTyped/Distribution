package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLayerPartRequest extends js.Object {
  /**
    * The base64-encoded layer part payload.
    */
  var layerPartBlob: LayerPartBlob
  /**
    * The integer value of the first byte of the layer part.
    */
  var partFirstByte: PartSize
  /**
    * The integer value of the last byte of the layer part.
    */
  var partLastByte: PartSize
  /**
    * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to which you are uploading layer parts.
    */
  var repositoryName: RepositoryName
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
    */
  var uploadId: UploadId
}

object UploadLayerPartRequest {
  @scala.inline
  def apply(
    layerPartBlob: LayerPartBlob,
    partFirstByte: PartSize,
    partLastByte: PartSize,
    repositoryName: RepositoryName,
    uploadId: UploadId,
    registryId: RegistryId = null
  ): UploadLayerPartRequest = {
    val __obj = js.Dynamic.literal(layerPartBlob = layerPartBlob.asInstanceOf[js.Any], partFirstByte = partFirstByte, partLastByte = partLastByte, repositoryName = repositoryName, uploadId = uploadId)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[UploadLayerPartRequest]
  }
}

