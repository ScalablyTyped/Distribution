package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleTask extends js.Object {
  /**
    * The ID of the bundle task.
    */
  var BundleId: js.UndefOr[String] = js.native
  /**
    * If the task fails, a description of the error.
    */
  var BundleTaskError: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.BundleTaskError] = js.native
  /**
    * The ID of the instance associated with this bundle task.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The level of task completion, as a percent (for example, 20%).
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * The time this task started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The state of the task.
    */
  var State: js.UndefOr[BundleTaskState] = js.native
  /**
    * The Amazon S3 storage locations.
    */
  var Storage: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Storage] = js.native
  /**
    * The time of the most recent update for the task.
    */
  var UpdateTime: js.UndefOr[DateTime] = js.native
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
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId.asInstanceOf[js.Any])
    if (BundleTaskError != null) __obj.updateDynamic("BundleTaskError")(BundleTaskError.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Storage != null) __obj.updateDynamic("Storage")(Storage.asInstanceOf[js.Any])
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleTask]
  }
}

