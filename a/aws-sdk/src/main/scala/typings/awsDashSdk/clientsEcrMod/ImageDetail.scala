package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDetail extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. 
    */
  var imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined
  /**
    * The size, in bytes, of the image in the repository.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.undefined
  /**
    * The AWS account ID associated with the registry to which this image belongs.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to which this image belongs.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object ImageDetail {
  @scala.inline
  def apply(
    imageDigest: ImageDigest = null,
    imagePushedAt: PushTimestamp = null,
    imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined,
    imageTags: ImageTagList = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): ImageDetail = {
    val __obj = js.Dynamic.literal()
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest)
    if (imagePushedAt != null) __obj.updateDynamic("imagePushedAt")(imagePushedAt)
    if (!js.isUndefined(imageSizeInBytes)) __obj.updateDynamic("imageSizeInBytes")(imageSizeInBytes)
    if (imageTags != null) __obj.updateDynamic("imageTags")(imageTags)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[ImageDetail]
  }
}

