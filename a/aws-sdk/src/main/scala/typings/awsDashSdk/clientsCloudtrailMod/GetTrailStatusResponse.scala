package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTrailStatusResponse extends js.Object {
  /**
    * Whether the CloudTrail is currently logging AWS API calls.
    */
  var IsLogging: js.UndefOr[Boolean] = js.undefined
  /**
    * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined
  /**
    * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryTime: js.UndefOr[_Date] = js.undefined
  /**
    * This field is deprecated.
    */
  var LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.undefined
  /**
    * This field is deprecated.
    */
  var LatestDeliveryAttemptTime: js.UndefOr[String] = js.undefined
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDeliveryError: js.UndefOr[String] = js.undefined
  /**
    * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
    */
  var LatestDeliveryTime: js.UndefOr[_Date] = js.undefined
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDigestDeliveryError: js.UndefOr[String] = js.undefined
  /**
    * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
    */
  var LatestDigestDeliveryTime: js.UndefOr[_Date] = js.undefined
  /**
    * This field is deprecated.
    */
  var LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined
  /**
    * This field is deprecated.
    */
  var LatestNotificationAttemptTime: js.UndefOr[String] = js.undefined
  /**
    * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more information about Amazon SNS errors, see the Amazon SNS Developer Guide. 
    */
  var LatestNotificationError: js.UndefOr[String] = js.undefined
  /**
    * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file to an account's Amazon S3 bucket.
    */
  var LatestNotificationTime: js.UndefOr[_Date] = js.undefined
  /**
    * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
    */
  var StartLoggingTime: js.UndefOr[_Date] = js.undefined
  /**
    * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
    */
  var StopLoggingTime: js.UndefOr[_Date] = js.undefined
  /**
    * This field is deprecated.
    */
  var TimeLoggingStarted: js.UndefOr[String] = js.undefined
  /**
    * This field is deprecated.
    */
  var TimeLoggingStopped: js.UndefOr[String] = js.undefined
}

object GetTrailStatusResponse {
  @scala.inline
  def apply(
    IsLogging: js.UndefOr[scala.Boolean] = js.undefined,
    LatestCloudWatchLogsDeliveryError: String = null,
    LatestCloudWatchLogsDeliveryTime: _Date = null,
    LatestDeliveryAttemptSucceeded: String = null,
    LatestDeliveryAttemptTime: String = null,
    LatestDeliveryError: String = null,
    LatestDeliveryTime: _Date = null,
    LatestDigestDeliveryError: String = null,
    LatestDigestDeliveryTime: _Date = null,
    LatestNotificationAttemptSucceeded: String = null,
    LatestNotificationAttemptTime: String = null,
    LatestNotificationError: String = null,
    LatestNotificationTime: _Date = null,
    StartLoggingTime: _Date = null,
    StopLoggingTime: _Date = null,
    TimeLoggingStarted: String = null,
    TimeLoggingStopped: String = null
  ): GetTrailStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsLogging)) __obj.updateDynamic("IsLogging")(IsLogging)
    if (LatestCloudWatchLogsDeliveryError != null) __obj.updateDynamic("LatestCloudWatchLogsDeliveryError")(LatestCloudWatchLogsDeliveryError)
    if (LatestCloudWatchLogsDeliveryTime != null) __obj.updateDynamic("LatestCloudWatchLogsDeliveryTime")(LatestCloudWatchLogsDeliveryTime)
    if (LatestDeliveryAttemptSucceeded != null) __obj.updateDynamic("LatestDeliveryAttemptSucceeded")(LatestDeliveryAttemptSucceeded)
    if (LatestDeliveryAttemptTime != null) __obj.updateDynamic("LatestDeliveryAttemptTime")(LatestDeliveryAttemptTime)
    if (LatestDeliveryError != null) __obj.updateDynamic("LatestDeliveryError")(LatestDeliveryError)
    if (LatestDeliveryTime != null) __obj.updateDynamic("LatestDeliveryTime")(LatestDeliveryTime)
    if (LatestDigestDeliveryError != null) __obj.updateDynamic("LatestDigestDeliveryError")(LatestDigestDeliveryError)
    if (LatestDigestDeliveryTime != null) __obj.updateDynamic("LatestDigestDeliveryTime")(LatestDigestDeliveryTime)
    if (LatestNotificationAttemptSucceeded != null) __obj.updateDynamic("LatestNotificationAttemptSucceeded")(LatestNotificationAttemptSucceeded)
    if (LatestNotificationAttemptTime != null) __obj.updateDynamic("LatestNotificationAttemptTime")(LatestNotificationAttemptTime)
    if (LatestNotificationError != null) __obj.updateDynamic("LatestNotificationError")(LatestNotificationError)
    if (LatestNotificationTime != null) __obj.updateDynamic("LatestNotificationTime")(LatestNotificationTime)
    if (StartLoggingTime != null) __obj.updateDynamic("StartLoggingTime")(StartLoggingTime)
    if (StopLoggingTime != null) __obj.updateDynamic("StopLoggingTime")(StopLoggingTime)
    if (TimeLoggingStarted != null) __obj.updateDynamic("TimeLoggingStarted")(TimeLoggingStarted)
    if (TimeLoggingStopped != null) __obj.updateDynamic("TimeLoggingStopped")(TimeLoggingStopped)
    __obj.asInstanceOf[GetTrailStatusResponse]
  }
}

