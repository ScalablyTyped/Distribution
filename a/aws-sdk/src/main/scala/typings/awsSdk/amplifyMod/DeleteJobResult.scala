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
  @scala.inline
  implicit class DeleteJobResultOps[Self <: DeleteJobResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobSummary(value: JobSummary): Self = this.set("jobSummary", value.asInstanceOf[js.Any])
  }
  
}

