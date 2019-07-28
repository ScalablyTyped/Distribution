package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStackRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String
}

object DeleteStackRequest {
  @scala.inline
  def apply(StackId: String): DeleteStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
  
    __obj.asInstanceOf[DeleteStackRequest]
  }
}

