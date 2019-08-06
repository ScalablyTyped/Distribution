package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMitigationActionResponse extends js.Object {
  /**
    * The ARN for the new mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.undefined
  /**
    * A unique identifier for the new mitigation action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.undefined
}

object CreateMitigationActionResponse {
  @scala.inline
  def apply(actionArn: MitigationActionArn = null, actionId: MitigationActionId = null): CreateMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    if (actionArn != null) __obj.updateDynamic("actionArn")(actionArn)
    if (actionId != null) __obj.updateDynamic("actionId")(actionId)
    __obj.asInstanceOf[CreateMitigationActionResponse]
  }
}

