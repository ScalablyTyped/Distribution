package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopKeyPhrasesDetectionJobRequest extends js.Object {
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: awsDashSdkLib.clientsComprehendMod.JobId
}

object StopKeyPhrasesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
  }
}

