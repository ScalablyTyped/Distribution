package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueueRequest extends js.Object {
  /**
    * The name of the queue that you want to delete.
    */
  var Name: __string = js.native
}

object DeleteQueueRequest {
  @scala.inline
  def apply(Name: __string): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteQueueRequest]
  }
}

