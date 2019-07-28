package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotScheduleMessage extends js.Object {
  /**
    * A unique identifier of the snapshot schedule to delete.
    */
  var ScheduleIdentifier: String
}

object DeleteSnapshotScheduleMessage {
  @scala.inline
  def apply(ScheduleIdentifier: String): DeleteSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleIdentifier = ScheduleIdentifier)
  
    __obj.asInstanceOf[DeleteSnapshotScheduleMessage]
  }
}

