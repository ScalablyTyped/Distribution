package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDescription extends js.Object {
  /**
    * Data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined
  /**
    * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined
  /**
    * Describes Amazon Kinesis stream configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined
  /**
    * Describes the AWS Lambda function configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined
  /**
    * Name of the in-application stream configured as output.
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

