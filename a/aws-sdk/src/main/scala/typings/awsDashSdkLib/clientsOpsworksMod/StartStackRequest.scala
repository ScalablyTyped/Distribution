package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartStackRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String
}

object StartStackRequest {
  @scala.inline
  def apply(StackId: String): StartStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
  
    __obj.asInstanceOf[StartStackRequest]
  }
}

