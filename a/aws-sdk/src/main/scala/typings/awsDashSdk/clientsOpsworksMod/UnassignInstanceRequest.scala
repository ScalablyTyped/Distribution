package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnassignInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object UnassignInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): UnassignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnassignInstanceRequest]
  }
}

