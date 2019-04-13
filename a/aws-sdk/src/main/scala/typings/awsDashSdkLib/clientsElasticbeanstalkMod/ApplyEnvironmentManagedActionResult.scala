package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyEnvironmentManagedActionResult extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.undefined
  /**
    * The action ID of the managed action.
    */
  var ActionId: js.UndefOr[String] = js.undefined
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[ActionType] = js.undefined
  /**
    * The status of the managed action.
    */
  var Status: js.UndefOr[String] = js.undefined
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
    if (ActionDescription != null) __obj.updateDynamic("ActionDescription")(ActionDescription)
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId)
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
  }
}

