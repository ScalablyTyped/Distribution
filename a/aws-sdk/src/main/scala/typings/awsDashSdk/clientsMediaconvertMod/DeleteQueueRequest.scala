package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueueRequest extends js.Object {
  /**
    * The name of the queue that you want to delete.
    */
  var Name: __string
}

object DeleteQueueRequest {
  @scala.inline
  def apply(Name: __string): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteQueueRequest]
  }
}

