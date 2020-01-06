package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySnapshotScheduleMessage extends js.Object {
  /**
    * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example, "cron(30 12 *)" or "rate(12 hours)".
    */
  var ScheduleDefinitions: ScheduleDefinitionList = js.native
  /**
    * A unique alphanumeric identifier of the schedule to modify.
    */
  var ScheduleIdentifier: String = js.native
}

object ModifySnapshotScheduleMessage {
  @scala.inline
  def apply(ScheduleDefinitions: ScheduleDefinitionList, ScheduleIdentifier: String): ModifySnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleDefinitions = ScheduleDefinitions.asInstanceOf[js.Any], ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifySnapshotScheduleMessage]
  }
}

