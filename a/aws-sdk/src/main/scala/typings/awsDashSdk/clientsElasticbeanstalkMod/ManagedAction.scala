package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAction extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ActionType] = js.native
  /**
    * The status of the managed action. If the action is Scheduled, you can apply it immediately with ApplyEnvironmentManagedAction.
    */
  var Status: js.UndefOr[ActionStatus] = js.native
  /**
    * The start time of the maintenance window in which the managed action will execute.
    */
  var WindowStartTime: js.UndefOr[Timestamp] = js.native
}

object ManagedAction {
  @scala.inline
  def apply(
    ActionDescription: String = null,
    ActionId: String = null,
    ActionType: ActionType = null,
    Status: ActionStatus = null,
    WindowStartTime: Timestamp = null
  ): ManagedAction = {
    val __obj = js.Dynamic.literal()
    if (ActionDescription != null) __obj.updateDynamic("ActionDescription")(ActionDescription.asInstanceOf[js.Any])
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId.asInstanceOf[js.Any])
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (WindowStartTime != null) __obj.updateDynamic("WindowStartTime")(WindowStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAction]
  }
}

