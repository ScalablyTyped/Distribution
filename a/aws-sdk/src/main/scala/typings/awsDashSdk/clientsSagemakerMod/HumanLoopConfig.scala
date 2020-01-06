package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typings.awsDashSdk.clientsSagemakerMod.HumanTaskUiArn = js.native
  var PublicWorkforceTaskPrice: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.PublicWorkforceTaskPrice] = js.native
  /**
    * The length of time that a task remains available for labeling by human workers.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.native
  /**
    * The number of human tasks.
    */
  var TaskCount: FlowDefinitionTaskCount = js.native
  /**
    * A description for the human worker task.
    */
  var TaskDescription: FlowDefinitionTaskDescription = js.native
  /**
    * Keywords used to describe the task so that workers can discover the task.
    */
  var TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords] = js.native
  /**
    * The amount of time that a worker has to complete a task.
    */
  var TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.native
  /**
    * A title for the human worker task.
    */
  var TaskTitle: FlowDefinitionTaskTitle = js.native
  /**
    * Amazon Resource Name (ARN) of a team of workers.
    */
  var WorkteamArn: typings.awsDashSdk.clientsSagemakerMod.WorkteamArn = js.native
}

object HumanLoopConfig {
  @scala.inline
  def apply(
    HumanTaskUiArn: HumanTaskUiArn,
    TaskCount: FlowDefinitionTaskCount,
    TaskDescription: FlowDefinitionTaskDescription,
    TaskTitle: FlowDefinitionTaskTitle,
    WorkteamArn: WorkteamArn,
    PublicWorkforceTaskPrice: PublicWorkforceTaskPrice = null,
    TaskAvailabilityLifetimeInSeconds: Int | Double = null,
    TaskKeywords: FlowDefinitionTaskKeywords = null,
    TaskTimeLimitInSeconds: Int | Double = null
  ): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], TaskCount = TaskCount.asInstanceOf[js.Any], TaskDescription = TaskDescription.asInstanceOf[js.Any], TaskTitle = TaskTitle.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    if (PublicWorkforceTaskPrice != null) __obj.updateDynamic("PublicWorkforceTaskPrice")(PublicWorkforceTaskPrice.asInstanceOf[js.Any])
    if (TaskAvailabilityLifetimeInSeconds != null) __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(TaskAvailabilityLifetimeInSeconds.asInstanceOf[js.Any])
    if (TaskKeywords != null) __obj.updateDynamic("TaskKeywords")(TaskKeywords.asInstanceOf[js.Any])
    if (TaskTimeLimitInSeconds != null) __obj.updateDynamic("TaskTimeLimitInSeconds")(TaskTimeLimitInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
}

