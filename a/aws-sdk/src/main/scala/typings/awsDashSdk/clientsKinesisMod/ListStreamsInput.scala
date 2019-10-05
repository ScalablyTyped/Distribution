package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsInput extends js.Object {
  /**
    * The name of the stream to start the list with.
    */
  var ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined
  /**
    * The maximum number of streams to list.
    */
  var Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined
}

object ListStreamsInput {
  @scala.inline
  def apply(ExclusiveStartStreamName: StreamName = null, Limit: Int | Double = null): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartStreamName != null) __obj.updateDynamic("ExclusiveStartStreamName")(ExclusiveStartStreamName)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsInput]
  }
}

