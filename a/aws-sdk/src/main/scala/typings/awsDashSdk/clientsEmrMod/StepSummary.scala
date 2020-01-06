package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepSummary extends js.Object {
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is available for backward compatibility. We recommend using TERMINATE_CLUSTER instead.
    */
  var ActionOnFailure: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ActionOnFailure] = js.native
  /**
    * The Hadoop job configuration of the cluster step.
    */
  var Config: js.UndefOr[HadoopStepConfig] = js.native
  /**
    * The identifier of the cluster step.
    */
  var Id: js.UndefOr[StepId] = js.native
  /**
    * The name of the cluster step.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The current execution status details of the cluster step.
    */
  var Status: js.UndefOr[StepStatus] = js.native
}

object StepSummary {
  @scala.inline
  def apply(
    ActionOnFailure: ActionOnFailure = null,
    Config: HadoopStepConfig = null,
    Id: StepId = null,
    Name: String = null,
    Status: StepStatus = null
  ): StepSummary = {
    val __obj = js.Dynamic.literal()
    if (ActionOnFailure != null) __obj.updateDynamic("ActionOnFailure")(ActionOnFailure.asInstanceOf[js.Any])
    if (Config != null) __obj.updateDynamic("Config")(Config.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepSummary]
  }
}

