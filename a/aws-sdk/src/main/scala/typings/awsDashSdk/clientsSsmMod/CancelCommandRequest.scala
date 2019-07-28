package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCommandRequest extends js.Object {
  /**
    * The ID of the command you want to cancel.
    */
  var CommandId: typings.awsDashSdk.clientsSsmMod.CommandId
  /**
    * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is canceled on every instance on which it was requested.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
}

object CancelCommandRequest {
  @scala.inline
  def apply(CommandId: CommandId, InstanceIds: InstanceIdList = null): CancelCommandRequest = {
    val __obj = js.Dynamic.literal(CommandId = CommandId)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    __obj.asInstanceOf[CancelCommandRequest]
  }
}

