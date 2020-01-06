package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDetail extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. 
    */
  var imagePushedAt: js.UndefOr[PushTimestamp] = js.native
  /**
    * A summary of the last completed image scan.
    */
  var imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary] = js.native
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.native
  /**
    * The size, in bytes, of the image in the repository.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.native
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.native
  /**
    * The AWS account ID associated with the registry to which this image belongs.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to which this image belongs.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object ImageDetail {
  @scala.inline
  def apply(
    imageDigest: ImageDigest = null,
    imagePushedAt: PushTimestamp = null,
    imageScanFindingsSummary: ImageScanFindingsSummary = null,
    imageScanStatus: ImageScanStatus = null,
    imageSizeInBytes: Int | Double = null,
    imageTags: ImageTagList = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): ImageDetail = {
    val __obj = js.Dynamic.literal()
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (imagePushedAt != null) __obj.updateDynamic("imagePushedAt")(imagePushedAt.asInstanceOf[js.Any])
    if (imageScanFindingsSummary != null) __obj.updateDynamic("imageScanFindingsSummary")(imageScanFindingsSummary.asInstanceOf[js.Any])
    if (imageScanStatus != null) __obj.updateDynamic("imageScanStatus")(imageScanStatus.asInstanceOf[js.Any])
    if (imageSizeInBytes != null) __obj.updateDynamic("imageSizeInBytes")(imageSizeInBytes.asInstanceOf[js.Any])
    if (imageTags != null) __obj.updateDynamic("imageTags")(imageTags.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDetail]
  }
}

