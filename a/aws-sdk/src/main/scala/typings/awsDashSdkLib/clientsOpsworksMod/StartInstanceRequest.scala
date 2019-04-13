package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object StartInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
  
    __obj.asInstanceOf[StartInstanceRequest]
  }
}

