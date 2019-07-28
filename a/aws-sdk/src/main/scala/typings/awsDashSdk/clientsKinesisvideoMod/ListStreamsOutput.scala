package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsOutput extends js.Object {
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.NextToken] = js.undefined
  /**
    * An array of StreamInfo objects.
    */
  var StreamInfoList: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamInfoList] = js.undefined
}

object ListStreamsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StreamInfoList: StreamInfoList = null): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StreamInfoList != null) __obj.updateDynamic("StreamInfoList")(StreamInfoList)
    __obj.asInstanceOf[ListStreamsOutput]
  }
}

