package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The environment ID.
    */
  var EnvironmentId: Id = js.native
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.native
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
}

object UpdateEnvironmentRequest {
  @scala.inline
  def apply(
    ApplicationId: Id,
    EnvironmentId: Id,
    Description: Description = null,
    Monitors: MonitorList = null,
    Name: Name = null
  ): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Monitors != null) __obj.updateDynamic("Monitors")(Monitors.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
}

