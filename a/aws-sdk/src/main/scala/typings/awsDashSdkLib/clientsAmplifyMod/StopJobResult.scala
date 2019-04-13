package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopJobResult extends js.Object {
  /**
    *  Summary for the Job. 
    */
  var jobSummary: JobSummary
}

object StopJobResult {
  @scala.inline
  def apply(jobSummary: JobSummary): StopJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary)
  
    __obj.asInstanceOf[StopJobResult]
  }
}

