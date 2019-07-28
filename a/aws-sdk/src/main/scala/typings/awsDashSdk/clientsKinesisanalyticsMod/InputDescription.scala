package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDescription extends js.Object {
  /**
    * Returns the in-application stream names that are mapped to the stream source.
    */
  var InAppStreamNames: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InAppStreamNames] = js.undefined
  /**
    * Input ID associated with the application input. This is the ID that Amazon Kinesis Analytics assigns to each input configuration you add to your application. 
    */
  var InputId: js.UndefOr[Id] = js.undefined
  /**
    * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
    */
  var InputParallelism: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputParallelism] = js.undefined
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run.
    */
  var InputProcessingConfigurationDescription: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsMod.InputProcessingConfigurationDescription
  ] = js.undefined
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.undefined
  /**
    * Point at which the application is configured to read from the input stream.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputStartingPositionConfiguration] = js.undefined
  /**
    * If an Amazon Kinesis Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  var KinesisFirehoseInputDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.KinesisFirehoseInputDescription] = js.undefined
  /**
    * If an Amazon Kinesis stream is configured as streaming source, provides Amazon Kinesis stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  var KinesisStreamsInputDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.KinesisStreamsInputDescription] = js.undefined
  /**
    * In-application name prefix.
    */
  var NamePrefix: js.UndefOr[InAppStreamName] = js.undefined
}

object InputDescription {
  @scala.inline
  def apply(
    InAppStreamNames: InAppStreamNames = null,
    InputId: Id = null,
    InputParallelism: InputParallelism = null,
    InputProcessingConfigurationDescription: InputProcessingConfigurationDescription = null,
    InputSchema: SourceSchema = null,
    InputStartingPositionConfiguration: InputStartingPositionConfiguration = null,
    KinesisFirehoseInputDescription: KinesisFirehoseInputDescription = null,
    KinesisStreamsInputDescription: KinesisStreamsInputDescription = null,
    NamePrefix: InAppStreamName = null
  ): InputDescription = {
    val __obj = js.Dynamic.literal()
    if (InAppStreamNames != null) __obj.updateDynamic("InAppStreamNames")(InAppStreamNames)
    if (InputId != null) __obj.updateDynamic("InputId")(InputId)
    if (InputParallelism != null) __obj.updateDynamic("InputParallelism")(InputParallelism)
    if (InputProcessingConfigurationDescription != null) __obj.updateDynamic("InputProcessingConfigurationDescription")(InputProcessingConfigurationDescription)
    if (InputSchema != null) __obj.updateDynamic("InputSchema")(InputSchema)
    if (InputStartingPositionConfiguration != null) __obj.updateDynamic("InputStartingPositionConfiguration")(InputStartingPositionConfiguration)
    if (KinesisFirehoseInputDescription != null) __obj.updateDynamic("KinesisFirehoseInputDescription")(KinesisFirehoseInputDescription)
    if (KinesisStreamsInputDescription != null) __obj.updateDynamic("KinesisStreamsInputDescription")(KinesisStreamsInputDescription)
    if (NamePrefix != null) __obj.updateDynamic("NamePrefix")(NamePrefix)
    __obj.asInstanceOf[InputDescription]
  }
}

