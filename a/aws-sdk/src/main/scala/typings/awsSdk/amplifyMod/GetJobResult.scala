package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResult extends js.Object {
  var job: Job = js.native
}

object GetJobResult {
  @scala.inline
  def apply(job: Job): GetJobResult = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobResult]
  }
  @scala.inline
  implicit class GetJobResultOps[Self <: GetJobResult] (val x: Self) extends AnyVal {
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
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
  }
  
}

