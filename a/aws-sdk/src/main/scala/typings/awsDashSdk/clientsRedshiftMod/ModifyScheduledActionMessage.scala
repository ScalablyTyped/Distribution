package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyScheduledActionMessage extends js.Object {
  /**
    * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled action is disabled. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.native
  /**
    * A modified end time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * A different IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction.
    */
  var IamRole: js.UndefOr[String] = js.native
  /**
    * A modified schedule in either at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: js.UndefOr[String] = js.native
  /**
    * A modified description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the scheduled action to modify. 
    */
  var ScheduledActionName: String = js.native
  /**
    * A modified start time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  /**
    * A modified JSON format of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.native
}

object ModifyScheduledActionMessage {
  @scala.inline
  def apply(
    ScheduledActionName: String,
    Enable: js.UndefOr[scala.Boolean] = js.undefined,
    EndTime: TStamp = null,
    IamRole: String = null,
    Schedule: String = null,
    ScheduledActionDescription: String = null,
    StartTime: TStamp = null,
    TargetAction: ScheduledActionType = null
  ): ModifyScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (IamRole != null) __obj.updateDynamic("IamRole")(IamRole.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (ScheduledActionDescription != null) __obj.updateDynamic("ScheduledActionDescription")(ScheduledActionDescription.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (TargetAction != null) __obj.updateDynamic("TargetAction")(TargetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyScheduledActionMessage]
  }
}

