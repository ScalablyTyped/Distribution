package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Description] = js.native
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.native
  /**
    * A name for the environment.
    */
  var Name: typings.awsDashSdk.clientsAppconfigMod.Name = js.native
  /**
    * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateEnvironmentRequest {
  @scala.inline
  def apply(
    ApplicationId: Id,
    Name: Name,
    Description: Description = null,
    Monitors: MonitorList = null,
    Tags: TagMap = null
  ): CreateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Monitors != null) __obj.updateDynamic("Monitors")(Monitors.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentRequest]
  }
}

