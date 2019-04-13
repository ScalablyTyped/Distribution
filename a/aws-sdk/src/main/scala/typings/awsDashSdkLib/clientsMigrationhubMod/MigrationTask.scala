package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationTask extends js.Object {
  /**
    * Unique identifier that references the migration task.
    */
  var MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined
  /**
    * A name that identifies the vendor of the migration tool being used.
    */
  var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined
  /**
    * 
    */
  var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.undefined
  /**
    * Task object encapsulating task information.
    */
  var Task: js.UndefOr[Task] = js.undefined
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined
}

object MigrationTask {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName = null,
    ProgressUpdateStream: ProgressUpdateStream = null,
    ResourceAttributeList: LatestResourceAttributeList = null,
    Task: Task = null,
    UpdateDateTime: UpdateDateTime = null
  ): MigrationTask = {
    val __obj = js.Dynamic.literal()
    if (MigrationTaskName != null) __obj.updateDynamic("MigrationTaskName")(MigrationTaskName)
    if (ProgressUpdateStream != null) __obj.updateDynamic("ProgressUpdateStream")(ProgressUpdateStream)
    if (ResourceAttributeList != null) __obj.updateDynamic("ResourceAttributeList")(ResourceAttributeList)
    if (Task != null) __obj.updateDynamic("Task")(Task)
    if (UpdateDateTime != null) __obj.updateDynamic("UpdateDateTime")(UpdateDateTime)
    __obj.asInstanceOf[MigrationTask]
  }
}

