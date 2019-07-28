package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEnvironmentRequest extends js.Object {
  /**
    * Any new or replacement description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  /**
    * The ID of the environment to change settings.
    */
  var environmentId: EnvironmentId
  /**
    * A replacement name for the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
}

object UpdateEnvironmentRequest {
  @scala.inline
  def apply(
    environmentId: EnvironmentId,
    description: EnvironmentDescription = null,
    name: EnvironmentName = null
  ): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
}

