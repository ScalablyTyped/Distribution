package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
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
  var Id: js.UndefOr[IdString] = js.undefined
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The predicate of this trigger, which defines when it will fire.
    */
  var Predicate: js.UndefOr[Predicate] = js.undefined
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[GenericString] = js.undefined
  /**
    * The current state of the trigger.
    */
  var State: js.UndefOr[TriggerState] = js.undefined
  /**
    * The type of trigger that this is.
    */
  var Type: js.UndefOr[TriggerType] = js.undefined
}

object Trigger {
  @scala.inline
  def apply(
    Actions: ActionList = null,
    Description: DescriptionString = null,
    Id: IdString = null,
    Name: NameString = null,
    Predicate: Predicate = null,
    Schedule: GenericString = null,
    State: TriggerState = null,
    Type: TriggerType = null
  ): Trigger = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Predicate != null) __obj.updateDynamic("Predicate")(Predicate)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}

