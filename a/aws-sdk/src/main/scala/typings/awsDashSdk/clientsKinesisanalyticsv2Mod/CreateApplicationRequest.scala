package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationRequest extends js.Object {
  /**
    * Use this parameter to configure the application.
    */
  var ApplicationConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationConfiguration] = js.native
  /**
    * A summary description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationDescription] = js.native
  /**
    * The name of your application (for example, sample-app).
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors. 
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptions] = js.native
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  /**
    * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  var ServiceExecutionRole: RoleARN = js.native
  /**
    * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.Tags] = js.native
}

object CreateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    RuntimeEnvironment: RuntimeEnvironment,
    ServiceExecutionRole: RoleARN,
    ApplicationConfiguration: ApplicationConfiguration = null,
    ApplicationDescription: ApplicationDescription = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    Tags: Tags = null
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any], ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    if (ApplicationConfiguration != null) __obj.updateDynamic("ApplicationConfiguration")(ApplicationConfiguration.asInstanceOf[js.Any])
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

