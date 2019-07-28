package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * The CloudWatchLoggingOptionId of the CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
    */
  var CloudWatchLoggingOptionId: Id
  /**
    * The version ID of the Kinesis Analytics application.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}

object DeleteApplicationCloudWatchLoggingOptionRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CloudWatchLoggingOptionId: Id,
    CurrentApplicationVersionId: ApplicationVersionId
  ): DeleteApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CloudWatchLoggingOptionId = CloudWatchLoggingOptionId, CurrentApplicationVersionId = CurrentApplicationVersionId)
  
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
  }
}

