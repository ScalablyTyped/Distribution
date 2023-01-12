package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationReportDetails extends StObject {
  
  /**
    *  The time that the recommendation report generation task completes. 
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The S3 bucket where the report file is located. 
    */
  var s3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    *  The Amazon S3 key name of the report file. 
    */
  var s3Keys: js.UndefOr[S3Keys] = js.undefined
  
  /**
    *  The time that the recommendation report generation task starts. 
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of the recommendation report generation task. 
    */
  var status: js.UndefOr[RecommendationReportStatus] = js.undefined
  
  /**
    *  The status message for recommendation report generation. 
    */
  var statusMessage: js.UndefOr[RecommendationReportStatusMessage] = js.undefined
}
object RecommendationReportDetails {
  
  inline def apply(): RecommendationReportDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationReportDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationReportDetails] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Keys(value: S3Keys): Self = StObject.set(x, "s3Keys", value.asInstanceOf[js.Any])
    
    inline def setS3KeysUndefined: Self = StObject.set(x, "s3Keys", js.undefined)
    
    inline def setS3KeysVarargs(value: String*): Self = StObject.set(x, "s3Keys", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: RecommendationReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: RecommendationReportStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
