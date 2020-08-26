package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobsRequest extends js.Object {
  /**
    * A list of up to 100 job IDs.
    */
  var jobs: StringList = js.native
}

object DescribeJobsRequest {
  @scala.inline
  def apply(jobs: StringList): DescribeJobsRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobsRequest]
  }
  @scala.inline
  implicit class DescribeJobsRequestOps[Self <: DescribeJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobsVarargs(value: String*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: StringList): Self = this.set("jobs", value.asInstanceOf[js.Any])
  }
  
}

