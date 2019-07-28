package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
}

object CreateStreamOutput {
  @scala.inline
  def apply(StreamARN: ResourceARN = null): CreateStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    __obj.asInstanceOf[CreateStreamOutput]
  }
}

