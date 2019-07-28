package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobResult extends js.Object {
  var jobSummary: JobSummary
}

object DeleteJobResult {
  @scala.inline
  def apply(jobSummary: JobSummary): DeleteJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary)
  
    __obj.asInstanceOf[DeleteJobResult]
  }
}

