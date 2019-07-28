package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetImageRequest extends js.Object {
  /**
    * The accepted media types for the request. Valid values: application/vnd.docker.distribution.manifest.v1+json | application/vnd.docker.distribution.manifest.v2+json | application/vnd.oci.image.manifest.v1+json 
    */
  var acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined
  /**
    * A list of image ID references that correspond to images to describe. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList
  /**
    * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository that contains the images to describe.
    */
  var repositoryName: RepositoryName
}

object BatchGetImageRequest {
  @scala.inline
  def apply(
    imageIds: ImageIdentifierList,
    repositoryName: RepositoryName,
    acceptedMediaTypes: MediaTypeList = null,
    registryId: RegistryId = null
  ): BatchGetImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds, repositoryName = repositoryName)
    if (acceptedMediaTypes != null) __obj.updateDynamic("acceptedMediaTypes")(acceptedMediaTypes)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[BatchGetImageRequest]
  }
}

