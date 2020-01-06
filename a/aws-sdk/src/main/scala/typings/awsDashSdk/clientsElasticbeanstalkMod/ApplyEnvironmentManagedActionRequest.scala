package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyEnvironmentManagedActionRequest extends js.Object {
  /**
    * The action ID of the scheduled managed action to execute.
    */
  var ActionId: String = js.native
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.native
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.native
}

object ApplyEnvironmentManagedActionRequest {
  @scala.inline
  def apply(ActionId: String, EnvironmentId: String = null, EnvironmentName: String = null): ApplyEnvironmentManagedActionRequest = {
    val __obj = js.Dynamic.literal(ActionId = ActionId.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyEnvironmentManagedActionRequest]
  }
}

