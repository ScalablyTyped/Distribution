package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSnapshotTask extends js.Object {
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  /**
    * Describes an import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.SnapshotTaskDetail] = js.undefined
}

object ImportSnapshotTask {
  @scala.inline
  def apply(
    Description: String = null,
    ImportTaskId: String = null,
    SnapshotTaskDetail: SnapshotTaskDetail = null
  ): ImportSnapshotTask = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId)
    if (SnapshotTaskDetail != null) __obj.updateDynamic("SnapshotTaskDetail")(SnapshotTaskDetail)
    __obj.asInstanceOf[ImportSnapshotTask]
  }
}

