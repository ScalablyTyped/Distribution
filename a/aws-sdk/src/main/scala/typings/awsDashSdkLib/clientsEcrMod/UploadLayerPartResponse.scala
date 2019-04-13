package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLayerPartResponse extends js.Object {
  /**
    * The integer value of the last byte received in the request.
    */
  var lastByteReceived: js.UndefOr[PartSize] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  /**
    * The upload ID associated with the request.
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}

object UploadLayerPartResponse {
  @scala.inline
  def apply(
    lastByteReceived: js.UndefOr[PartSize] = js.undefined,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null,
    uploadId: UploadId = null
  ): UploadLayerPartResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastByteReceived)) __obj.updateDynamic("lastByteReceived")(lastByteReceived)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[UploadLayerPartResponse]
  }
}

