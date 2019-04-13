package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Describes the number of in-application streams to create.  Data from your source is routed to these in-application input streams.  (see Configuring Application Input.
    */
  var InputParallelism: js.UndefOr[InputParallelism] = js.undefined
  /**
    * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor.
    */
  var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
    */
  var InputSchema: SourceSchema
  /**
    * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
    */
  var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined
  /**
    * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
    */
  var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined
  /**
    * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
    */
  var NamePrefix: InAppStreamName
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
    val __obj = js.Dynamic.literal(InputSchema = InputSchema, NamePrefix = NamePrefix)
    if (InputParallelism != null) __obj.updateDynamic("InputParallelism")(InputParallelism)
    if (InputProcessingConfiguration != null) __obj.updateDynamic("InputProcessingConfiguration")(InputProcessingConfiguration)
    if (KinesisFirehoseInput != null) __obj.updateDynamic("KinesisFirehoseInput")(KinesisFirehoseInput)
    if (KinesisStreamsInput != null) __obj.updateDynamic("KinesisStreamsInput")(KinesisStreamsInput)
    __obj.asInstanceOf[Input]
  }
}

