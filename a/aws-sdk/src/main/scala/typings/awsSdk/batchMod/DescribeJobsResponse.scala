package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobsResponse extends StObject {
  
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[JobDetailList] = js.undefined
}
object DescribeJobsResponse {
  
  @scala.inline
  def apply(): DescribeJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsResponse]
  }
  
  @scala.inline
  implicit class DescribeJobsResponseMutableBuilder[Self <: DescribeJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: JobDetailList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: JobDetail*): Self = StObject.set(x, "jobs", js.Array(value :_*))
  }
}
