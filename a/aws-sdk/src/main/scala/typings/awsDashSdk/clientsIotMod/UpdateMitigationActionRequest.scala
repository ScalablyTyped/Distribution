package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMitigationActionRequest extends js.Object {
  /**
    * The friendly name for the mitigation action. You can't change the name by using UpdateMitigationAction. Instead, you must delete and re-create the mitigation action with the new name.
    */
  var actionName: MitigationActionName
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.undefined
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object UpdateMitigationActionRequest {
  @scala.inline
  def apply(
    actionName: MitigationActionName,
    actionParams: MitigationActionParams = null,
    roleArn: RoleArn = null
  ): UpdateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName)
    if (actionParams != null) __obj.updateDynamic("actionParams")(actionParams)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[UpdateMitigationActionRequest]
  }
}

