package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object RebootInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
  
    __obj.asInstanceOf[RebootInstanceRequest]
  }
}

