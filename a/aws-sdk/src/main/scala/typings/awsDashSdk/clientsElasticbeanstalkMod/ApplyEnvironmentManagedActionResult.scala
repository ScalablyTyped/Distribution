package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyEnvironmentManagedActionResult extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * The action ID of the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ActionType] = js.native
  /**
    * The status of the managed action.
    */
  var Status: js.UndefOr[String] = js.native
}

object ApplyEnvironmentManagedActionResult {
  @scala.inline
  def apply(
    ActionDescription: String = null,
    ActionId: String = null,
    ActionType: ActionType = null,
    Status: String = null
  ): ApplyEnvironmentManagedActionResult = {
    val __obj = js.Dynamic.literal()
    if (ActionDescription != null) __obj.updateDynamic("ActionDescription")(ActionDescription.asInstanceOf[js.Any])
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId.asInstanceOf[js.Any])
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
  }
}

