package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputUpdate extends js.Object {
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.native
  /**
    * Describes a Kinesis Data Firehose delivery stream as the destination for the output.
    */
  var KinesisFirehoseOutputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseOutputUpdate] = js.native
  /**
    * Describes a Kinesis data stream as the destination for the output.
    */
  var KinesisStreamsOutputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsOutputUpdate] = js.native
  /**
    * Describes an AWS Lambda function as the destination for the output.
    */
  var LambdaOutputUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.LambdaOutputUpdate] = js.native
  /**
    * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
    */
  var NameUpdate: js.UndefOr[InAppStreamName] = js.native
  /**
    * Identifies the specific output configuration that you want to update.
    */
  var OutputId: Id = js.native
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
    val __obj = js.Dynamic.literal(OutputId = OutputId.asInstanceOf[js.Any])
    if (DestinationSchemaUpdate != null) __obj.updateDynamic("DestinationSchemaUpdate")(DestinationSchemaUpdate.asInstanceOf[js.Any])
    if (KinesisFirehoseOutputUpdate != null) __obj.updateDynamic("KinesisFirehoseOutputUpdate")(KinesisFirehoseOutputUpdate.asInstanceOf[js.Any])
    if (KinesisStreamsOutputUpdate != null) __obj.updateDynamic("KinesisStreamsOutputUpdate")(KinesisStreamsOutputUpdate.asInstanceOf[js.Any])
    if (LambdaOutputUpdate != null) __obj.updateDynamic("LambdaOutputUpdate")(LambdaOutputUpdate.asInstanceOf[js.Any])
    if (NameUpdate != null) __obj.updateDynamic("NameUpdate")(NameUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputUpdate]
  }
}

