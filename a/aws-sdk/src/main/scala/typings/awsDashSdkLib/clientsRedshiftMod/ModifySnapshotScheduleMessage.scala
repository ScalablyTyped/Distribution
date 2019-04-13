package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifySnapshotScheduleMessage extends js.Object {
  /**
    * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example, "cron(30 12 *)" or "rate(12 hours)".
    */
  var ScheduleDefinitions: ScheduleDefinitionList
  /**
    * A unique alphanumeric identifier of the schedule to modify.
    */
  var ScheduleIdentifier: String
}

object ModifySnapshotScheduleMessage {
  @scala.inline
  def apply(ScheduleDefinitions: ScheduleDefinitionList, ScheduleIdentifier: String): ModifySnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleDefinitions = ScheduleDefinitions, ScheduleIdentifier = ScheduleIdentifier)
  
    __obj.asInstanceOf[ModifySnapshotScheduleMessage]
  }
}

