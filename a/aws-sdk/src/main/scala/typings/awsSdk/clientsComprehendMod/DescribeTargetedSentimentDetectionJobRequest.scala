package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetedSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object DescribeTargetedSentimentDetectionJobRequest {
  
  inline def apply(JobId: JobId): DescribeTargetedSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetedSentimentDetectionJobRequest]
  }
  
  extension [Self <: DescribeTargetedSentimentDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
