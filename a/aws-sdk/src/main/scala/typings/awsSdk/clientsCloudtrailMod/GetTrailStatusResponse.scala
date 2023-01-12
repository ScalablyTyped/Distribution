package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrailStatusResponse extends StObject {
  
  /**
    * Whether the CloudTrail trail is currently logging Amazon Web Services API calls.
    */
  var IsLogging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined
  
  /**
    * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This field is no longer in use.
    */
  var LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.undefined
  
  /**
    * This field is no longer in use.
    */
  var LatestDeliveryAttemptTime: js.UndefOr[String] = js.undefined
  
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated bucket. For more information, see Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket, and does not occur for requests that time out. To resolve the issue, create a new bucket, and then call UpdateTrail to specify the new bucket; or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDeliveryError: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
    */
  var LatestDeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the designated bucket. For more information, see Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket, and does not occur for requests that time out. To resolve the issue, create a new bucket, and then call UpdateTrail to specify the new bucket; or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDigestDeliveryError: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
    */
  var LatestDigestDeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This field is no longer in use.
    */
  var LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined
  
  /**
    * This field is no longer in use.
    */
  var LatestNotificationAttemptTime: js.UndefOr[String] = js.undefined
  
  /**
    * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more information about Amazon SNS errors, see the Amazon SNS Developer Guide. 
    */
  var LatestNotificationError: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file to an account's Amazon S3 bucket.
    */
  var LatestNotificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the most recent date and time when CloudTrail started recording API calls for an Amazon Web Services account.
    */
  var StartLoggingTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the most recent date and time when CloudTrail stopped recording API calls for an Amazon Web Services account.
    */
  var StopLoggingTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This field is no longer in use.
    */
  var TimeLoggingStarted: js.UndefOr[String] = js.undefined
  
  /**
    * This field is no longer in use.
    */
  var TimeLoggingStopped: js.UndefOr[String] = js.undefined
}
object GetTrailStatusResponse {
  
  inline def apply(): GetTrailStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTrailStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setIsLogging(value: Boolean): Self = StObject.set(x, "IsLogging", value.asInstanceOf[js.Any])
    
    inline def setIsLoggingUndefined: Self = StObject.set(x, "IsLogging", js.undefined)
    
    inline def setLatestCloudWatchLogsDeliveryError(value: String): Self = StObject.set(x, "LatestCloudWatchLogsDeliveryError", value.asInstanceOf[js.Any])
    
    inline def setLatestCloudWatchLogsDeliveryErrorUndefined: Self = StObject.set(x, "LatestCloudWatchLogsDeliveryError", js.undefined)
    
    inline def setLatestCloudWatchLogsDeliveryTime(value: js.Date): Self = StObject.set(x, "LatestCloudWatchLogsDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setLatestCloudWatchLogsDeliveryTimeUndefined: Self = StObject.set(x, "LatestCloudWatchLogsDeliveryTime", js.undefined)
    
    inline def setLatestDeliveryAttemptSucceeded(value: String): Self = StObject.set(x, "LatestDeliveryAttemptSucceeded", value.asInstanceOf[js.Any])
    
    inline def setLatestDeliveryAttemptSucceededUndefined: Self = StObject.set(x, "LatestDeliveryAttemptSucceeded", js.undefined)
    
    inline def setLatestDeliveryAttemptTime(value: String): Self = StObject.set(x, "LatestDeliveryAttemptTime", value.asInstanceOf[js.Any])
    
    inline def setLatestDeliveryAttemptTimeUndefined: Self = StObject.set(x, "LatestDeliveryAttemptTime", js.undefined)
    
    inline def setLatestDeliveryError(value: String): Self = StObject.set(x, "LatestDeliveryError", value.asInstanceOf[js.Any])
    
    inline def setLatestDeliveryErrorUndefined: Self = StObject.set(x, "LatestDeliveryError", js.undefined)
    
    inline def setLatestDeliveryTime(value: js.Date): Self = StObject.set(x, "LatestDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setLatestDeliveryTimeUndefined: Self = StObject.set(x, "LatestDeliveryTime", js.undefined)
    
    inline def setLatestDigestDeliveryError(value: String): Self = StObject.set(x, "LatestDigestDeliveryError", value.asInstanceOf[js.Any])
    
    inline def setLatestDigestDeliveryErrorUndefined: Self = StObject.set(x, "LatestDigestDeliveryError", js.undefined)
    
    inline def setLatestDigestDeliveryTime(value: js.Date): Self = StObject.set(x, "LatestDigestDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setLatestDigestDeliveryTimeUndefined: Self = StObject.set(x, "LatestDigestDeliveryTime", js.undefined)
    
    inline def setLatestNotificationAttemptSucceeded(value: String): Self = StObject.set(x, "LatestNotificationAttemptSucceeded", value.asInstanceOf[js.Any])
    
    inline def setLatestNotificationAttemptSucceededUndefined: Self = StObject.set(x, "LatestNotificationAttemptSucceeded", js.undefined)
    
    inline def setLatestNotificationAttemptTime(value: String): Self = StObject.set(x, "LatestNotificationAttemptTime", value.asInstanceOf[js.Any])
    
    inline def setLatestNotificationAttemptTimeUndefined: Self = StObject.set(x, "LatestNotificationAttemptTime", js.undefined)
    
    inline def setLatestNotificationError(value: String): Self = StObject.set(x, "LatestNotificationError", value.asInstanceOf[js.Any])
    
    inline def setLatestNotificationErrorUndefined: Self = StObject.set(x, "LatestNotificationError", js.undefined)
    
    inline def setLatestNotificationTime(value: js.Date): Self = StObject.set(x, "LatestNotificationTime", value.asInstanceOf[js.Any])
    
    inline def setLatestNotificationTimeUndefined: Self = StObject.set(x, "LatestNotificationTime", js.undefined)
    
    inline def setStartLoggingTime(value: js.Date): Self = StObject.set(x, "StartLoggingTime", value.asInstanceOf[js.Any])
    
    inline def setStartLoggingTimeUndefined: Self = StObject.set(x, "StartLoggingTime", js.undefined)
    
    inline def setStopLoggingTime(value: js.Date): Self = StObject.set(x, "StopLoggingTime", value.asInstanceOf[js.Any])
    
    inline def setStopLoggingTimeUndefined: Self = StObject.set(x, "StopLoggingTime", js.undefined)
    
    inline def setTimeLoggingStarted(value: String): Self = StObject.set(x, "TimeLoggingStarted", value.asInstanceOf[js.Any])
    
    inline def setTimeLoggingStartedUndefined: Self = StObject.set(x, "TimeLoggingStarted", js.undefined)
    
    inline def setTimeLoggingStopped(value: String): Self = StObject.set(x, "TimeLoggingStopped", value.asInstanceOf[js.Any])
    
    inline def setTimeLoggingStoppedUndefined: Self = StObject.set(x, "TimeLoggingStopped", js.undefined)
  }
}
