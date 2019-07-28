package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTaskStatus extends js.Object {
  /**
    * Set to true if cancellation of the task is requested.
    */
  var cancelRequested: Canceled
}

object ActivityTaskStatus {
  @scala.inline
  def apply(cancelRequested: Canceled): ActivityTaskStatus = {
    val __obj = js.Dynamic.literal(cancelRequested = cancelRequested)
  
    __obj.asInstanceOf[ActivityTaskStatus]
  }
}

