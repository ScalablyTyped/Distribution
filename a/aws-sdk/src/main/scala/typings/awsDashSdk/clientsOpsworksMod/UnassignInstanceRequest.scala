package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnassignInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object UnassignInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): UnassignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
  
    __obj.asInstanceOf[UnassignInstanceRequest]
  }
}

