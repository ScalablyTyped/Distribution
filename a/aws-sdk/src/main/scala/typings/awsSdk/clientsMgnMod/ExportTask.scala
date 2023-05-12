package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTask extends StObject {
  
  /**
    * Export task creation datetime.
    */
  var creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Export task end datetime.
    */
  var endDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Export task id.
    */
  var exportID: js.UndefOr[ExportID] = js.undefined
  
  /**
    * Export task progress percentage.
    */
  var progressPercentage: js.UndefOr[Float] = js.undefined
  
  /**
    * Export task s3 bucket.
    */
  var s3Bucket: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * Export task s3 bucket owner.
    */
  var s3BucketOwner: js.UndefOr[AccountID] = js.undefined
  
  /**
    * Export task s3 key.
    */
  var s3Key: js.UndefOr[S3Key] = js.undefined
  
  /**
    * Export task status.
    */
  var status: js.UndefOr[ExportStatus] = js.undefined
  
  /**
    * Export task summary.
    */
  var summary: js.UndefOr[ExportTaskSummary] = js.undefined
}
object ExportTask {
  
  inline def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTask] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setEndDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setExportID(value: ExportID): Self = StObject.set(x, "exportID", value.asInstanceOf[js.Any])
    
    inline def setExportIDUndefined: Self = StObject.set(x, "exportID", js.undefined)
    
    inline def setProgressPercentage(value: Float): Self = StObject.set(x, "progressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "progressPercentage", js.undefined)
    
    inline def setS3Bucket(value: S3BucketName): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: AccountID): Self = StObject.set(x, "s3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "s3BucketOwner", js.undefined)
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
    
    inline def setStatus(value: ExportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: ExportTaskSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
