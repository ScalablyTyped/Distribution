package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInputRequest extends js.Object {
  /**
    * Unique ID of the input
    */
  var InputId: __string
}

object DeleteInputRequest {
  @scala.inline
  def apply(InputId: __string): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId)
  
    __obj.asInstanceOf[DeleteInputRequest]
  }
}

