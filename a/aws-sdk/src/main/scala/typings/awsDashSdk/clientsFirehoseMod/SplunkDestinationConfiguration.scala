package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplunkDestinationConfiguration extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  /**
    * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
    */
  var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.HECAcknowledgmentTimeoutInSeconds] = js.undefined
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
    */
  var HECEndpoint: typings.awsDashSdk.clientsFirehoseMod.HECEndpoint
  /**
    * This type can be either "Raw" or "Event."
    */
  var HECEndpointType: typings.awsDashSdk.clientsFirehoseMod.HECEndpointType
  /**
    * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var HECToken: typings.awsDashSdk.clientsFirehoseMod.HECToken
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
    */
  var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined
  /**
    * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
    */
  var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
  /**
    * The configuration for the backup Amazon S3 location.
    */
  var S3Configuration: S3DestinationConfiguration
}

object SplunkDestinationConfiguration {
  @scala.inline
  def apply(
    HECEndpoint: HECEndpoint,
    HECEndpointType: HECEndpointType,
    HECToken: HECToken,
    S3Configuration: S3DestinationConfiguration,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    HECAcknowledgmentTimeoutInSeconds: Int | Double = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: SplunkRetryOptions = null,
    S3BackupMode: SplunkS3BackupMode = null
  ): SplunkDestinationConfiguration = {
    val __obj = js.Dynamic.literal(HECEndpoint = HECEndpoint, HECEndpointType = HECEndpointType.asInstanceOf[js.Any], HECToken = HECToken, S3Configuration = S3Configuration)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (HECAcknowledgmentTimeoutInSeconds != null) __obj.updateDynamic("HECAcknowledgmentTimeoutInSeconds")(HECAcknowledgmentTimeoutInSeconds.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplunkDestinationConfiguration]
  }
}

