package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyMigrationTaskStateRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[DryRun] = js.undefined
  /**
    * Unique identifier that references the migration task.
    */
  var MigrationTaskName: awsDashSdkLib.clientsMigrationhubMod.MigrationTaskName
  /**
    * Number of seconds after the UpdateDateTime within which the Migration Hub can expect an update. If Migration Hub does not receive an update within the specified interval, then the migration task will be considered stale.
    */
  var NextUpdateSeconds: awsDashSdkLib.clientsMigrationhubMod.NextUpdateSeconds
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: awsDashSdkLib.clientsMigrationhubMod.ProgressUpdateStream
  /**
    * Information about the task's progress and status.
    */
  var Task: awsDashSdkLib.clientsMigrationhubMod.Task
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: awsDashSdkLib.clientsMigrationhubMod.UpdateDateTime
}

object NotifyMigrationTaskStateRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    NextUpdateSeconds: NextUpdateSeconds,
    ProgressUpdateStream: ProgressUpdateStream,
    Task: Task,
    UpdateDateTime: UpdateDateTime,
    DryRun: js.UndefOr[DryRun] = js.undefined
  ): NotifyMigrationTaskStateRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName, NextUpdateSeconds = NextUpdateSeconds, ProgressUpdateStream = ProgressUpdateStream, Task = Task, UpdateDateTime = UpdateDateTime)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[NotifyMigrationTaskStateRequest]
  }
}

