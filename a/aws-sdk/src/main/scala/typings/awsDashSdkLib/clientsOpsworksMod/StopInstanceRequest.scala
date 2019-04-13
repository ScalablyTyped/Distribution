package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopInstanceRequest extends js.Object {
  /**
    * Specifies whether to force an instance to stop.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object StopInstanceRequest {
  @scala.inline
  def apply(InstanceId: String, Force: js.UndefOr[Boolean] = js.undefined): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    __obj.asInstanceOf[StopInstanceRequest]
  }
}

