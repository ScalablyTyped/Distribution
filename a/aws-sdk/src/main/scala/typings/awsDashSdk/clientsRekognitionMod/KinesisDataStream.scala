package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisDataStream extends js.Object {
  /**
    * ARN of the output Amazon Kinesis Data Streams stream.
    */
  var Arn: js.UndefOr[KinesisDataArn] = js.native
}

object KinesisDataStream {
  @scala.inline
  def apply(Arn: KinesisDataArn = null): KinesisDataStream = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisDataStream]
  }
}

