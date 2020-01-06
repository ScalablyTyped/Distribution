package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopStackRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object StopStackRequest {
  @scala.inline
  def apply(StackId: String): StopStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopStackRequest]
  }
}

