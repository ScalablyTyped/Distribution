package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsOutput extends js.Object {
  /**
    * A list of job objects. Each job object contains metadata describing the job.
    */
  var JobList: js.UndefOr[typings.awsDashSdk.clientsGlacierMod.JobList] = js.native
  /**
    *  An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object ListJobsOutput {
  @scala.inline
  def apply(JobList: JobList = null, Marker: String = null): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (JobList != null) __obj.updateDynamic("JobList")(JobList.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsOutput]
  }
}

