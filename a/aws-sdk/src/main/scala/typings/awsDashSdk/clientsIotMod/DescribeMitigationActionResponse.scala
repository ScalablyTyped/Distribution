package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMitigationActionResponse extends js.Object {
  /**
    * The ARN that identifies this migration action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.undefined
  /**
    * A unique identifier for this action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.undefined
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  /**
    * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.undefined
  /**
    * The type of mitigation action.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.undefined
  /**
    * The date and time when the mitigation action was added to your AWS account.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time when the mitigation action was last changed.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the IAM role used to apply this action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
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
    if (actionArn != null) __obj.updateDynamic("actionArn")(actionArn)
    if (actionId != null) __obj.updateDynamic("actionId")(actionId)
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionParams != null) __obj.updateDynamic("actionParams")(actionParams)
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[DescribeMitigationActionResponse]
  }
}

