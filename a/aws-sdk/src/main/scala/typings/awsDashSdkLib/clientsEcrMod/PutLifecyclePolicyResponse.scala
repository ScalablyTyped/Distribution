package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLifecyclePolicyResponse extends js.Object {
  /**
    * The JSON repository policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object PutLifecyclePolicyResponse {
  @scala.inline
  def apply(
    lifecyclePolicyText: LifecyclePolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): PutLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (lifecyclePolicyText != null) __obj.updateDynamic("lifecyclePolicyText")(lifecyclePolicyText)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[PutLifecyclePolicyResponse]
  }
}

