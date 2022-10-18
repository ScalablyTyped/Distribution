package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails extends StObject {
  
  /**
    * A date on which to transition objects to the specified storage class. If you provide Date, you cannot provide Days. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var Date: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of days after which to transition the object to the specified storage class. If you provide Days, you cannot provide Date.
    */
  var Days: js.UndefOr[Integer] = js.undefined
  
  /**
    * The storage class to transition the object to. Valid values are as follows:    DEEP_ARCHIVE     GLACIER     INTELLIGENT_TIERING     ONEZONE_IA     STANDARD_IA   
    */
  var StorageClass: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails]
  }
  
  extension [Self <: AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails](x: Self) {
    
    inline def setDate(value: NonEmptyString): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setDays(value: Integer): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    inline def setStorageClass(value: NonEmptyString): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
