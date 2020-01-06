package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  /**
    * Describes the number of in-application streams to create. 
    */
  var InputParallelism: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputParallelism] = js.native
  /**
    * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor. 
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfiguration] = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
    */
  var InputSchema: SourceSchema = js.native
  /**
    * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
    */
  var KinesisFirehoseInput: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseInput] = js.native
  /**
    * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInput: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsInput] = js.native
  /**
    * The name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Kinesis Data Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with the names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
    */
  var NamePrefix: InAppStreamName = js.native
}

object Input {
  @scala.inline
  def apply(
    InputSchema: SourceSchema,
    NamePrefix: InAppStreamName,
    InputParallelism: InputParallelism = null,
    InputProcessingConfiguration: InputProcessingConfiguration = null,
    KinesisFirehoseInput: KinesisFirehoseInput = null,
    KinesisStreamsInput: KinesisStreamsInput = null
  ): Input = {
    val __obj = js.Dynamic.literal(InputSchema = InputSchema.asInstanceOf[js.Any], NamePrefix = NamePrefix.asInstanceOf[js.Any])
    if (InputParallelism != null) __obj.updateDynamic("InputParallelism")(InputParallelism.asInstanceOf[js.Any])
    if (InputProcessingConfiguration != null) __obj.updateDynamic("InputProcessingConfiguration")(InputProcessingConfiguration.asInstanceOf[js.Any])
    if (KinesisFirehoseInput != null) __obj.updateDynamic("KinesisFirehoseInput")(KinesisFirehoseInput.asInstanceOf[js.Any])
    if (KinesisStreamsInput != null) __obj.updateDynamic("KinesisStreamsInput")(KinesisStreamsInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

