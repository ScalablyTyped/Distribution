package typings.awsSdk.clientsBatchMod

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
  
  inline def apply(): DescribeJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsResponse]
  }
  
  extension [Self <: DescribeJobsResponse](x: Self) {
    
    inline def setJobs(value: JobDetailList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: JobDetail*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
