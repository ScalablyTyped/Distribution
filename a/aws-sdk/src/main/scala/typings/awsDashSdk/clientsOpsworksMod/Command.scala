package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  /**
    * Date and time when the command was acknowledged.
    */
  var AcknowledgedAt: js.UndefOr[DateTime] = js.native
  /**
    * The command ID.
    */
  var CommandId: js.UndefOr[String] = js.native
  /**
    * Date when the command completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.native
  /**
    * Date and time when the command was run.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The command deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  /**
    * The command exit code.
    */
  var ExitCode: js.UndefOr[Integer] = js.native
  /**
    * The ID of the instance where the command was executed.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The URL of the command log.
    */
  var LogUrl: js.UndefOr[String] = js.native
  /**
    * The command status:   failed   successful   skipped   pending  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The command type:    configure     deploy     execute_recipes     install_dependencies     restart     rollback     setup     start     stop     undeploy     update_custom_cookbooks     update_dependencies   
    */
  var Type: js.UndefOr[String] = js.native
}

object Command {
  @scala.inline
  def apply(
    AcknowledgedAt: DateTime = null,
    CommandId: String = null,
    CompletedAt: DateTime = null,
    CreatedAt: DateTime = null,
    DeploymentId: String = null,
    ExitCode: Int | scala.Double = null,
    InstanceId: String = null,
    LogUrl: String = null,
    Status: String = null,
    Type: String = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    if (AcknowledgedAt != null) __obj.updateDynamic("AcknowledgedAt")(AcknowledgedAt.asInstanceOf[js.Any])
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId.asInstanceOf[js.Any])
    if (CompletedAt != null) __obj.updateDynamic("CompletedAt")(CompletedAt.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (ExitCode != null) __obj.updateDynamic("ExitCode")(ExitCode.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LogUrl != null) __obj.updateDynamic("LogUrl")(LogUrl.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

