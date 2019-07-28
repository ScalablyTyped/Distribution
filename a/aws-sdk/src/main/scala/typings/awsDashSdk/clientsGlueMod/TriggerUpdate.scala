package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerUpdate extends js.Object {
  /**
    * The actions initiated by this trigger.
    */
  var Actions: js.UndefOr[ActionList] = js.undefined
  /**
    * A description of this trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * Reserved for future use.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The predicate of this trigger, which defines when it will fire.
    */
  var Predicate: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Predicate] = js.undefined
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[GenericString] = js.undefined
}

object TriggerUpdate {
  @scala.inline
  def apply(
    Actions: ActionList = null,
    Description: DescriptionString = null,
    Name: NameString = null,
    Predicate: Predicate = null,
    Schedule: GenericString = null
  ): TriggerUpdate = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Predicate != null) __obj.updateDynamic("Predicate")(Predicate)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    __obj.asInstanceOf[TriggerUpdate]
  }
}

