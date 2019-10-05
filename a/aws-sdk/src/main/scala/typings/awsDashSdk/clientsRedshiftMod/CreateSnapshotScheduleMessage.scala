package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotScheduleMessage extends js.Object {
  /**
    * 
    */
  var DryRun: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * 
    */
  var NextInvocations: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)". 
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined
  /**
    * The description of the snapshot schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.undefined
  /**
    * An optional set of tags you can use to search for the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateSnapshotScheduleMessage {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    NextInvocations: Int | scala.Double = null,
    ScheduleDefinitions: ScheduleDefinitionList = null,
    ScheduleDescription: String = null,
    ScheduleIdentifier: String = null,
    Tags: TagList = null
  ): CreateSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (NextInvocations != null) __obj.updateDynamic("NextInvocations")(NextInvocations.asInstanceOf[js.Any])
    if (ScheduleDefinitions != null) __obj.updateDynamic("ScheduleDefinitions")(ScheduleDefinitions)
    if (ScheduleDescription != null) __obj.updateDynamic("ScheduleDescription")(ScheduleDescription)
    if (ScheduleIdentifier != null) __obj.updateDynamic("ScheduleIdentifier")(ScheduleIdentifier)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateSnapshotScheduleMessage]
  }
}

