package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryRequest extends js.Object {
  /**
    *  If a repository contains images, forces the deletion.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName = js.native
}

object DeleteRepositoryRequest {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    force: js.UndefOr[Boolean] = js.undefined,
    registryId: RegistryId = null
  ): DeleteRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryRequest]
  }
}

