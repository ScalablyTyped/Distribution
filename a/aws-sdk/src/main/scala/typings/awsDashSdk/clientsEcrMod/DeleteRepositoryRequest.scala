package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRepositoryRequest extends js.Object {
  /**
    *  If a repository contains images, forces the deletion.
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  /**
    * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName
}

object DeleteRepositoryRequest {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    force: js.UndefOr[Boolean] = js.undefined,
    registryId: RegistryId = null
  ): DeleteRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[DeleteRepositoryRequest]
  }
}

