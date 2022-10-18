package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketDetails extends StObject {
  
  /**
    * The access control list for the S3 bucket.
    */
  var AccessControlList: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The lifecycle configuration for objects in the S3 bucket.
    */
  var BucketLifecycleConfiguration: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationDetails] = js.undefined
  
  /**
    * The logging configuration for the S3 bucket.
    */
  var BucketLoggingConfiguration: js.UndefOr[AwsS3BucketLoggingConfiguration] = js.undefined
  
  /**
    * The notification configuration for the S3 bucket.
    */
  var BucketNotificationConfiguration: js.UndefOr[AwsS3BucketNotificationConfiguration] = js.undefined
  
  /**
    * The versioning state of an S3 bucket.
    */
  var BucketVersioningConfiguration: js.UndefOr[AwsS3BucketBucketVersioningConfiguration] = js.undefined
  
  /**
    * The website configuration parameters for the S3 bucket.
    */
  var BucketWebsiteConfiguration: js.UndefOr[AwsS3BucketWebsiteConfiguration] = js.undefined
  
  /**
    * Indicates when the S3 bucket was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services account identifier of the account that owns the S3 bucket.
    */
  var OwnerAccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The display name of the owner of the S3 bucket.
    */
  var OwnerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[AwsS3AccountPublicAccessBlockDetails] = js.undefined
  
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[AwsS3BucketServerSideEncryptionConfiguration] = js.undefined
}
object AwsS3BucketDetails {
  
  inline def apply(): AwsS3BucketDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketDetails]
  }
  
  extension [Self <: AwsS3BucketDetails](x: Self) {
    
    inline def setAccessControlList(value: NonEmptyString): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setBucketLifecycleConfiguration(value: AwsS3BucketBucketLifecycleConfigurationDetails): Self = StObject.set(x, "BucketLifecycleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBucketLifecycleConfigurationUndefined: Self = StObject.set(x, "BucketLifecycleConfiguration", js.undefined)
    
    inline def setBucketLoggingConfiguration(value: AwsS3BucketLoggingConfiguration): Self = StObject.set(x, "BucketLoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBucketLoggingConfigurationUndefined: Self = StObject.set(x, "BucketLoggingConfiguration", js.undefined)
    
    inline def setBucketNotificationConfiguration(value: AwsS3BucketNotificationConfiguration): Self = StObject.set(x, "BucketNotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBucketNotificationConfigurationUndefined: Self = StObject.set(x, "BucketNotificationConfiguration", js.undefined)
    
    inline def setBucketVersioningConfiguration(value: AwsS3BucketBucketVersioningConfiguration): Self = StObject.set(x, "BucketVersioningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBucketVersioningConfigurationUndefined: Self = StObject.set(x, "BucketVersioningConfiguration", js.undefined)
    
    inline def setBucketWebsiteConfiguration(value: AwsS3BucketWebsiteConfiguration): Self = StObject.set(x, "BucketWebsiteConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBucketWebsiteConfigurationUndefined: Self = StObject.set(x, "BucketWebsiteConfiguration", js.undefined)
    
    inline def setCreatedAt(value: NonEmptyString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setOwnerAccountId(value: NonEmptyString): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setOwnerName(value: NonEmptyString): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    inline def setPublicAccessBlockConfiguration(value: AwsS3AccountPublicAccessBlockDetails): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
    
    inline def setServerSideEncryptionConfiguration(value: AwsS3BucketServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
  }
}
