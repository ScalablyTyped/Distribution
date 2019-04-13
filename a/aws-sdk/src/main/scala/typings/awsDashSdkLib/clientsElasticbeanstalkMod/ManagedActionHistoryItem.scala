package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedActionHistoryItem extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.undefined
  /**
    * The type of the managed action.
    */
  var ActionType: js.UndefOr[ActionType] = js.undefined
  /**
    * The date and time that the action started executing.
    */
  var ExecutedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If the action failed, a description of the failure.
    */
  var FailureDescription: js.UndefOr[String] = js.undefined
  /**
    * If the action failed, the type of failure.
    */
  var FailureType: js.UndefOr[FailureType] = js.undefined
  /**
    * The date and time that the action finished executing.
    */
  var FinishedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionHistoryStatus] = js.undefined
}

object ManagedActionHistoryItem {
  @scala.inline
  def apply(
    ActionDescription: String = null,
    ActionId: String = null,
    ActionType: ActionType = null,
    ExecutedTime: Timestamp = null,
    FailureDescription: String = null,
    FailureType: FailureType = null,
    FinishedTime: Timestamp = null,
    Status: ActionHistoryStatus = null
  ): ManagedActionHistoryItem = {
    val __obj = js.Dynamic.literal()
    if (ActionDescription != null) __obj.updateDynamic("ActionDescription")(ActionDescription)
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId)
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (ExecutedTime != null) __obj.updateDynamic("ExecutedTime")(ExecutedTime)
    if (FailureDescription != null) __obj.updateDynamic("FailureDescription")(FailureDescription)
    if (FailureType != null) __obj.updateDynamic("FailureType")(FailureType.asInstanceOf[js.Any])
    if (FinishedTime != null) __obj.updateDynamic("FinishedTime")(FinishedTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedActionHistoryItem]
  }
}

