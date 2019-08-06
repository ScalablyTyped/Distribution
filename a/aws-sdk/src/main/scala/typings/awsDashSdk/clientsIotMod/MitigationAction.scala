package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MitigationAction extends js.Object {
  /**
    * The set of parameters for this mitigation action. The parameters vary, depending on the kind of action you apply.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.undefined
  /**
    * A unique identifier for the mitigation action.
    */
  var id: js.UndefOr[MitigationActionId] = js.undefined
  /**
    * A user-friendly name for the mitigation action.
    */
  var name: js.UndefOr[MitigationActionName] = js.undefined
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object MitigationAction {
  @scala.inline
  def apply(
    actionParams: MitigationActionParams = null,
    id: MitigationActionId = null,
    name: MitigationActionName = null,
    roleArn: RoleArn = null
  ): MitigationAction = {
    val __obj = js.Dynamic.literal()
    if (actionParams != null) __obj.updateDynamic("actionParams")(actionParams)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[MitigationAction]
  }
}

