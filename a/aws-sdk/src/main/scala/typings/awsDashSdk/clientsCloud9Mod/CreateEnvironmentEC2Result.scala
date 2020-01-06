package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentEC2Result extends js.Object {
  /**
    * The ID of the environment that was created.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.native
}

object CreateEnvironmentEC2Result {
  @scala.inline
  def apply(environmentId: EnvironmentId = null): CreateEnvironmentEC2Result = {
    val __obj = js.Dynamic.literal()
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentEC2Result]
  }
}

