package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails extends StObject {
  
  /**
    * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
    */
  var Days: js.UndefOr[Integer] = js.undefined
  
  /**
    * The class of storage to change the object to after the object is noncurrent for the specified number of days.
    */
  var StorageClass: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails]
  }
  
  extension [Self <: AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails](x: Self) {
    
    inline def setDays(value: Integer): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    inline def setStorageClass(value: NonEmptyString): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
