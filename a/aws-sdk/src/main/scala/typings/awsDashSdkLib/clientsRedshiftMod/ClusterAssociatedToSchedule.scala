package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterAssociatedToSchedule extends js.Object {
  /**
    * 
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var ScheduleAssociationState: js.UndefOr[ScheduleState] = js.undefined
}

object ClusterAssociatedToSchedule {
  @scala.inline
  def apply(ClusterIdentifier: String = null, ScheduleAssociationState: ScheduleState = null): ClusterAssociatedToSchedule = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (ScheduleAssociationState != null) __obj.updateDynamic("ScheduleAssociationState")(ScheduleAssociationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAssociatedToSchedule]
  }
}

