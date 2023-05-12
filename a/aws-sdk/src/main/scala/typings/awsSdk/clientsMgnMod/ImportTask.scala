package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTask extends StObject {
  
  /**
    * Import task creation datetime.
    */
  var creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Import task end datetime.
    */
  var endDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Import task id.
    */
  var importID: js.UndefOr[ImportID] = js.undefined
  
  /**
    * Import task progress percentage.
    */
  var progressPercentage: js.UndefOr[Float] = js.undefined
  
  /**
    * Import task s3 bucket source.
    */
  var s3BucketSource: js.UndefOr[S3BucketSource] = js.undefined
  
  /**
    * Import task status.
    */
  var status: js.UndefOr[ImportStatus] = js.undefined
  
  /**
    * Import task summary.
    */
  var summary: js.UndefOr[ImportTaskSummary] = js.undefined
}
object ImportTask {
  
  inline def apply(): ImportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTask] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setEndDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setImportID(value: ImportID): Self = StObject.set(x, "importID", value.asInstanceOf[js.Any])
    
    inline def setImportIDUndefined: Self = StObject.set(x, "importID", js.undefined)
    
    inline def setProgressPercentage(value: Float): Self = StObject.set(x, "progressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "progressPercentage", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "s3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketSourceUndefined: Self = StObject.set(x, "s3BucketSource", js.undefined)
    
    inline def setStatus(value: ImportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: ImportTaskSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
