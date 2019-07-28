package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamRequest extends js.Object {
  /**
    * The stream ID.
    */
  var streamId: StreamId
}

object DescribeStreamRequest {
  @scala.inline
  def apply(streamId: StreamId): DescribeStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId)
  
    __obj.asInstanceOf[DescribeStreamRequest]
  }
}

