package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntitiesDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object DescribeEntitiesDetectionJobRequest {
  
  inline def apply(JobId: JobId): DescribeEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntitiesDetectionJobRequest]
  }
  
  extension [Self <: DescribeEntitiesDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
