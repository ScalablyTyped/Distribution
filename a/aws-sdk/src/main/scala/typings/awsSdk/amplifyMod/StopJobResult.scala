package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopJobResult extends js.Object {
  /**
    *  The summary for the job. 
    */
  var jobSummary: JobSummary = js.native
}

object StopJobResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StopJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobResult]
  }
}

