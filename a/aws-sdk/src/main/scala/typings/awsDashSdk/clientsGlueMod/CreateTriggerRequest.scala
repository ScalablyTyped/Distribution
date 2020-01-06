package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTriggerRequest extends js.Object {
  /**
    * The actions initiated by this trigger when it fires.
    */
  var Actions: ActionList = js.native
  /**
    * A description of the new trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The name of the trigger.
    */
  var Name: NameString = js.native
  /**
    * A predicate to specify when the new trigger should fire. This field is required when the trigger type is CONDITIONAL.
    */
  var Predicate: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Predicate] = js.native
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *). This field is required when the trigger type is SCHEDULED.
    */
  var Schedule: js.UndefOr[GenericString] = js.native
  /**
    * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True is not supported for ON_DEMAND triggers.
    */
  var StartOnCreation: js.UndefOr[BooleanValue] = js.native
  /**
    * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide. 
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of the new trigger.
    */
  var Type: TriggerType = js.native
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.native
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
    StartOnCreation: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: TagsMap = null,
    WorkflowName: NameString = null
  ): CreateTriggerRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Predicate != null) __obj.updateDynamic("Predicate")(Predicate.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(StartOnCreation)) __obj.updateDynamic("StartOnCreation")(StartOnCreation.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WorkflowName != null) __obj.updateDynamic("WorkflowName")(WorkflowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTriggerRequest]
  }
}

