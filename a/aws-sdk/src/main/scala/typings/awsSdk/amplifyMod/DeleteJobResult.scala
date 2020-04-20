package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobResult extends js.Object {
  var jobSummary: JobSummary = js.native
}

object DeleteJobResult {
  @scala.inline
  def apply(jobSummary: JobSummary): DeleteJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobResult]
  }
}

