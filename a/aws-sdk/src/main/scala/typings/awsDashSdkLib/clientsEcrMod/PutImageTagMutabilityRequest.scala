package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutImageTagMutabilityRequest extends js.Object {
  /**
    * The tag mutability setting for the repository. If MUTABLE is specified, image tags can be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: ImageTagMutability
  /**
    * The AWS account ID associated with the registry that contains the repository in which to update the image tag mutability settings. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository in which to update the image tag mutability settings.
    */
  var repositoryName: RepositoryName
}

object PutImageTagMutabilityRequest {
  @scala.inline
  def apply(
    imageTagMutability: ImageTagMutability,
    repositoryName: RepositoryName,
    registryId: RegistryId = null
  ): PutImageTagMutabilityRequest = {
    val __obj = js.Dynamic.literal(imageTagMutability = imageTagMutability.asInstanceOf[js.Any], repositoryName = repositoryName)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[PutImageTagMutabilityRequest]
  }
}

