package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails extends StObject {
  
  /**
    * The number of days after which Amazon S3 cancels an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[Integer] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails]
  }
  
  extension [Self <: AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails](x: Self) {
    
    inline def setDaysAfterInitiation(value: Integer): Self = StObject.set(x, "DaysAfterInitiation", value.asInstanceOf[js.Any])
    
    inline def setDaysAfterInitiationUndefined: Self = StObject.set(x, "DaysAfterInitiation", js.undefined)
  }
}
