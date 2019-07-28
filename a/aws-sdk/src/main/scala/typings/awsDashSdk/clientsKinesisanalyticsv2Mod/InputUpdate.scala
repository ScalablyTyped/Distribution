package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputUpdate extends js.Object {
  /**
    * The input ID of the application input to be updated.
    */
  var InputId: Id
  /**
    * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputParallelismUpdate] = js.undefined
  /**
    * Describes updates to an InputProcessingConfiguration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfigurationUpdate
  ] = js.undefined
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputSchemaUpdate] = js.undefined
  /**
    * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseInputUpdate] = js.undefined
  /**
    * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN).
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsInputUpdate] = js.undefined
  /**
    * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
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

