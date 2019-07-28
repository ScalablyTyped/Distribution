package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobRequest extends js.Object {
  /**
    * The Job ID of the job to be cancelled.
    */
  var Id: __string
}

object CancelJobRequest {
  @scala.inline
  def apply(Id: __string): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[CancelJobRequest]
  }
}

