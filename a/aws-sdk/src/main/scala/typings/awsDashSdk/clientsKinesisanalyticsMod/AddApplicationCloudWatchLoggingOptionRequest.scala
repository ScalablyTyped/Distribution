package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Provides the CloudWatch log stream Amazon Resource Name (ARN) and the IAM role ARN. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
    */
  var CloudWatchLoggingOption: typings.awsDashSdk.clientsKinesisanalyticsMod.CloudWatchLoggingOption
  /**
    * The version ID of the Kinesis Analytics application.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}

object AddApplicationCloudWatchLoggingOptionRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CloudWatchLoggingOption: CloudWatchLoggingOption,
    CurrentApplicationVersionId: ApplicationVersionId
  ): AddApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CloudWatchLoggingOption = CloudWatchLoggingOption, CurrentApplicationVersionId = CurrentApplicationVersionId)
  
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
  }
}

