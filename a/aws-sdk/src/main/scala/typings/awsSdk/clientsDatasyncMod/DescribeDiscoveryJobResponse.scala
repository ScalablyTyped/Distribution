package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDiscoveryJobResponse extends StObject {
  
  /**
    * The number of minutes that the discovery job runs.
    */
  var CollectionDurationMinutes: js.UndefOr[typings.awsSdk.clientsDatasyncMod.CollectionDurationMinutes] = js.undefined
  
  /**
    * The ARN of the discovery job.
    */
  var DiscoveryJobArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn] = js.undefined
  
  /**
    * The time when the discovery job ended.
    */
  var JobEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the discovery job started.
    */
  var JobStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the status of a discovery job. For more information, see Discovery job statuses.
    */
  var Status: js.UndefOr[DiscoveryJobStatus] = js.undefined
  
  /**
    * The ARN of the on-premises storage system you're running the discovery job on.
    */
  var StorageSystemArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.StorageSystemArn] = js.undefined
}
object DescribeDiscoveryJobResponse {
  
  inline def apply(): DescribeDiscoveryJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDiscoveryJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDiscoveryJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionDurationMinutes(value: CollectionDurationMinutes): Self = StObject.set(x, "CollectionDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setCollectionDurationMinutesUndefined: Self = StObject.set(x, "CollectionDurationMinutes", js.undefined)
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryJobArnUndefined: Self = StObject.set(x, "DiscoveryJobArn", js.undefined)
    
    inline def setJobEndTime(value: js.Date): Self = StObject.set(x, "JobEndTime", value.asInstanceOf[js.Any])
    
    inline def setJobEndTimeUndefined: Self = StObject.set(x, "JobEndTime", js.undefined)
    
    inline def setJobStartTime(value: js.Date): Self = StObject.set(x, "JobStartTime", value.asInstanceOf[js.Any])
    
    inline def setJobStartTimeUndefined: Self = StObject.set(x, "JobStartTime", js.undefined)
    
    inline def setStatus(value: DiscoveryJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
    
    inline def setStorageSystemArnUndefined: Self = StObject.set(x, "StorageSystemArn", js.undefined)
  }
}
