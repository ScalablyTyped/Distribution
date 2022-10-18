package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrailResponse extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the trail exists in one region or in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the trail is an organization trail.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the following format.  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether log file integrity validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the trail.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
    */
  var SnsTopicARN: js.UndefOr[String] = js.undefined
  
  /**
    * This field is no longer in use. Use SnsTopicARN.
    */
  var SnsTopicName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ARN of the trail that was created. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}
object CreateTrailResponse {
  
  inline def apply(): CreateTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrailResponse]
  }
  
  extension [Self <: CreateTrailResponse](x: Self) {
    
    inline def setCloudWatchLogsLogGroupArn(value: String): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    inline def setCloudWatchLogsRoleArn(value: String): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "CloudWatchLogsRoleArn", js.undefined)
    
    inline def setIncludeGlobalServiceEvents(value: Boolean): Self = StObject.set(x, "IncludeGlobalServiceEvents", value.asInstanceOf[js.Any])
    
    inline def setIncludeGlobalServiceEventsUndefined: Self = StObject.set(x, "IncludeGlobalServiceEvents", js.undefined)
    
    inline def setIsMultiRegionTrail(value: Boolean): Self = StObject.set(x, "IsMultiRegionTrail", value.asInstanceOf[js.Any])
    
    inline def setIsMultiRegionTrailUndefined: Self = StObject.set(x, "IsMultiRegionTrail", js.undefined)
    
    inline def setIsOrganizationTrail(value: Boolean): Self = StObject.set(x, "IsOrganizationTrail", value.asInstanceOf[js.Any])
    
    inline def setIsOrganizationTrailUndefined: Self = StObject.set(x, "IsOrganizationTrail", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLogFileValidationEnabled(value: Boolean): Self = StObject.set(x, "LogFileValidationEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogFileValidationEnabledUndefined: Self = StObject.set(x, "LogFileValidationEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    inline def setSnsTopicARN(value: String): Self = StObject.set(x, "SnsTopicARN", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicARNUndefined: Self = StObject.set(x, "SnsTopicARN", js.undefined)
    
    inline def setSnsTopicName(value: String): Self = StObject.set(x, "SnsTopicName", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicNameUndefined: Self = StObject.set(x, "SnsTopicName", js.undefined)
    
    inline def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    inline def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
