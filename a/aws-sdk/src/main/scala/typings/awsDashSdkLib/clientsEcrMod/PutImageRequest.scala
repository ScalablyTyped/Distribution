package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutImageRequest extends js.Object {
  /**
    * The image manifest corresponding to the image to be uploaded.
    */
  var imageManifest: ImageManifest
  /**
    * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.
    */
  var imageTag: js.UndefOr[ImageTag] = js.undefined
  /**
    * The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository in which to put the image.
    */
  var repositoryName: RepositoryName
}

object PutImageRequest {
  @scala.inline
  def apply(
    imageManifest: ImageManifest,
    repositoryName: RepositoryName,
    imageTag: ImageTag = null,
    registryId: RegistryId = null
  ): PutImageRequest = {
    val __obj = js.Dynamic.literal(imageManifest = imageManifest, repositoryName = repositoryName)
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[PutImageRequest]
  }
}

