package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreImageTaskResult extends StObject {
  
  /**
    * The ID of the AMI that is being stored.
    */
  var AmiId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket that contains the stored AMI object.
    */
  var Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The progress of the task as a percentage.
    */
  var ProgressPercentage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the stored AMI object in the bucket.
    */
  var S3objectKey: js.UndefOr[String] = js.undefined
  
  /**
    * If the tasks fails, the reason for the failure is returned. If the task succeeds, null is returned.
    */
  var StoreTaskFailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the store task (InProgress, Completed, or Failed).
    */
  var StoreTaskState: js.UndefOr[String] = js.undefined
  
  /**
    * The time the task started.
    */
  var TaskStartTime: js.UndefOr[js.Date] = js.undefined
}
object StoreImageTaskResult {
  
  inline def apply(): StoreImageTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreImageTaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreImageTaskResult] (val x: Self) extends AnyVal {
    
    inline def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setProgressPercentage(value: Integer): Self = StObject.set(x, "ProgressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "ProgressPercentage", js.undefined)
    
    inline def setS3objectKey(value: String): Self = StObject.set(x, "S3objectKey", value.asInstanceOf[js.Any])
    
    inline def setS3objectKeyUndefined: Self = StObject.set(x, "S3objectKey", js.undefined)
    
    inline def setStoreTaskFailureReason(value: String): Self = StObject.set(x, "StoreTaskFailureReason", value.asInstanceOf[js.Any])
    
    inline def setStoreTaskFailureReasonUndefined: Self = StObject.set(x, "StoreTaskFailureReason", js.undefined)
    
    inline def setStoreTaskState(value: String): Self = StObject.set(x, "StoreTaskState", value.asInstanceOf[js.Any])
    
    inline def setStoreTaskStateUndefined: Self = StObject.set(x, "StoreTaskState", js.undefined)
    
    inline def setTaskStartTime(value: js.Date): Self = StObject.set(x, "TaskStartTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStartTimeUndefined: Self = StObject.set(x, "TaskStartTime", js.undefined)
  }
}
