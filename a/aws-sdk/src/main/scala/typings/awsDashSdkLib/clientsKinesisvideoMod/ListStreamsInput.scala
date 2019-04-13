package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsInput extends js.Object {
  /**
    * The maximum number of streams to return in the response. The default is 10,000.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined
  /**
    * If you specify this parameter, when the result of a ListStreams operation is truncated, the call returns the NextToken in the response. To get another batch of streams, provide this token in your next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a stream name as a condition. 
    */
  var StreamNameCondition: js.UndefOr[StreamNameCondition] = js.undefined
}

object ListStreamsInput {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined,
    NextToken: NextToken = null,
    StreamNameCondition: StreamNameCondition = null
  ): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StreamNameCondition != null) __obj.updateDynamic("StreamNameCondition")(StreamNameCondition)
    __obj.asInstanceOf[ListStreamsInput]
  }
}

