package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamOutput extends js.Object {
  /**
    * An object that describes the stream.
    */
  var StreamInfo: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamInfo] = js.undefined
}

object DescribeStreamOutput {
  @scala.inline
  def apply(StreamInfo: StreamInfo = null): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (StreamInfo != null) __obj.updateDynamic("StreamInfo")(StreamInfo)
    __obj.asInstanceOf[DescribeStreamOutput]
  }
}

