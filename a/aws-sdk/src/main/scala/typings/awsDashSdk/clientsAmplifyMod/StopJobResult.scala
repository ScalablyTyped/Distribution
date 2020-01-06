package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopJobResult extends js.Object {
  /**
    *  Summary for the Job. 
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

