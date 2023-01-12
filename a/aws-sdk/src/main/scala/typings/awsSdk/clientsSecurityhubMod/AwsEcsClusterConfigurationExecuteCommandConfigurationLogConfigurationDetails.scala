package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails extends StObject {
  
  /**
    * Whether to enable encryption on the CloudWatch logs.
    */
  var CloudWatchEncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the CloudWatch log group to send the logs to.
    */
  var CloudWatchLogGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the S3 bucket to send logs to.
    */
  var S3BucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether to encrypt the logs that are sent to the S3 bucket.
    */
  var S3EncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the folder in the S3 bucket to send the logs to.
    */
  var S3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails {
  
  inline def apply(): AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchEncryptionEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchEncryptionEnabledUndefined: Self = StObject.set(x, "CloudWatchEncryptionEnabled", js.undefined)
    
    inline def setCloudWatchLogGroupName(value: NonEmptyString): Self = StObject.set(x, "CloudWatchLogGroupName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupNameUndefined: Self = StObject.set(x, "CloudWatchLogGroupName", js.undefined)
    
    inline def setS3BucketName(value: NonEmptyString): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3EncryptionEnabled(value: Boolean): Self = StObject.set(x, "S3EncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionEnabledUndefined: Self = StObject.set(x, "S3EncryptionEnabled", js.undefined)
    
    inline def setS3KeyPrefix(value: NonEmptyString): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
