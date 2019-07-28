package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object DeregisterInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): DeregisterInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
  
    __obj.asInstanceOf[DeregisterInstanceRequest]
  }
}

