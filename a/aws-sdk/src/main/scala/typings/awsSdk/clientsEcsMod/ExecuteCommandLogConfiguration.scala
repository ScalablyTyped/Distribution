package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandLogConfiguration extends StObject {
  
  /**
    * Determines whether to use encryption on the CloudWatch logs. If not specified, encryption will be off.
    */
  var cloudWatchEncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the CloudWatch log group to send logs to.  The CloudWatch log group must already be created. 
    */
  var cloudWatchLogGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the S3 bucket to send logs to.  The S3 bucket must already be created. 
    */
  var s3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether to use encryption on the S3 logs. If not specified, encryption is not used.
    */
  var s3EncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional folder in the S3 bucket to place logs in.
    */
  var s3KeyPrefix: js.UndefOr[String] = js.undefined
}
object ExecuteCommandLogConfiguration {
  
  inline def apply(): ExecuteCommandLogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteCommandLogConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteCommandLogConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchEncryptionEnabled(value: Boolean): Self = StObject.set(x, "cloudWatchEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchEncryptionEnabledUndefined: Self = StObject.set(x, "cloudWatchEncryptionEnabled", js.undefined)
    
    inline def setCloudWatchLogGroupName(value: String): Self = StObject.set(x, "cloudWatchLogGroupName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupNameUndefined: Self = StObject.set(x, "cloudWatchLogGroupName", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    inline def setS3EncryptionEnabled(value: Boolean): Self = StObject.set(x, "s3EncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionEnabledUndefined: Self = StObject.set(x, "s3EncryptionEnabled", js.undefined)
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
  }
}
