package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImageScanResponse extends js.Object {
  var imageId: js.UndefOr[ImageIdentifier] = js.native
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object StartImageScanResponse {
  @scala.inline
  def apply(
    imageId: ImageIdentifier = null,
    imageScanStatus: ImageScanStatus = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): StartImageScanResponse = {
    val __obj = js.Dynamic.literal()
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (imageScanStatus != null) __obj.updateDynamic("imageScanStatus")(imageScanStatus.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageScanResponse]
  }
}

