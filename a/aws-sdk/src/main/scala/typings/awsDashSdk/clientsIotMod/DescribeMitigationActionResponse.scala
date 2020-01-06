package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMitigationActionResponse extends js.Object {
  /**
    * The ARN that identifies this migration action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  /**
    * A unique identifier for this action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * The type of mitigation action.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.native
  /**
    * The date and time when the mitigation action was added to your AWS account.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time when the mitigation action was last changed.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the IAM role used to apply this action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object DescribeMitigationActionResponse {
  @scala.inline
  def apply(
    actionArn: MitigationActionArn = null,
    actionId: MitigationActionId = null,
    actionName: MitigationActionName = null,
    actionParams: MitigationActionParams = null,
    actionType: MitigationActionType = null,
    creationDate: Timestamp = null,
    lastModifiedDate: Timestamp = null,
    roleArn: RoleArn = null
  ): DescribeMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    if (actionArn != null) __obj.updateDynamic("actionArn")(actionArn.asInstanceOf[js.Any])
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionParams != null) __obj.updateDynamic("actionParams")(actionParams.asInstanceOf[js.Any])
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMitigationActionResponse]
  }
}

