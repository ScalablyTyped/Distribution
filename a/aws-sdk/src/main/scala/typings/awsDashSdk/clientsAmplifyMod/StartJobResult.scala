package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartJobResult extends js.Object {
  /**
    *  Summary for the Job. 
    */
  var jobSummary: JobSummary
}

object StartJobResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StartJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary)
  
    __obj.asInstanceOf[StartJobResult]
  }
}

