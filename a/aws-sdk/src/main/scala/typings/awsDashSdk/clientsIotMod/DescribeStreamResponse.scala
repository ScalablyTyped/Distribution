package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamResponse extends js.Object {
  /**
    * Information about the stream.
    */
  var streamInfo: js.UndefOr[StreamInfo] = js.undefined
}

object DescribeStreamResponse {
  @scala.inline
  def apply(streamInfo: StreamInfo = null): DescribeStreamResponse = {
    val __obj = js.Dynamic.literal()
    if (streamInfo != null) __obj.updateDynamic("streamInfo")(streamInfo)
    __obj.asInstanceOf[DescribeStreamResponse]
  }
}

