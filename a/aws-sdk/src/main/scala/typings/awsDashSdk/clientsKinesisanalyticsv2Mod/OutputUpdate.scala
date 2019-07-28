package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputUpdate extends js.Object {
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined
  /**
    * Describes a Kinesis Data Firehose delivery stream as the destination for the output.
    */
  var KinesisFirehoseOutputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseOutputUpdate] = js.undefined
  /**
    * Describes a Kinesis data stream as the destination for the output.
    */
  var KinesisStreamsOutputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsOutputUpdate] = js.undefined
  /**
    * Describes an AWS Lambda function as the destination for the output.
    */
  var LambdaOutputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.LambdaOutputUpdate] = js.undefined
  /**
    * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
    */
  var NameUpdate: js.UndefOr[InAppStreamName] = js.undefined
  /**
    * Identifies the specific output configuration that you want to update.
    */
  var OutputId: Id
}

object OutputUpdate {
  @scala.inline
  def apply(
    OutputId: Id,
    DestinationSchemaUpdate: DestinationSchema = null,
    KinesisFirehoseOutputUpdate: KinesisFirehoseOutputUpdate = null,
    KinesisStreamsOutputUpdate: KinesisStreamsOutputUpdate = null,
    LambdaOutputUpdate: LambdaOutputUpdate = null,
    NameUpdate: InAppStreamName = null
  ): OutputUpdate = {
    val __obj = js.Dynamic.literal(OutputId = OutputId)
    if (DestinationSchemaUpdate != null) __obj.updateDynamic("DestinationSchemaUpdate")(DestinationSchemaUpdate)
    if (KinesisFirehoseOutputUpdate != null) __obj.updateDynamic("KinesisFirehoseOutputUpdate")(KinesisFirehoseOutputUpdate)
    if (KinesisStreamsOutputUpdate != null) __obj.updateDynamic("KinesisStreamsOutputUpdate")(KinesisStreamsOutputUpdate)
    if (LambdaOutputUpdate != null) __obj.updateDynamic("LambdaOutputUpdate")(LambdaOutputUpdate)
    if (NameUpdate != null) __obj.updateDynamic("NameUpdate")(NameUpdate)
    __obj.asInstanceOf[OutputUpdate]
  }
}

