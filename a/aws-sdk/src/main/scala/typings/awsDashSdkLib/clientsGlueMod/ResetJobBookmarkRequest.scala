package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetJobBookmarkRequest extends js.Object {
  /**
    * The name of the job in question.
    */
  var JobName: awsDashSdkLib.clientsGlueMod.JobName
}

object ResetJobBookmarkRequest {
  @scala.inline
  def apply(JobName: JobName): ResetJobBookmarkRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName)
  
    __obj.asInstanceOf[ResetJobBookmarkRequest]
  }
}

