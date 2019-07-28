package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteImageRequest extends js.Object {
  /**
    * A list of image ID references that correspond to images to delete. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList
  /**
    * The AWS account ID associated with the registry that contains the image to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository that contains the image to delete.
    */
  var repositoryName: RepositoryName
}

object BatchDeleteImageRequest {
  @scala.inline
  def apply(imageIds: ImageIdentifierList, repositoryName: RepositoryName, registryId: RegistryId = null): BatchDeleteImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds, repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[BatchDeleteImageRequest]
  }
}

