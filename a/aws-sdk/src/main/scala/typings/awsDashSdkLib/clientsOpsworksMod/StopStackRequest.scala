package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopStackRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String
}

object StopStackRequest {
  @scala.inline
  def apply(StackId: String): StopStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
  
    __obj.asInstanceOf[StopStackRequest]
  }
}

