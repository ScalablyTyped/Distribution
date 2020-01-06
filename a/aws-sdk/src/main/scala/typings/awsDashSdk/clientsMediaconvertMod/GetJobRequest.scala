package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRequest extends js.Object {
  /**
    * the job ID of the job.
    */
  var Id: __string = js.native
}

object GetJobRequest {
  @scala.inline
  def apply(Id: __string): GetJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

