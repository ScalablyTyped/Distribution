package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * An object containing the image tag and image digest associated with an image.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
  /**
    * The image manifest associated with the image.
    */
  var imageManifest: js.UndefOr[ImageManifest] = js.undefined
  /**
    * The AWS account ID associated with the registry containing the image.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository associated with the image.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
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
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (imageManifest != null) __obj.updateDynamic("imageManifest")(imageManifest)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[Image]
  }
}

