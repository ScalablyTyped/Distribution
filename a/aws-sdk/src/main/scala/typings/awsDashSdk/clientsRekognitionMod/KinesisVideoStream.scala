package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisVideoStream extends js.Object {
  /**
    * ARN of the Kinesis video stream stream that streams the source video.
    */
  var Arn: js.UndefOr[KinesisVideoArn] = js.undefined
}

object KinesisVideoStream {
  @scala.inline
  def apply(Arn: KinesisVideoArn = null): KinesisVideoStream = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    __obj.asInstanceOf[KinesisVideoStream]
  }
}

