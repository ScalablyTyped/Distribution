package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMitigationActionRequest extends js.Object {
  /**
    * A friendly name for the action. Choose a friendly name that accurately describes the action (for example, EnableLoggingAction).
    */
  var actionName: MitigationActionName
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: MitigationActionParams
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: RoleArn
  /**
    * Metadata that can be used to manage the mitigation action.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateMitigationActionRequest {
  @scala.inline
  def apply(
    actionName: MitigationActionName,
    actionParams: MitigationActionParams,
    roleArn: RoleArn,
    tags: TagList = null
  ): CreateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName, actionParams = actionParams, roleArn = roleArn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateMitigationActionRequest]
  }
}

