package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobsResponse extends js.Object {
  
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[JobDetailList] = js.native
}
object DescribeJobsResponse {
  
  @scala.inline
  def apply(): DescribeJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsResponse]
  }
  
  @scala.inline
  implicit class DescribeJobsResponseOps[Self <: DescribeJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: JobDetail*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: JobDetailList): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
  }
}
