package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDominantLanguageDetectionJobRequest extends js.Object {
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: awsDashSdkLib.clientsComprehendMod.JobId
}

object StopDominantLanguageDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[StopDominantLanguageDetectionJobRequest]
  }
}

