package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceEventStartTimeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation. 
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the event whose date and time you are modifying.
    */
  var InstanceEventId: String
  /**
    * The ID of the instance with the scheduled event.
    */
  var InstanceId: String
  /**
    * The new date and time when the event will take place.
    */
  var NotBefore: DateTime
}

object ModifyInstanceEventStartTimeRequest {
  @scala.inline
  def apply(
    InstanceEventId: String,
    InstanceId: String,
    NotBefore: DateTime,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyInstanceEventStartTimeRequest = {
    val __obj = js.Dynamic.literal(InstanceEventId = InstanceEventId, InstanceId = InstanceId, NotBefore = NotBefore)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyInstanceEventStartTimeRequest]
  }
}

