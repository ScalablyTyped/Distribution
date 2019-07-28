package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchema: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.DestinationSchema
  /**
    * Identifies an Amazon Kinesis Data Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseOutput] = js.undefined
  /**
    * Identifies an Amazon Kinesis data stream as the destination.
    */
  var KinesisStreamsOutput: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsOutput] = js.undefined
  /**
    * Identifies an AWS Lambda function as the destination.
    */
  var LambdaOutput: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.LambdaOutput] = js.undefined
  /**
    * The name of the in-application stream.
    */
  var Name: InAppStreamName
}

object Output {
  @scala.inline
  def apply(
    DestinationSchema: DestinationSchema,
    Name: InAppStreamName,
    KinesisFirehoseOutput: KinesisFirehoseOutput = null,
    KinesisStreamsOutput: KinesisStreamsOutput = null,
    LambdaOutput: LambdaOutput = null
  ): Output = {
    val __obj = js.Dynamic.literal(DestinationSchema = DestinationSchema, Name = Name)
    if (KinesisFirehoseOutput != null) __obj.updateDynamic("KinesisFirehoseOutput")(KinesisFirehoseOutput)
    if (KinesisStreamsOutput != null) __obj.updateDynamic("KinesisStreamsOutput")(KinesisStreamsOutput)
    if (LambdaOutput != null) __obj.updateDynamic("LambdaOutput")(LambdaOutput)
    __obj.asInstanceOf[Output]
  }
}

