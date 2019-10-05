package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSchedule extends js.Object {
  /**
    * The number of clusters associated with the schedule.
    */
  var AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
    */
  var AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.undefined
  /**
    * 
    */
  var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.undefined
  /**
    * A list of ScheduleDefinitions.
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined
  /**
    * The description of the schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.undefined
  /**
    * An optional set of tags describing the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
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
    if (AssociatedClusters != null) __obj.updateDynamic("AssociatedClusters")(AssociatedClusters)
    if (NextInvocations != null) __obj.updateDynamic("NextInvocations")(NextInvocations)
    if (ScheduleDefinitions != null) __obj.updateDynamic("ScheduleDefinitions")(ScheduleDefinitions)
    if (ScheduleDescription != null) __obj.updateDynamic("ScheduleDescription")(ScheduleDescription)
    if (ScheduleIdentifier != null) __obj.updateDynamic("ScheduleIdentifier")(ScheduleIdentifier)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[SnapshotSchedule]
  }
}

