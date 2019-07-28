package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
  /**
    * The application name.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The CloudWatchLoggingOptionId of the Amazon CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
    */
  var CloudWatchLoggingOptionId: Id
  /**
    * The version ID of the application. You can retrieve the application version ID using DescribeApplication.
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

