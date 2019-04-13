package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDescription extends js.Object {
  /**
    * The data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined
  /**
    * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined
  /**
    * Describes the Kinesis data stream that is configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined
  /**
    * Describes the Lambda function that is configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined
  /**
    * The name of the in-application stream that is configured as output.
    */
  var Name: js.UndefOr[InAppStreamName] = js.undefined
  /**
    * A unique identifier for the output configuration.
    */
  var OutputId: js.UndefOr[Id] = js.undefined
}

object OutputDescription {
  @scala.inline
  def apply(
    DestinationSchema: DestinationSchema = null,
    KinesisFirehoseOutputDescription: KinesisFirehoseOutputDescription = null,
    KinesisStreamsOutputDescription: KinesisStreamsOutputDescription = null,
    LambdaOutputDescription: LambdaOutputDescription = null,
    Name: InAppStreamName = null,
    OutputId: Id = null
  ): OutputDescription = {
    val __obj = js.Dynamic.literal()
    if (DestinationSchema != null) __obj.updateDynamic("DestinationSchema")(DestinationSchema)
    if (KinesisFirehoseOutputDescription != null) __obj.updateDynamic("KinesisFirehoseOutputDescription")(KinesisFirehoseOutputDescription)
    if (KinesisStreamsOutputDescription != null) __obj.updateDynamic("KinesisStreamsOutputDescription")(KinesisStreamsOutputDescription)
    if (LambdaOutputDescription != null) __obj.updateDynamic("LambdaOutputDescription")(LambdaOutputDescription)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OutputId != null) __obj.updateDynamic("OutputId")(OutputId)
    __obj.asInstanceOf[OutputDescription]
  }
}

