package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTriggerRequest extends js.Object {
  /**
    * The actions initiated by this trigger when it fires.
    */
  var Actions: ActionList
  /**
    * A description of the new trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The name of the trigger.
    */
  var Name: NameString
  /**
    * A predicate to specify when the new trigger should fire. This field is required when the trigger type is CONDITIONAL.
    */
  var Predicate: js.UndefOr[Predicate] = js.undefined
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *). This field is required when the trigger type is SCHEDULED.
    */
  var Schedule: js.UndefOr[GenericString] = js.undefined
  /**
    * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
    */
  var StartOnCreation: js.UndefOr[BooleanValue] = js.undefined
  /**
    * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide. 
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  /**
    * The type of the new trigger.
    */
  var Type: TriggerType
}

object CreateTriggerRequest {
  @scala.inline
  def apply(
    Actions: ActionList,
    Name: NameString,
    Type: TriggerType,
    Description: DescriptionString = null,
    Predicate: Predicate = null,
    Schedule: GenericString = null,
    StartOnCreation: js.UndefOr[BooleanValue] = js.undefined,
    Tags: TagsMap = null
  ): CreateTriggerRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions, Name = Name, Type = Type.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Predicate != null) __obj.updateDynamic("Predicate")(Predicate)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (!js.isUndefined(StartOnCreation)) __obj.updateDynamic("StartOnCreation")(StartOnCreation)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTriggerRequest]
  }
}

