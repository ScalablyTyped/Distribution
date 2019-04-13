package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProcessorInput extends js.Object {
  /**
    * The Kinesis video stream input stream for the source streaming video.
    */
  var KinesisVideoStream: js.UndefOr[KinesisVideoStream] = js.undefined
}

object StreamProcessorInput {
  @scala.inline
  def apply(KinesisVideoStream: KinesisVideoStream = null): StreamProcessorInput = {
    val __obj = js.Dynamic.literal()
    if (KinesisVideoStream != null) __obj.updateDynamic("KinesisVideoStream")(KinesisVideoStream)
    __obj.asInstanceOf[StreamProcessorInput]
  }
}

