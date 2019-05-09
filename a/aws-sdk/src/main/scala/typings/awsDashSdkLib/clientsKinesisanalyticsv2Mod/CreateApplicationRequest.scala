package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * Use this parameter to configure the application.
    */
  var ApplicationConfiguration: js.UndefOr[ApplicationConfiguration] = js.undefined
  /**
    * A summary description of the application.
    */
  var ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined
  /**
    * The name of your application (for example, sample-app).
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors. 
    */
  var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: awsDashSdkLib.clientsKinesisanalyticsv2Mod.RuntimeEnvironment
  /**
    * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  var ServiceExecutionRole: RoleARN
  /**
    * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management Guide.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
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
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any], ServiceExecutionRole = ServiceExecutionRole)
    if (ApplicationConfiguration != null) __obj.updateDynamic("ApplicationConfiguration")(ApplicationConfiguration)
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

