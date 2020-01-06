package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSchedule extends js.Object {
  /**
    * The number of clusters associated with the schedule.
    */
  var AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
    */
  var AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.native
  /**
    * 
    */
  var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.native
  /**
    * A list of ScheduleDefinitions.
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.native
  /**
    * The description of the schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional set of tags describing the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SnapshotSchedule {
  @scala.inline
  def apply(
    AssociatedClusterCount: Int | scala.Double = null,
    AssociatedClusters: AssociatedClusterList = null,
    NextInvocations: ScheduledSnapshotTimeList = null,
    ScheduleDefinitions: ScheduleDefinitionList = null,
    ScheduleDescription: String = null,
    ScheduleIdentifier: String = null,
    Tags: TagList = null
  ): SnapshotSchedule = {
    val __obj = js.Dynamic.literal()
    if (AssociatedClusterCount != null) __obj.updateDynamic("AssociatedClusterCount")(AssociatedClusterCount.asInstanceOf[js.Any])
    if (AssociatedClusters != null) __obj.updateDynamic("AssociatedClusters")(AssociatedClusters.asInstanceOf[js.Any])
    if (NextInvocations != null) __obj.updateDynamic("NextInvocations")(NextInvocations.asInstanceOf[js.Any])
    if (ScheduleDefinitions != null) __obj.updateDynamic("ScheduleDefinitions")(ScheduleDefinitions.asInstanceOf[js.Any])
    if (ScheduleDescription != null) __obj.updateDynamic("ScheduleDescription")(ScheduleDescription.asInstanceOf[js.Any])
    if (ScheduleIdentifier != null) __obj.updateDynamic("ScheduleIdentifier")(ScheduleIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSchedule]
  }
}

