package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
}

object CreateStreamOutput {
  @scala.inline
  def apply(StreamARN: ResourceARN = null): CreateStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamOutput]
  }
}

