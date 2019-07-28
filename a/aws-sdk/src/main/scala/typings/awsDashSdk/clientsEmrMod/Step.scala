package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is provided for backward compatibility. We recommend using TERMINATE_CLUSTER instead.
    */
  var ActionOnFailure: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ActionOnFailure] = js.undefined
  /**
    * The Hadoop job configuration of the cluster step.
    */
  var Config: js.UndefOr[HadoopStepConfig] = js.undefined
  /**
    * The identifier of the cluster step.
    */
  var Id: js.UndefOr[StepId] = js.undefined
  /**
    * The name of the cluster step.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The current execution status details of the cluster step.
    */
  var Status: js.UndefOr[StepStatus] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    ActionOnFailure: ActionOnFailure = null,
    Config: HadoopStepConfig = null,
    Id: StepId = null,
    Name: String = null,
    Status: StepStatus = null
  ): Step = {
    val __obj = js.Dynamic.literal()
    if (ActionOnFailure != null) __obj.updateDynamic("ActionOnFailure")(ActionOnFailure.asInstanceOf[js.Any])
    if (Config != null) __obj.updateDynamic("Config")(Config)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[Step]
  }
}

