package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputUpdate extends js.Object {
  /**
    * Input ID of the application input to be updated.
    */
  var InputId: Id
  /**
    * Describes the parallelism updates (the number in-application streams Amazon Kinesis Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputParallelismUpdate] = js.undefined
  /**
    * Describes updates for an input processing configuration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputProcessingConfigurationUpdate] = js.undefined
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputSchemaUpdate] = js.undefined
  /**
    * If an Amazon Kinesis Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN and IAM role ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.KinesisFirehoseInputUpdate] = js.undefined
  /**
    * If an Amazon Kinesis stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN) and IAM role ARN.
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.KinesisStreamsInputUpdate] = js.undefined
  /**
    * Name prefix for in-application streams that Amazon Kinesis Analytics creates for the specific streaming source.
    */
  var NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined
}

object InputUpdate {
  @scala.inline
  def apply(
    InputId: Id,
    InputParallelismUpdate: InputParallelismUpdate = null,
    InputProcessingConfigurationUpdate: InputProcessingConfigurationUpdate = null,
    InputSchemaUpdate: InputSchemaUpdate = null,
    KinesisFirehoseInputUpdate: KinesisFirehoseInputUpdate = null,
    KinesisStreamsInputUpdate: KinesisStreamsInputUpdate = null,
    NamePrefixUpdate: InAppStreamName = null
  ): InputUpdate = {
    val __obj = js.Dynamic.literal(InputId = InputId)
    if (InputParallelismUpdate != null) __obj.updateDynamic("InputParallelismUpdate")(InputParallelismUpdate)
    if (InputProcessingConfigurationUpdate != null) __obj.updateDynamic("InputProcessingConfigurationUpdate")(InputProcessingConfigurationUpdate)
    if (InputSchemaUpdate != null) __obj.updateDynamic("InputSchemaUpdate")(InputSchemaUpdate)
    if (KinesisFirehoseInputUpdate != null) __obj.updateDynamic("KinesisFirehoseInputUpdate")(KinesisFirehoseInputUpdate)
    if (KinesisStreamsInputUpdate != null) __obj.updateDynamic("KinesisStreamsInputUpdate")(KinesisStreamsInputUpdate)
    if (NamePrefixUpdate != null) __obj.updateDynamic("NamePrefixUpdate")(NamePrefixUpdate)
    __obj.asInstanceOf[InputUpdate]
  }
}

