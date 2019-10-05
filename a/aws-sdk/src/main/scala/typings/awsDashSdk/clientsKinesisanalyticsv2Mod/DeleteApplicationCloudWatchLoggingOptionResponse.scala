package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {
  /**
    * The application's Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The version ID of the application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  /**
    * The descriptions of the remaining CloudWatch logging options for the application.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions
  ] = js.undefined
}

object DeleteApplicationCloudWatchLoggingOptionResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: Int | Double = null,
    CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions = null
  ): DeleteApplicationCloudWatchLoggingOptionResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN)
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionDescriptions != null) __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(CloudWatchLoggingOptionDescriptions)
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionResponse]
  }
}

