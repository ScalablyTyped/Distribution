package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportECSServiceRecommendationsResponse extends StObject {
  
  /**
    *  The identification number of the export job.  To view the status of an export job, use the DescribeRecommendationExportJobs action and specify the job ID. 
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  var s3Destination: js.UndefOr[S3Destination] = js.undefined
}
object ExportECSServiceRecommendationsResponse {
  
  inline def apply(): ExportECSServiceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportECSServiceRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportECSServiceRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setS3Destination(value: S3Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
