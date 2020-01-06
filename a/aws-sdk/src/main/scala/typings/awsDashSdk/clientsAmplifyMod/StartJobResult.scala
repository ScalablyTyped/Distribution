package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobResult extends js.Object {
  /**
    *  Summary for the Job. 
    */
  var jobSummary: JobSummary = js.native
}

object StartJobResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StartJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartJobResult]
  }
}

