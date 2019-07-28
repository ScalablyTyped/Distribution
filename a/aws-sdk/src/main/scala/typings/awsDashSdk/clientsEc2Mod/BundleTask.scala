package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleTask extends js.Object {
  /**
    * The ID of the bundle task.
    */
  var BundleId: js.UndefOr[String] = js.undefined
  /**
    * If the task fails, a description of the error.
    */
  var BundleTaskError: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.BundleTaskError] = js.undefined
  /**
    * The ID of the instance associated with this bundle task.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The level of task completion, as a percent (for example, 20%).
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * The time this task started.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The state of the task.
    */
  var State: js.UndefOr[BundleTaskState] = js.undefined
  /**
    * The Amazon S3 storage locations.
    */
  var Storage: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Storage] = js.undefined
  /**
    * The time of the most recent update for the task.
    */
  var UpdateTime: js.UndefOr[DateTime] = js.undefined
}

object BundleTask {
  @scala.inline
  def apply(
    BundleId: String = null,
    BundleTaskError: BundleTaskError = null,
    InstanceId: String = null,
    Progress: String = null,
    StartTime: DateTime = null,
    State: BundleTaskState = null,
    Storage: Storage = null,
    UpdateTime: DateTime = null
  ): BundleTask = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId)
    if (BundleTaskError != null) __obj.updateDynamic("BundleTaskError")(BundleTaskError)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Storage != null) __obj.updateDynamic("Storage")(Storage)
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime)
    __obj.asInstanceOf[BundleTask]
  }
}

