package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobsRequest extends StObject {
  
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
  implicit class DescribeJobsRequestMutableBuilder[Self <: DescribeJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: StringList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsVarargs(value: String*): Self = StObject.set(x, "jobs", js.Array(value :_*))
  }
}
