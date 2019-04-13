package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsOutput extends js.Object {
  /**
    * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedStreamArn is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedStreamArn is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedStreamArn is empty.
    */
  var LastEvaluatedStreamArn: js.UndefOr[StreamArn] = js.undefined
  /**
    * A list of stream descriptors associated with the current account and endpoint.
    */
  var Streams: js.UndefOr[StreamList] = js.undefined
}

object ListStreamsOutput {
  @scala.inline
  def apply(LastEvaluatedStreamArn: StreamArn = null, Streams: StreamList = null): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    if (LastEvaluatedStreamArn != null) __obj.updateDynamic("LastEvaluatedStreamArn")(LastEvaluatedStreamArn)
    if (Streams != null) __obj.updateDynamic("Streams")(Streams)
    __obj.asInstanceOf[ListStreamsOutput]
  }
}

