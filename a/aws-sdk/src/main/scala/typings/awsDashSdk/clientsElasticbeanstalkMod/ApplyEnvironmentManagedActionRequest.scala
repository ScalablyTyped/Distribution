package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyEnvironmentManagedActionRequest extends js.Object {
  /**
    * The action ID of the scheduled managed action to execute.
    */
  var ActionId: String
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.undefined
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.undefined
}

object ApplyEnvironmentManagedActionRequest {
  @scala.inline
  def apply(ActionId: String, EnvironmentId: String = null, EnvironmentName: String = null): ApplyEnvironmentManagedActionRequest = {
    val __obj = js.Dynamic.literal(ActionId = ActionId)
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    __obj.asInstanceOf[ApplyEnvironmentManagedActionRequest]
  }
}

