package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the log group.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Displays whether this log group has a protection policy, or whether it had one in the past. For more information, see PutDataProtectionPolicy.
    */
  var dataProtectionStatus: js.UndefOr[DataProtectionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The number of metric filters.
    */
  var metricFilterCount: js.UndefOr[FilterCount] = js.undefined
  
  var retentionInDays: js.UndefOr[Days] = js.undefined
  
  /**
    * The number of bytes stored.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.undefined
}
object LogGroup {
  
  inline def apply(): LogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogGroup] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDataProtectionStatus(value: DataProtectionStatus): Self = StObject.set(x, "dataProtectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionStatusUndefined: Self = StObject.set(x, "dataProtectionStatus", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setMetricFilterCount(value: FilterCount): Self = StObject.set(x, "metricFilterCount", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterCountUndefined: Self = StObject.set(x, "metricFilterCount", js.undefined)
    
    inline def setRetentionInDays(value: Days): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionInDaysUndefined: Self = StObject.set(x, "retentionInDays", js.undefined)
    
    inline def setStoredBytes(value: StoredBytes): Self = StObject.set(x, "storedBytes", value.asInstanceOf[js.Any])
    
    inline def setStoredBytesUndefined: Self = StObject.set(x, "storedBytes", js.undefined)
  }
}
