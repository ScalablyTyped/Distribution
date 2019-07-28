package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobRequest extends js.Object {
  /**
    * The identifier of the job that you want to cancel. To get a list of the jobs (including their jobId) that have a status of Submitted, use the ListJobsByStatus API action.
    */
  var Id: typings.awsDashSdk.clientsElastictranscoderMod.Id
}

object CancelJobRequest {
  @scala.inline
  def apply(Id: Id): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[CancelJobRequest]
  }
}

