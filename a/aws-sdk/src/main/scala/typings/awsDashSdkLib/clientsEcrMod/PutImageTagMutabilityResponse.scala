package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutImageTagMutabilityResponse extends js.Object {
  /**
    * The image tag mutability setting for the repository.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object PutImageTagMutabilityResponse {
  @scala.inline
  def apply(
    imageTagMutability: ImageTagMutability = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): PutImageTagMutabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (imageTagMutability != null) __obj.updateDynamic("imageTagMutability")(imageTagMutability.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[PutImageTagMutabilityResponse]
  }
}

