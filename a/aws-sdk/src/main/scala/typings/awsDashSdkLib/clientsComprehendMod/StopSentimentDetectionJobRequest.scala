package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSentimentDetectionJobRequest extends js.Object {
  /**
    * The identifier of the sentiment detection job to stop.
    */
  var JobId: awsDashSdkLib.clientsComprehendMod.JobId
}

object StopSentimentDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[StopSentimentDetectionJobRequest]
  }
}

