package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the events detection job.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object DescribeEventsDetectionJobRequest {
  
  inline def apply(JobId: JobId): DescribeEventsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsDetectionJobRequest]
  }
  
  extension [Self <: DescribeEventsDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
