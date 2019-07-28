package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of SnapshotSchedules.
    */
  var SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.undefined
}

object DescribeSnapshotSchedulesOutputMessage {
  @scala.inline
  def apply(Marker: String = null, SnapshotSchedules: SnapshotScheduleList = null): DescribeSnapshotSchedulesOutputMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (SnapshotSchedules != null) __obj.updateDynamic("SnapshotSchedules")(SnapshotSchedules)
    __obj.asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
  }
}

