package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * Date and time when the command was acknowledged.
    */
  var AcknowledgedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The command ID.
    */
  var CommandId: js.UndefOr[String] = js.undefined
  /**
    * Date when the command completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * Date and time when the command was run.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The command deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
  /**
    * The command exit code.
    */
  var ExitCode: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the instance where the command was executed.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The URL of the command log.
    */
  var LogUrl: js.UndefOr[String] = js.undefined
  /**
    * The command status:   failed   successful   skipped   pending  
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The command type:    configure     deploy     execute_recipes     install_dependencies     restart     rollback     setup     start     stop     undeploy     update_custom_cookbooks     update_dependencies   
    */
  var Type: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    AcknowledgedAt: DateTime = null,
    CommandId: String = null,
    CompletedAt: DateTime = null,
    CreatedAt: DateTime = null,
    DeploymentId: String = null,
    ExitCode: js.UndefOr[Integer] = js.undefined,
    InstanceId: String = null,
    LogUrl: String = null,
    Status: String = null,
    Type: String = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    if (AcknowledgedAt != null) __obj.updateDynamic("AcknowledgedAt")(AcknowledgedAt)
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId)
    if (CompletedAt != null) __obj.updateDynamic("CompletedAt")(CompletedAt)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (!js.isUndefined(ExitCode)) __obj.updateDynamic("ExitCode")(ExitCode)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (LogUrl != null) __obj.updateDynamic("LogUrl")(LogUrl)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Command]
  }
}

