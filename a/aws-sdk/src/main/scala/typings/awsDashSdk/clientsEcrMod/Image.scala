package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * An object containing the image tag and image digest associated with an image.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.native
  /**
    * The image manifest associated with the image.
    */
  var imageManifest: js.UndefOr[ImageManifest] = js.native
  /**
    * The AWS account ID associated with the registry containing the image.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository associated with the image.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object Image {
  @scala.inline
  def apply(
    imageId: ImageIdentifier = null,
    imageManifest: ImageManifest = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (imageManifest != null) __obj.updateDynamic("imageManifest")(imageManifest.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

