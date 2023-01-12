package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobsRequest extends StObject {
  
  /**
    * A list of up to 100 job IDs.
    */
  var jobs: StringList
}
object DescribeJobsRequest {
  
  inline def apply(jobs: StringList): DescribeJobsRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: StringList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: String*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
