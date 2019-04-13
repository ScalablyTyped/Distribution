package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String
  /**
    * The layer ID, which must correspond to a custom layer. You cannot assign a registered instance to a built-in layer.
    */
  var LayerIds: Strings
}

object AssignInstanceRequest {
  @scala.inline
  def apply(InstanceId: String, LayerIds: Strings): AssignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, LayerIds = LayerIds)
  
    __obj.asInstanceOf[AssignInstanceRequest]
  }
}

