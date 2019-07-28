package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueRequest extends js.Object {
  /**
    * The name of the queue that you want information about.
    */
  var Name: __string
}

object GetQueueRequest {
  @scala.inline
  def apply(Name: __string): GetQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetQueueRequest]
  }
}

