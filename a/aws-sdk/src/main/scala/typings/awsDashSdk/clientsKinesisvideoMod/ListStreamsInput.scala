package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsInput extends js.Object {
  /**
    * The maximum number of streams to return in the response. The default is 10,000.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.native
  /**
    * If you specify this parameter, when the result of a ListStreams operation is truncated, the call returns the NextToken in the response. To get another batch of streams, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.NextToken] = js.native
  /**
    * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a stream name as a condition. 
    */
  var StreamNameCondition: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamNameCondition] = js.native
}

object ListStreamsInput {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    StreamNameCondition: StreamNameCondition = null
  ): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StreamNameCondition != null) __obj.updateDynamic("StreamNameCondition")(StreamNameCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsInput]
  }
}

