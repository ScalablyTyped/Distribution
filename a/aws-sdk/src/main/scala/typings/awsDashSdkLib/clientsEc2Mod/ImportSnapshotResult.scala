package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSnapshotResult extends js.Object {
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  /**
    * Information about the import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail] = js.undefined
}

object ImportSnapshotResult {
  @scala.inline
  def apply(
    Description: String = null,
    ImportTaskId: String = null,
    SnapshotTaskDetail: SnapshotTaskDetail = null
  ): ImportSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId)
    if (SnapshotTaskDetail != null) __obj.updateDynamic("SnapshotTaskDetail")(SnapshotTaskDetail)
    __obj.asInstanceOf[ImportSnapshotResult]
  }
}

