package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Describes the number of in-application streams to create. 
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
    * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
    */
  var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined
  /**
    * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined
  /**
    * The name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Kinesis Data Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with the names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
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

